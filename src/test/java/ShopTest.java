import Shop.Shop;
import behaviours.ISell;
import instruments.*;
import items.Item;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Drums drums;
    ISell stock;
    Guitar guitar2;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar("Blue", Type.STRINGS, Material.WOOD, 10, 50, "Bang", 4);
        drums = new Drums ("Black", Type.PERCUSSION, Material.STEEL, 50, 220, "Bang!");
        ArrayList<ISell> stock = new ArrayList<ISell>();
        stock.add(guitar);
        stock.add(drums);
        guitar2 = new Guitar("Blue", Type.STRINGS, Material.WOOD, 10, 50, "Bang", 4);
        shop = new Shop(stock, 10);
    }

    @Test
    public void canCalculateStockLevel() {
        assertEquals(2, shop.getStockLevel(), 0.1);
    }

    @Test
    public void canSellInstrument() {
        shop.sellItem(drums);
        assertEquals(1, shop.getStockLevel(), 0.1);
        assertEquals(230, shop.getTill());
    }

    @Test
    public void canBuyItemsAndAddToStock() {
        shop.sellItem(drums); // raises till to 230
        shop.buyItem(guitar2); // guitar costs 10
        assertEquals(2, shop.getStockLevel(), 0.1);
        assertEquals(220, shop.getTill());
    }

    @Test
    public void canGetALoan() {
        shop.getLoan(500);
        assertEquals(510, shop.getTill());
    }

    @Test
    public void canCalculateHowManySales() {
        shop.sellItem(drums);
        assertEquals(1, shop.getNumberOfSales());
    }

    @Test
    public void canCalculateProfit() {
        shop.sellItem(drums);
        assertEquals(170, shop.getProfit());
    }

    @Test
    public void canCalculateMultipleProfits() {
        shop.sellItem(drums);
        shop.sellItem(guitar);
        assertEquals(210, shop.getProfit());
    }

    @Test
    public void canCalculateOneItemMarkup() {
        shop.sellItem(drums);
        assertEquals(34, drums.calculateMarkup(), 0.1);
    }

    @Test
    public void totalPercentageMarkup() {
        shop.buyItem(drums);
        shop.buyItem(guitar);
        assertEquals(37, shop.calculateTotalMarkup(), 0.1);
    }
}


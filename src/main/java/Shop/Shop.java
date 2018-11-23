package Shop;

import behaviours.ISell;
import instruments.Drums;
import instruments.Guitar;
import instruments.Instrument;
import items.Item;

import java.util.ArrayList;

public class Shop {

    ArrayList<ISell> stock;
    ArrayList<Item> notForSaleItems;
    int till;
    int profit;
    int numberOfSales;
    ArrayList<Item> soldItems;
    double markup;


    public Shop(ArrayList<ISell> stock, int till) {
        this.stock = stock;
        this.till = till;
        this.profit = profit;
        this.numberOfSales = numberOfSales;
        this.soldItems = new ArrayList<Item>();
        this.markup = markup;


    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void setStock(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public int getTill() {
        return till;
    }

    public void setTill(int till) {
        this.till = till;
    }

    public double getStockLevel() {
        return stock.size();
    }

    public void sellItem(Item item) {
        this.stock.remove(item);
        this.till += item.getSellingCost();
        this.profit += item.calculateProfit();
        this.numberOfSales += 1;
        this.soldItems.add(item);
    }


    public void buyItem(Item item) {
        this.stock.add(item);
        this.till -= item.getBuyingCost();
    }

    public void getLoan(int amount) {
        this.till += amount;
    }

    public int getNumberOfSales() {
        return numberOfSales;
    }

    public void setNumberOfSales(int numberOfSales) {
        this.numberOfSales = numberOfSales;
    }


    public int setProfit(Item item) {
        return item.getSellingCost() - item.getBuyingCost();
    }


    public int getProfit() {
        return profit;
    }

    public double getMarkup() {
        return markup;
    }

    public void setMarkup(double markup) {
        this.markup = markup;
    }

    public double calculateTotalMarkup() {
        double total = 0;
        for (ISell item : this.getStock()) {
            total += item.calculateMarkup();
        }
        double average = (total/this.getStock().size());
        return average;
    }
}

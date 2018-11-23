package items;

import behaviours.ISell;

public abstract class Item implements ISell {

    private int buyingCost;
    private int sellingCost;

    public Item(int buyingCost, int sellingCost) {
        this.buyingCost = buyingCost;
        this.sellingCost = sellingCost;
    }

    public int getSellingCost() {
        return sellingCost;
    }

    public void setSellingCost(int sellingCost) {
        this.sellingCost = sellingCost;
    }

    public int getBuyingCost() {
        return buyingCost;
    }

    public double calculateMarkup(){
        double markup =  this.calculateProfit()/buyingCost;
        return markup*10;
    }

    public double calculateProfit(){
        return sellingCost - buyingCost;
    }


}

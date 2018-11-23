package items;

public class SheetMusic extends Item {

    private int numberOfPages;


    public SheetMusic(int buyingCost, int sellingCost, int numberOfPages) {
        super(buyingCost, sellingCost);
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}

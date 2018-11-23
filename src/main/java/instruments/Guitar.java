package instruments;

import behaviours.IPlay;

public class Guitar extends Instrument{

    private int numberOfStrings;

    public Guitar(String colour, Type type, Material material, int buyingCost, int sellingCost, String sound, int numberOfStrings) {
        super(colour, type, material, buyingCost, sellingCost, sound);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}

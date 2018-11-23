package instruments;

import behaviours.IPlay;
import behaviours.ISell;
import items.Item;

public abstract class Instrument extends Item implements IPlay, ISell {

    private String colour;
    private Type type;
    private Material material;
    private String sound;


    public Instrument(String colour, Type type, Material material, int buyingCost, int sellingCost, String sound ) {
        super(buyingCost, sellingCost);
        this.colour = colour;
        this.type = type;
        this.material = material;
        this.sound = sound;
    }

    public String getColour() {
        return colour;
    }

    public Type getType() {
        return type;
    }

    public Material getMaterial() {
        return material;
    }

    public String makeSound(){
        return this.sound;
    }
}

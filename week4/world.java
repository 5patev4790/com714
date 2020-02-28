package week4;

import java.util.ArrayList;

public class World {

    // ATTRIBUTES

    private ArrayList<LivingThing> livingThings;

    // constructors

    public World() {
        livingThings = new ArrayList<LivingThing>();
    }

    // Methods

    public void addLivingThing(LivingThing thing) {
        livingThings.add(thing);
    }

    public void display() {
        System.out.println("There are " + livingThings.size() + " living things in the world.");
    }
}
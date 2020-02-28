public class LivingThing {

    // attributes
    private String name;
    private int energy;

    // constructor
    public LivingThing(String nameIn) {
        name = nameIn;
        energy = 100;
    }

    // methods
    public LivingThing breed(LivingThing partner) {
        System.out.println("not sure");
        return null;
    }

    public void eat(int amount) {
        energy = energy + amount;
    }

    public int getEnergy() {
        return energy;
    }

}
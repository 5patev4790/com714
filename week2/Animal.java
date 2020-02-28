public class Animal {

    // attributes (field)
    private int energy;

    // constractor
    public Animal() {
        energy = 10;
    }

    // behaviours (methods)
    public void eat(int amount) {
        energy = energy + amount;
    }

    public void mate(Animal partner) {
        System.out.println("owww");

    }

    public void speak() {
        System.out.println("aah");
    }
}
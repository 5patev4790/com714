package week4;

public class Main {

    public static void main(String[] args) {
        World theWorld = new World();

        Human firstHuman = new Human("First");
        theWorld.addLivingThing(firstHuman);
        theWorld.display();
    }
}
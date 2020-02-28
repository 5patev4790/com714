package week4;
public class Tiger extends Animal {

    public void eat_animal(Animal animalIn) {
        if (animalIn instanceof Elephant) {
            System.out.println("Yummy!");
        } else {
            System.out.println("Eww!");
        }
    }

    @Override
    public void mate(Animal partner) {
        if (partner instanceof Tiger) {
            System.out.println("rarr!");
        } else {
            System.out.println("no thanks!");
        }
    }

    @Override
    public void speak() {
        System.out.println("Roar!");
    }
}

public class Main {

  public static void main(String[] args) {

    // create animal
    Animal theAnimal = new Animal();
    theAnimal.speak();

    // create a Tiger ahd make it speak}
    Tiger theTiger = new Tiger();
    theTiger.speak();

    // create an elephant and make it speak
    Elephant theElephant = new Elephant();
    theElephant.speak();

    // reassing the animal variable
    theAnimal = theTiger;
    theAnimal.speak();

    theAnimal = theElephant;
    theAnimal.speak();

    // make the tiger eat an elephant
    theTiger.eat_animal(theElephant);

    // make the tiger eat a tiger
    theTiger.eat_animal(theTiger);

    // tiger mates with tiger
    theTiger.mate(theTiger);

    // tiger mates with elephant
    theTiger.mate(theElephant);

  }
}

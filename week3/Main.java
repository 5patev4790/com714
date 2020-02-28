public class Main {

    public static void main(String[] args){
        world theworld = new World();

        Human firstHuman = new Human("first Human");
        Human secondHuman =new human("second Human");
     
        theworld.addLivingThing(firsthuman);
        theworld.addLivingThing(secondhuman);

        Human babyhuman = (Human) FirstHuman.breed(secondHuman);

        theworld.addLivingThing(babyHuman);

        Animal FirstAnimal = new Animal("first Animal")

        theworld.addLivingThing(firstAnimal);

        Plant Firstplant = new plant ("first Plant");
        theworld.addLivingThing(Firstplant);
    }

}
public class Elephant extends Animal {

   @Override
   public void mate(Animal partner) {
      if (partner instanceof Elephant) {
         System.out.println("rarr!");
      } else {
         System.out.println("no thanks!");
      }
   }

   @Override
   public void speak() {
      System.out.println("toot!");
   }
}

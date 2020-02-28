package week4;
public class human extends LivingThings {

    // attributes

    // constructor
    public Human (String nameln){
        Super (NameIn);
    }

    // methods
    @override
    public LivingThing breed(LivingThing partner) {
        if (Partner instanceof Human) {
            system.out.println("breeding!!!");
            return new Human("child");
        }

        return null;
    }
}
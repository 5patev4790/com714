class Person {

    // attribute
    private String name;
    private int age;
    private double weight;
    private double height;

    // contructors
    public Person() {
        name = "prins";
        age = 28;
        weight = 60.6;
        height = 5.6;
    }

    public Person(String nameIn, int ageIn, double weightIn, double heightIn) {
        name = nameIn;
        age = ageIn;
        weight = weightIn;
        height = heightIn;
    }

    // behaviours
    public void eat(int amount) {
        weight = weight + amount;
    }

    public String getName() {
        return name;
    }

    public int getAge() {

        return age;
    }

    public void grow(double amount) {
        height = height + amount;
    }

    public static void main(String[] args) {
        Person firstPerson = new Person();

        System.out.println("hello");
        System.out.println(firstPerson.getName());
        Person secondPerson = new Person("John", 60, 58, 5.4);
        System.out.println(secondPerson.getName());
    }

}
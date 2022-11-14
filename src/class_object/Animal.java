package class_object;

public class Animal {

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isCarnivore=" + isCarnivore +
                ", isHerbivore=" + isHerbivore +
                ", isOmnivore=" + isOmnivore +
                '}';

    }

    public Animal(String name, int age, boolean isCarnivore, boolean isHerbivore, boolean isOmnivore) {
        System.out.println("This is 5 args constructor");
        this.name = name;
        this.age = age;
        this.isCarnivore = isCarnivore;
        this.isHerbivore = isHerbivore;
        this.isOmnivore = isOmnivore;


    }

    // Create constructor that takes 2 args -> name and age
    public  Animal(String name, int age){

        System.out.println("This is 2-args constructor ");
        this.name = name;
        this.age = age;


    }

    // Create constructor that take 5 args
    public  static final boolean isExtinct = true;

    public String name;
    public int age;
    public boolean isCarnivore;
    public boolean isHerbivore;
    public boolean isOmnivore;


    public static void main(String[] args) {
    //    Animal a1 = new Animal();
        Animal a2 = new Animal("Dog", 3);
        Animal a3 = new Animal("Cow", 5);
        Animal a4 = new Animal("Cat", 1);
       // System.out.println(a2.name);
       // System.out.println(a2.age);

        Animal a5 = new Animal("Tiger", 10, true, false, false);
        Animal a6 = new Animal("Cow", 10, false, true, false);
        Animal a7 = new Animal("Cat", 2, false, false, true);

        System.out.println("\n---------Print the objects----------\n");
        System.out.println(a5);
        System.out.println(a6);
        System.out.println(a7);

        System.out.println(Animal.isExtinct); //true
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


    }
}




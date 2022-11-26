package oopPractice;

public class Sword {
    // running only ONCE before EVERYTHING
    static{
        System.out.println("Starting the sword making furnace");
    }

    // running everytime when you create object before everything after static code block
    {
        System.out.println("Heating up the furnace");
    }

    // 1. Constructor
    // Default constructor
//    public Sword(){
//
//    }

    // Modified constructor
    public Sword(String material){
        this.material = material; // null = "iron"
    }

    // Modified constructor
    public Sword(double weight, double length, String name, String material){
        this.weight = weight; // assign the value of local variable in the instance variable
        this.length = length;
        this.name = name;
        this.material = material;
    }

    // 2. Instance variables

    // static ones -> belongs to the class, What does every sword has?
    public static final boolean hasHandle = true;
    public static boolean isSharp;

    // non-static -> belongs to the object, What is changing sword by sword?
    public double weight;
    public double length;
    public String name;
    public String material;

    // 3. Methods -> What does a sword do?

    // static ones -> belongs to the class, What does every sword do?
    public static void slash(){
        System.out.println("Sword is slashing");
    }

    public static void damage(){
        if(isSharp) System.out.println("Sword damages more");
        else System.out.println("Sword damages less");
    }

    //non-static ones -> belongs to the object, What does every sword do differently?
    // weight * length = 2 pounds * 10 inches = 20 points
    // weight * length = 10 pounds * 15 inches = 150 points
    public void harms(){
        System.out.println("Sword damages = " + (weight * length) + " points.");
    }

    @Override
    public String toString() {
        return "Sword{" +
                "weight=" + weight +
                ", length=" + length +
                ", name='" + name + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
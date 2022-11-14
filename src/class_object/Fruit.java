package class_object;

public class Fruit {
    public  static boolean hasColor;
    public  boolean isSweet;
    public  String name;
    public  String shape;

    // Instance block is executed for each block
    {
        System.out.println("This is instance block");
    }
    // executed only ones and before anything else  in the same class
    static {
        hasColor = true;
        System.out.println("This is a static block");
    }
}

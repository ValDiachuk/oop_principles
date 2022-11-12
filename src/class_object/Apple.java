package class_object;

public class Apple {

    //default constructor is provided by Java to create zero arg object

    public Apple(){
        // each time you created new object this block will be executed
       // System.out.println("This is default constructor");

    }
    // instance variables - fields -states - attributes

    public String color; // null
    public double price; // 0.0

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", taste='" + taste + '\'' +
                '}';
    }

    public String taste; // null
}

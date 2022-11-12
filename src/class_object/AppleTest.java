package class_object;

public class AppleTest {
    public static void main(String[] args) {

        Apple apple1 = new Apple();
       // Apple apple2 = new Apple();
        Apple apple2 = apple1;
        System.out.println(apple1);
        System.out.println(apple2);

        System.out.println(apple1.color);
        System.out.println(apple1.color);
        System.out.println(apple1.color);


        System.out.println(apple2.color);
        System.out.println(apple2.taste);
        System.out.println(apple2.price);



    }

}

package oopPractice;

public class Test {
    public static void main(String[] args) {
        System.out.println("\nSword1 is created after this line:\n");
        Sword sword1 = new Sword("Iron"); // -> default constructor
        System.out.println("Printing out the sword1 = " + sword1);

        System.out.println("\nSword2 is created after this line:\n");
        Sword sword2 = new Sword(3.5, 15.0, "long sword", "iron"); // -> Modified constructor
        System.out.println("Printing out the sword2 = " + sword2);

        System.out.println("\nSword2 is created after this line:\n");
        Sword sword3 = new Sword(1.2, 3, "big sword", "titanium"); // -> Modified constructor
        System.out.println("Printing out the sword2 = " + sword2);
        Sword.damage();

        System.out.println(Sword.hasHandle);
        System.out.println(Sword.isSharp);
        Sword.isSharp = true;
        System.out.println(Sword.isSharp);
        Sword.damage();

        Sword.slash();

        System.out.println("\nWorking with non-static methods");
        sword1.harms(); //0.0
        sword2.harms(); // 3.5. * 15 = 52.5
        sword3.harms(); // 1.2 * 3 = 3.59999...

    }
}
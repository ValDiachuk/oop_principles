package oop_principles.inheritance;

public class PersonTest {
    public static void main(String[] args) {

        Person p1 = new Person();
        Tester t1 = new Tester();

        p1.eat(); // Person eat
        t1.eat(); // Person eat

        p1.sleep(); // Person sleep
        t1.sleep(); // Person sleep

        p1.sleep(10);
        t1.sleep(10);

        System.out.println(p1);
        System.out.println(t1);










    }
}

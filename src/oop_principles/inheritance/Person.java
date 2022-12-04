package oop_principles.inheritance;

public class Person {

// default constructor is here
    public Person(){}


// 2-args constructor with fName and age
    public Person(String fName, int age) {
        this.fName = fName;
        this.age = age;
    }
// 3-args constructor with fName, age and DOB
    public Person(String fName, int age, String DOB) {
        this(fName, age);
        this.DOB = DOB;
    }
// 4-args constructor DOB and SSN
    public Person(String fName, int age, String DOB, String SSN) {
        this(fName, age, DOB);
        this.SSN = SSN;
    }
    //instance variable

    public String fName;
    protected int age;
    String DOB;
    private String SSN;

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public void eat(){
        System.out.println("Person eat");
    }

    //overload eat method with a String argument
    public void eat (String str){
        System.out.println("Person eats " + str);
    }

    public void sleep(){
        System.out.println("Person sleeps");
    }
    //overload sleep method with int argument
    public void sleep (int hours){
        System.out.println("Person sleeps " + hours + " hours");
    }


// override to string method
    @Override
    public String toString() {
        return "Person{" +
                "fName='" + fName + '\'' +
                ", age=" + age +
                ", DOB='" + DOB + '\'' +
                ", SSN='" + SSN + '\'' +
                '}';
    }
}
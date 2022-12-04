package oop_principles.inheritance;


public class BackendTester extends Tester {

    // 5-arg constructor
    public BackendTester(String fName, int age, String DOB, String SSN, boolean isAutomationTester) {
        super(fName, age, DOB, SSN, isAutomationTester);
    }
}

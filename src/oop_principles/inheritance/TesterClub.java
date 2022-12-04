package oop_principles.inheritance;

public class TesterClub {
    public static void main(String[] args) {

        FrontendTester ft1 = new FrontendTester("Othman", 23, "1993", "000", true);
        BackendTester bt1 = new BackendTester("John", 45, "1982", "111", false);
        FrontendTester ft2 = new FrontendTester("Olena", 29, "1992", "001", false);
        BackendTester bt2 = new BackendTester("Vika", 36, "1991", "131", false);

        Tester[] testers = {ft1, ft2, bt1, bt2}; //Polymorphic array

        /*
        Manual tester - 3
        Automation tester - 1
        Average age - 33
         */

        int manualT = 0;
        int automationT = 0;
        int sumAge = 0;

        for (Tester tester : testers) {
            if(tester.isAutomationTester) automationT++;
            else manualT++;
            sumAge += tester.age;
        }

        System.out.println("Manual = " + manualT);
        System.out.println("Automation = " + automationT);
        System.out.println("Average age = " + sumAge / testers.length);

    }
}

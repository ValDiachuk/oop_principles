package oop_principles.encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Employee_Exercise {
    public static void main(String[] args) {

       /*
        Create 3 companies
        name, address, phone
        Tesla, California, 123
        USBank, Minnesota, 000
        Verizon, Texas, 111

        Create 10 employees
        fullname, jobPosition, age, company
        Andrii, Developer, 25, Tesla
        Yildiz, System Architect, 23, USBank
        Malek, Developer, 30, Verizon
        Saeed, Manager, 35, Verizon
        Samir, Tester, 20, USBank
        Viktoriya, Designer, 30, Tesla
        Ibrahim, Designer, 27, Tesla
        Jeremiah, Scrum Master, 21, USBank
        Olena, Tester, 29, Verizon
        Yoanna, Tester, 23, Tesla
         */

        Company c1 = new Company("Tesla", "California", "123");
        Company c2 = new Company("USBank", "Minnesota", "000");
        Company c3 = new Company("Verizon", "Texas", "111");

        ArrayList<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("Andrii", "Developer", 25, c1),
                new Employee("Yildiz", "System Architect", 23, c2),
                new Employee("Malek", "Developer", 30, c3),
                new Employee("Saeed", "Manager", 35, c3),
                new Employee("Samir", "Tester", 20, c2),
                new Employee("Viktoriya", "Designer", 30, c1),
                new Employee("Ibrahim", "Designer", 27, c1),
                new Employee("Jeremiah", "Scrum Master", 21, c2),
                new Employee("Olena", "Tester", 29, c3),
                new Employee("Yoanna", "Tester", 23, c1)));

        /*
        Write a program to find and report below information in one loop

        Employee numbers for each company
        Tesla = 4
        USBank = 3
        Verizon = 3

        Employee numbers for each position
        Tester = 3
        Developer = 2
        Manager = 1
        Designer = 2
        System Architect = 1
        Scrum Master = 1

        Find youngest
        Youngest tester = Samir with the age of 20
        Youngest developer = Andrii with the age of 25
        Youngest designer = Ibrahim with the age of 27

        Find the company
        Manager = Saeed works at Verizon
        System Architect = Yildiz works at USBank
        Scrum Master = Jeremiah works at USBank
         */

        int teslaEmployees = 0, usbankEmployees = 0, verizonEmployees = 0;
        int tester = 0, developer = 0, manager = 0, designer = 0, systemArchitect = 0, scrumMaster = 0;

        Employee managerEmployee = new Employee();
        Employee systemArchitectEmployee = new Employee();
        Employee scrumMasterEmployee = new Employee();


        for (Employee employee : employees) {
            if (employee.getCompany().getName().equals("Tesla")) teslaEmployees++;
            else if (employee.getCompany().getName().equals("USBank")) usbankEmployees++;
            else verizonEmployees++;

            switch (employee.getJobPosition()) {
                case "Tester":
                    tester++;
                    break;
                case "Developer":
                    developer++;
                    break;
                case "Manager":
                    manager++;
                    break;
                case "Designer":
                    designer++;
                    break;
                case "System Architect":
                    systemArchitect++;
                    break;
                default:
                    scrumMaster++;
                    break;
            }

            if (employee.getJobPosition().equals("Manager")) managerEmployee = employee;
            else if (employee.getJobPosition().equals("System Architect")) systemArchitectEmployee = employee;
            else if (employee.getJobPosition().equals("Scrum Master")) scrumMasterEmployee = employee;

        }

        System.out.println("\n********** Employee numbers for each company **********\n");

        System.out.println("Tesla = " + teslaEmployees);
        System.out.println("USBank = " + usbankEmployees);
        System.out.println("Verizon = " + verizonEmployees);

        System.out.println("\n********** Employee numbers for each position **********\n");

        System.out.println("Testers = " + tester);
        System.out.println("Developers = " + developer);
        System.out.println("Managers = " + manager);
        System.out.println("Designers = " + designer);
        System.out.println("System Architects = " + systemArchitect);
        System.out.println("Scrum Masters = " + scrumMaster);

        System.out.println("\n********* Find the company ***********\n");

        System.out.println("Manager = " + managerEmployee.getFullName() + " works at " + managerEmployee.getCompany().getName());
        System.out.println("System Architect = " + systemArchitectEmployee.getFullName() + " works at " + systemArchitectEmployee.getCompany().getName());
        System.out.println("Scrum Master = " + scrumMasterEmployee.getFullName() + " works at " + scrumMasterEmployee.getCompany().getName());


        System.out.println("\n********* Find youngest ***********\n");

        Employee youngestTester = employees.stream().filter(e -> e.getJobPosition().equals("Tester")).min(Comparator.comparing(Employee::getAge)).get();
        System.out.println("Younger tester = " + youngestTester.getFullName() + " with age of " + youngestTester.getAge());
        Employee youngestDeveloper = employees.stream().filter(e -> e.getJobPosition().equals("Developer")).min(Comparator.comparing(Employee::getAge)).get();
        System.out.println("Younger developer = " + youngestDeveloper.getFullName() + " with age of " + youngestDeveloper.getAge());
        Employee youngestDesigner = employees.stream().filter(e -> e.getJobPosition().equals("Designer")).min(Comparator.comparing(Employee::getAge)).get();
        System.out.println("Younger designer = " + youngestDesigner.getFullName() + " with age of " + youngestDesigner.getAge());

    }
}

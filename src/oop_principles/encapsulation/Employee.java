package oop_principles.encapsulation;

public class Employee {

    public Employee(){}

    public Employee(String fullName, String jobPosition, int age, Company company) {
        this.fullName = fullName;
        JobPosition = jobPosition;
        this.age = age;
        this.company = company;
    }

    private String fullName;
    private String JobPosition;
    private int age;
    private Company company = new Company();

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getJobPosition() {
        return JobPosition;
    }

    public void setJobPosition(String jobPosition) {
        JobPosition = jobPosition;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;


    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", JobPosition='" + JobPosition + '\'' +
                ", age=" + age +
                ", company=" + company +
                '}';
    }
}


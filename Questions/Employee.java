package Lalit.Lalit_java.Questions;

public class Employee {

    String name;
    int id;
    int age;
    String designation;
    String technology;
    double salary;

    public Employee(String name) {
        this.name = name;
    }

    public void empId(int empId) {
        id = empId;
    }

    public void empAge(int empAge) {
        age = empAge;
    }

    public void empDesignation(String empDesig) {
        designation = empDesig;
    }

    public void empTechnology(String empTech) {
        technology = empTech;
    }

    public void empSalary(double empSalary) {
        salary = empSalary;
    }

    public void printEmployee() {
        System.out.println("Name:"+ name );
        System.out.println("Employee Id:"+ id);
        System.out.println("Age:" + age );
        System.out.println("Designation:" + designation );
        System.out.println("Technology:"+ technology);
        System.out.println("Salary:" + salary);
    }
}

class EmployeeAdd {

    public static void main(String args[]) {
        /* Create two objects using constructor */
        Employee empOne = new Employee("Lalit Mohan");
        Employee empTwo = new Employee("Keshav Sharma");

        empOne.empId(12345);
        empOne.empAge(21);
        empOne.empDesignation("Senior Software Engineer");
        empOne.empTechnology("Java");
        empOne.empSalary(100000);
        empOne.printEmployee();

        empTwo.empId(23456);
        empTwo.empAge(22);
        empTwo.empDesignation("Software Engineer");
        empTwo.empTechnology("SQL");
        empTwo.empSalary(50000);
        empTwo.printEmployee();
    }
}


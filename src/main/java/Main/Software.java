package Main;

import Build.Company;
import Build.Employee;

public class Software {
    public static void main (String[] args) {
        Company company1 = new Company("Laundry Enterprise S.L", "F30418818", "971564253", "Street of This");
        Company company2 = new Company("Mice Production Enterprise", "E11415346", "971425967", "Boulevard Avenue nº5");

        Employee employee1 = new Employee("Mateo Rodriguez", "69066941-B", 3400, 41, "680536412", "Street of Nothing nº2");
        Employee employee2 = new Employee("Jack Jackson", "26472930-E", 2900, 26, "681245741", "HighLand Street");
        Employee employee3 = new Employee("Michelle Davidson", "77409790-R", 1500, 52, "681369457", "Queen Mary Street");
        Employee employee4 = new Employee("Murican American", "51156648-W", 980);

        System.out.println("Employee 1 Net Salary is: " + employee1.calculateNetSalary());
        System.out.println("Employee 2 Net Salary is: " + employee2.calculateNetSalary());
        System.out.println("Employee 3 Net Salary is: " + employee3.calculateNetSalary());
        System.out.println("Employee 4 Net Salary is: " + employee4.calculateNetSalary());

        // Example of toString of Employee
        System.out.println("\n");
        System.out.println(employee1.toString());
        System.out.println(employee4.toString());

        System.out.println("******** Company Information Now ********\n\n\n");

        // Adding Employees to the Company
        company1.addEmployee(employee1);
        company1.addEmployee(employee2);
        company1.addEmployee(employee3);
        company1.addEmployee(employee4);

        // Showing Employees Information
        System.out.println("The company has: " + company1.amountOfEmployees() + " total employees");
        System.out.println("The static value is of: " + Company.getEmployees() + "\n");
        company1.showEmployeesInfo();
        System.out.println("\n------------\n");
        System.out.println("The Company " + company1.getCompanyName() + " total gross salary is: " + company1.totalGrossSalary() + " and net salary: " + company1.totalNetSalary());
        System.out.println("Company Information:\n\n");
        System.out.println(company1.toString());

        System.out.println("Now let's try deleting some Employee. For example " + employee2.getEmployeeName());
        company1.deleteEmployee(employee2);
        System.out.println();
        company1.showEmployeesInfo();
        System.out.println(company1.amountOfEmployees());
        System.out.println(Company.getEmployees());
    }
}

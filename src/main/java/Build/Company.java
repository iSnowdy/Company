package Build;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Company {
    private final String companyName;
    private final String CIF;
    private String phoneNumber;
    private String address;
    private static int employees;

    private List<Employee> employeeList;


    public Company(String companyName, String CIF, String phoneNumber, String address) {
        this.companyName = companyName;
        this.CIF = CIF;
        this.phoneNumber = phoneNumber;
        this.address = address;

        this.employeeList = new ArrayList<Employee>();
    }

    // Adding / Deleting Employees given the Object
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
        System.out.println("Employee " + employee.getEmployeeName() + " has been successfully added");
    }

    public void deleteEmployee(Employee employee) {
        System.out.println("Employee " + employee.getEmployeeName() + " has been successfully deleted");
        employeeList.remove(employee);
        employees -= 1; // static update
    }

    public int amountOfEmployees() {
        return employeeList.size();
    }

    public static int getEmployees() {
        return employees;
    }
    public static void setEmployees(int employees) {
        Company.employees += employees;
    }

    public Collection<Employee> getEmployeesList() {
        return employeeList;
    }

    public int totalGrossSalary() {
        int totalGrossSalary = 0;
        for (int i = 0; i < employeeList.size(); i ++) {
            int grossSalary = employeeList.get(i).getGrossSalary();
            totalGrossSalary += grossSalary;
        }
        return totalGrossSalary;
    }

    public int totalNetSalary() {
        int totalNetSalary = 0;
        for (int i = 0; i < employeeList.size(); i ++) {
            int netSalary = employeeList.get(i).getNetSalary();
            totalNetSalary += netSalary;
        }
        return totalNetSalary;
    }

    // Getters and Setters

    public String getCompanyName() {
        return companyName;
    }

    public String getCIF() {
        return CIF;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Prints

    public void showEmployeesInfo() {
        for (int i = 0; i < employeeList.size(); i ++) {
            System.out.println("-------- Employee Number " + i + " Information --------");
            System.out.println(employeeList.get(i).toString());
        }
    }

    public void showSalaries() {
        int salary = 0;
        for (int i = 0; i < employeeList.size(); i ++) {
            salary = employeeList.get(i).getGrossSalary();
            System.out.println("Salary Number " + i + ": " + salary);
        }
    }

    @Override
    public String toString() {
        return
        "Company Name: " + this.getCompanyName() + "\n" +
        "Company CIF: " + this.getCIF() + "\n" +
        "Company Phone Number: " + this.getPhoneNumber() + "\n" +
        "Company Net Salary: " + this.getAddress() + "\n" +
        "Company Total Employee's: " + employees + "\n"
        ;
    }
}
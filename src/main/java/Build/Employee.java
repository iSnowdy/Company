package Build;

public class Employee {
    private final String employeeName;
    private final String DNI;
    private int grossSalary; // Monthly
    private int netSalary;
    private int age;
    private String phoneNumber;
    private String address;


    public Employee(String employeeName, String DNI, int grossSalary) {
        this.employeeName = employeeName;
        this.DNI = DNI;
        this.grossSalary = grossSalary;
        this.netSalary = 0;
        this.age = -1;
        this.phoneNumber = "Unknown";
        this.address = "Unknown";

        Company.setEmployees(1);
    }

    public Employee(String employeeName, String DNI, int grossSalary, int age, String phoneNumber, String address) {
        this.employeeName = employeeName;
        this.DNI = DNI;
        this.grossSalary = grossSalary;
        this.netSalary = 0;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;

        // New Employee added to the Company
        Company.setEmployees(1);
    }

    public int calculateNetSalary() {
        int tax = 0;
        int grossSalaryYearly = this.grossSalary * 12;
        if (grossSalaryYearly < 12000) {
            tax = 20;
            System.out.println("Tax 20");
        } else if (grossSalaryYearly >= 12000 && grossSalaryYearly <= 25000) {
            tax = 30;
            System.out.println("Tax 30");
        } else if (grossSalaryYearly > 25000) {
            tax = 40;
            System.out.println("Tax 40");
        }
        this.netSalary = this.grossSalary * (100 - tax)/100;
        return netSalary;
    }

    // Getters and Setters

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDNI() {
        return DNI;
    }

    public int getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(int grossSalary) {
        this.grossSalary = grossSalary;
    }

    public int getNetSalary() {
        return netSalary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    // Print out message

    @Override
    public String toString() {
        return
         "Employee Name: " + this.getEmployeeName() + "\n" +
         "Employee DNI: " + this.getDNI() + "\n" +
         "Employee Gross Salary: " + this.getGrossSalary() + "\n" +
         "Employee Net Salary: " + this.getNetSalary() + "\n" +
         "Employee Age: " + this.getAge() + "\n" +
         "Employee Phone Number: " + this.getPhoneNumber() + "\n" +
         "Employee Adress: " + this.getAddress() + "\n"
        ;
    }
}

package Hospital.Employee;

public class Employee
{
    private String employeeName ;
    private String employeeDOB;
    private String employeeEmail;
    private String employeeGender;
    private String employeeAddress;
    private String employeeContactNumber;

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeDOB() {
        return employeeDOB;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public String getEmployeeGender() {
        return employeeGender;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public String getEmployeeContactNumber() {
        return employeeContactNumber;
    }

    public static void performduty()
    {
        System.out.println("is performing duty");
    }

    public Employee(String employeeName, String employeeDOB, String employeeEmail, String employeeGender, String employeeAddress, String employeeContactNumber) {
        this.employeeName = employeeName;
        this.employeeDOB = employeeDOB;
        this.employeeEmail = employeeEmail;
        this.employeeGender = employeeGender;
        this.employeeAddress = employeeAddress;
        this.employeeContactNumber = employeeContactNumber;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Name" + employeeName );
        System.out.println("Person Email" + employeeEmail);
        System.out.println("Employee Gender" + employeeGender);
        System.out.println("Employee address" + employeeAddress);
    }
}

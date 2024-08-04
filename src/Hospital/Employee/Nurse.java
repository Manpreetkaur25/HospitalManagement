package Hospital.Employee;

public class Nurse  extends Employee
{
    private String nurseDepartment;
    private String shiftTime;

    public String getNurseDepartment() {
        return nurseDepartment;
    }

    public void setNurseDepartment(String nurseDepartment) {
        this.nurseDepartment = nurseDepartment;
    }

    public String getShiftTime() {
        return shiftTime;
    }

    public void setShiftTime(String shiftTime) {
        this.shiftTime = shiftTime;
    }

    public Nurse(String employeeName, String employeeDOB, String employeeEmail, String employeeGender, String employeeAddress, String employeeContactNumber) {
        super(employeeName, employeeDOB, employeeEmail, employeeGender, employeeAddress, employeeContactNumber);
        
    }

    public static void  performduty()
    {
        System.out.println(" is taking care of patient");
    }


}

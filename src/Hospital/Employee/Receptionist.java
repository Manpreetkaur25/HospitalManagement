package Hospital.Employee;

public class Receptionist extends Employee
{

    private String appointmentSchedule;

    public String getAppointmentSchedule() {
        return appointmentSchedule;
    }

    public Receptionist(String employeeName, String employeeDOB, String employeeEmail, String employeeGender, String employeeAddress, String employeeContactNumber, String appointmentSchedule) {
        super(employeeName, employeeDOB, employeeEmail, employeeGender, employeeAddress, employeeContactNumber);
        this.appointmentSchedule = appointmentSchedule;
    }


    public static void performduty()
    {
        System.out.println("is Managing records/doing billing");
    }

}

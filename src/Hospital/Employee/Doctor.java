package Hospital.Employee;

public class Doctor extends Employee
{
   private int doctorId;
   private String doctorDepartment;
   private String doctorSpeciality;
   private String type;

    public int getDoctorId() {
        return doctorId;
    }

    public String getType()
    {
        return type;
    }
    public String getDoctorDepartment() {
        return doctorDepartment;
    }

    public String getDoctorSpeciality() {
        return doctorSpeciality;
    }

    public Doctor(String employeeName, String employeeDOB, String employeeEmail, String employeeGender, String employeeAddress, String employeeContactNumber, int doctorId, String doctorDepartment, String doctorSpeciality, String type) {
        super(employeeName, employeeDOB, employeeEmail, employeeGender, employeeAddress, employeeContactNumber);
        this.doctorId = doctorId;
        this.doctorDepartment = doctorDepartment;
        this.doctorSpeciality = doctorSpeciality;
        this.type = type;
    }

    @Override
    public void displayEmployeeDetails() {
        System.out.println("Doctor Name : " + getEmployeeName() );
        System.out.println("Doctor Email : " + getEmployeeEmail());
        System.out.println("Doctor Gender : " + getEmployeeGender());
        System.out.println("Doctor address : " + getEmployeeAddress());
    }
 }

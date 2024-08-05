import Hospital.Appointments.Appointment;
import Hospital.Appointments.Patient.Patient;
import Hospital.Employee.Doctor;
import Hospital.Employee.Employee;
import service.AppointmentService;
import service.EmployeeService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> person = new ArrayList<>();
        person.add(new Employee("Ram", "1996/05/05", "ram50@gmail.com", "Male", "Mississauga", "4125563256"));
        person.add(new Doctor("Sam", "1986/05/05", "sam09@gmail.com", "Male", "Toronto", "2589745", 23, "Emergency", "Neuro", "Permanent"));
        EmployeeService.getPersonDetails(person);

        List<Appointment> appointments = new ArrayList<>();
        appointments.add(new Appointment(1, "2024/05/05", "2pm", "Regular Health check up"));
        appointments.add(new Patient(1, "2024/05/05", "5 pm", "Neck pain", 3, "Pumpi", "F", "1998/04/05", "pumpi344@gmail.com", "Mississauga", "4787336525"));
        AppointmentService.getAppointmentDetails(appointments);
    }
}

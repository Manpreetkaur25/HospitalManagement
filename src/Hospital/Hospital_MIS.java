package Hospital;

public class Hospital_MIS
{
    private String hospitalName;
    private String hospitalAddress;
    private String hospitalContactNumber;

    public String getHospitalName() {
        return hospitalName;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public String getHospitalContactNumber() {
        return hospitalContactNumber;
    }

    public Hospital_MIS() {
    }

    public Hospital_MIS(String hospitalName, String hospitalAddress, String hospitalContactNumber) {
        this.hospitalName = hospitalName;
        this.hospitalAddress = hospitalAddress;
        this.hospitalContactNumber = hospitalContactNumber;
    }
}

package Hospital.Admin;

import Hospital.Hospital_MIS;

public class Admin  extends Hospital_MIS
{
    private int adminId;
    private String adminName ;
    private String adminContactNumber;

    public Admin(String hospitalName, String hospitalAddress, String hospitalContactnumber) {
        super(hospitalName, hospitalAddress, hospitalContactnumber);
    }

    public Admin(int adminId, String adminName, String adminContactNumber) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminContactNumber = adminContactNumber;
    }

    public int getAdminId() {
        return adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public String getAdminContactNumber() {
        return adminContactNumber;
    }
}

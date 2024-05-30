public class EmpPersonalInfo {
    private String ename;
    private String emailId;
    private String resaddr;
    private long mobileno;

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getResaddr() {
        return resaddr;
    }

    public void setResaddr(String resaddr) {
        this.resaddr = resaddr;
    }

    public long getMobileno() {
        return mobileno;
    }

    public void setMobileno(long mobileno) {
        this.mobileno = mobileno;
    }

    @Override
    public String toString() {
        return "EmpPersonalInfo [ename=" + ename + ", emailId=" + emailId + ", resaddr=" + resaddr + ", mobileno="
                + mobileno + "]";
    }

    public static void main(String args[]) {
        EmpPersonalInfo employee = new EmpPersonalInfo();
        employee.setEname("Ajay Vasvani");
        employee.setEmailId("ajay203@gmail.com");
        employee.setResaddr("Dubai");
        employee.setMobileno(962574709);

        System.out.println(employee.toString());
    }
}
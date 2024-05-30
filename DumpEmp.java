public class DumpEmp
{
    private String ename;
    private String emailId;
    private String resaddr;
    private int mobileno;

    public void setEname(String ename) 
    {
        this.ename = ename;
    }

    public void setEmailId(String emailId) 
    {
        this.emailId = emailId;
    }

    public void setResaddr(String resaddr) 
    {
        this.resaddr = resaddr;
    }

    public void setMobileno(int mobileno) 
    {
        this.mobileno = mobileno;
    }
    
    public String toString() 
    {
        return "Employee Name: " + ename + ", Email: " + emailId + ", Address: " + resaddr + ", Mobile No: " + mobileno;
    }
    
    public static void main(String[] args)
    {
        DumpEmp de = new DumpEmp();

        de.setEname("Clint");
        de.setEmailId("clint23@gmail.com");
        de.setResaddr("Allahbad");
        de.setMobileno(974736735);

        System.out.println(de);

        DumpEmp ed1 = new DumpEmp();

        ed1.setEname("Kevon");
        ed1.setResaddr("Mumbai");

        System.out.println(ed1);
    }
}
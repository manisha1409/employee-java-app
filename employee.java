package myproject;

public class employee
{
    String fname,
            lname,
            phoneno,
            empid,
            etype,


    dept;

    public employee(String fname,String lname,String phoneno,String empid,String etype,String dept)
    {
        this.fname=fname;
        this.lname=lname;
        this.phoneno=phoneno;
        this.empid=empid;
        this.etype=etype;
        this.dept=dept;
    }

    public void getName()
    {
        System.out.println(this.fname+" " +this.lname);
    }

    public void getType()
    {
        System.out.println(this.etype);
    }
}
package myproject;

import java.util.*;

class employee
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

public class Company
{    //static HashSet<employee> set=new HashSet<employee>();
    static TreeMap<Integer,List<employee>> manager= new TreeMap<Integer,List<employee>>();
 static  List<employee> m1=new ArrayList<employee>();
    static  List<employee> m2=new ArrayList<employee>();
    static  List<employee> m3=new ArrayList<employee>();
   //To enter details of employee
   public static void enter()
    {
        System.out.println("enter details");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first name");
        String fname=sc.nextLine();
        System.out.println("enter last name ");
        String lname=sc.nextLine();
        System.out.println("enter phone no.");
        String phoneno=sc.nextLine();
        System.out.println("enter emplyee id");
        String empid=sc.nextLine();
        System.out.println("enter employee type");
        String etype=sc.nextLine();
        System.out.println("enter employee department");
        String dept=sc.nextLine();
        employee e=new employee(fname,lname,phoneno,empid,etype,dept);
        System.out.println("enter manger id");
        Integer id=sc.nextInt();
        if(id==1)
        {
            m1.add(e);
            manager.put(id,m1);
        }
        else if(id==2)
        {
            m2.add(e);
            manager.put(id,m2);
        }
        else
        {
            m3.add(e);
            manager.put(id,m3);
        }
        System.out.println("object created!");
        System.out.println("name of employee:  ");
        e.getName();
        System.out.println("employee type");
                e.getType();

        //set.add(e);
    }



    //to show details of all employee
    public static void show()
    {
        Set<Map.Entry<Integer, List<employee>>> em =
                manager.entrySet();
        Iterator<Map.Entry<Integer, List<employee>>> iterator =
                em.iterator();

        while(iterator.hasNext()) {

            Map.Entry<Integer, List<employee>> entry = iterator.next();

            System.out.println("\nManager id: "
                    + entry.getKey()
                    + "\nList of Employee and their details under manager "
                    + entry.getKey() + ":");

            try
            {
                for (employee e : entry.getValue())
                {
                    System.out.println("\t\t\t\t\t\t\t" + e.fname + " " + e.lname + " " + e.phoneno + " " + e.empid + " " + e.etype + " " + e.dept);
                }
            }
             catch(NullPointerException e)
            {
                System.out.print("No employee under manager "+ entry.getKey());
            }
        }
        //System.out.println(manager);
    }

    //to delete record of a particular employee
    public static void delete()
    {
        System.out.println("enter manager id for deletion;");
        Scanner sc=new Scanner(System.in);
        final int id=sc.nextInt();
        System.out.println(id);
        manager.put(id,null);

        show();
    }


    // to delete a manager and reassign the associated employees to a new manager
    public static void updateManager()
    {
        System.out.println("enter a manager id for deletion and a manager id to reassign associated employees to a new manager;");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        int newid = sc.nextInt();
        manager.put(id, null);
        if (id == 1 && newid == 2) {
            m2.addAll(m1);
            m1.clear();
        }
        if (id == 1 && newid == 3) {
            m3.addAll(m1);
            m1.clear();
        }
        if (id == 2 && newid == 1) {
            m1.addAll(m2);
            m2.clear();
        }
        if (id == 2 && newid == 3) {
            m3.addAll(m2);
            m2.clear();
        }
        if (id == 3 && newid == 2) {
            m2.addAll(m3);
            m3.clear();
        }
        if (id == 3 && newid == 1) {
            m1.addAll(m3);
            m3.clear();
        }
    }


    //to update record of a particular employee
    public static void updateEmp()
    {
        System.out.println("enter empid of employee for updation and corresponding manager id;");
        Scanner sc=new Scanner(System.in);
        final String id1=sc.nextLine();
        int id=sc.nextInt();
        if(id==1)
        {
            m1.removeIf((employee f)->{return f.empid.equals(id1);});
            manager.put(1,m1);
        }
        if(id==2)
        {
            m2.removeIf((employee f)->{return f.empid.equals(id1);});
            manager.put(2,m2);
        }
        if(id==3)
        {
            m3.removeIf((employee f)->{return f.empid.equals(id1);});
            manager.put(3,m3);
        }
        System.out.println("update the details of employee");
        enter();
    }


    public static void main(String[] args)
    {

        //TreeMap<String,employee> manager2= new TreeMap<String,employee>();

        employee e1=new employee("john","geller","9548376453","101","fresher","a");
        employee e2=new employee("mark","mosby","9874564456","102","experienced","b");
        employee e3=new employee("ted","aldrin","9786556778","103","senior","c");
          m1.add(e1);
          m2.add(e2);
          m3.add(e3);
          manager.put(1,m1);
          manager.put(2,m2);
          manager.put(3,m3);
        Scanner sc=new Scanner(System.in);
        int option=1;
        while(option!=6) {
            System.out.println("Choose an option");
            System.out.println("1.enter\n2.show\n3.delete\n4.update manager record\n5.update employee record\n6.exit");
            //option = sc.nextInt();
            try {
                option = sc.nextInt();
                if (option == 1) enter();
                else if (option == 2) show();
                else if (option == 3) delete();
                else if (option == 4) updateManager();
                else if (option == 5) updateEmp();
            } catch (InputMismatchException e) {
                System.out.println("Wrong input format");
                break;
            }
        }



    }
}

package myproject;

import java.util.Scanner;

public class updateEmp {

    //to update record of a particular employee
    public static void updateEmp()
    {
        System.out.println("enter empid of employee for updation and corresponding manager id;");
        Scanner sc=new Scanner(System.in);
        final String ID_1=sc.nextLine();
        int id=sc.nextInt();
        if(id==1)
        {
            Company.m1.removeIf((employee f)->{return f.empid.equals(ID_1);});
            Company.manager.put(1,Company.m1);
        }
        if(id==2)
        {
           Company. m2.removeIf((employee f)->{return f.empid.equals(ID_1);});
            Company.manager.put(2,Company.m2);
        }
        if(id==3)
        {
            Company.m3.removeIf((employee f)->{return f.empid.equals(ID_1);});
            Company.manager.put(3,Company.m3);
        }
        System.out.println("update the details of employee");
        create.enter();
    }
}

package myproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class create {

    //To enter details of employee

    static class typeException extends Exception
    {
        public typeException(String s)
        {
            // Call constructor of parent Exception
            super(s);
        }

    }

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
        String etype="fresher";
        System.out.println("enter employee type:fresher,experienced or senior");

        String e1 = sc.nextLine();
        try {
            if (!(e1.equals("fresher") || e1.equals("experienced") || e1.equals("senior")))
                throw new typeException("wrong choice");
            else
                etype=e1;
        } catch (typeException t) {
            System.out.println(t.getMessage());
            System.out.println("default(fresher) selected");

        }
        String dept="A";
        System.out.println("enter employee department:A, B or C");
        String d=sc.nextLine();
        try {
            if (!(d.equals("A") || d.equals("B") || d.equals("C")))
                throw new typeException("wrong choice");
            else
                dept=d;
        } catch (typeException t) {
            System.out.println(t.getMessage());
            System.out.println("wrong type.default(A) selected");

        }
        employee e=new employee(fname,lname,phoneno,empid,etype,dept);
        int opt=1;
        List<Integer> mlist= new ArrayList<Integer>();
        while(opt!=2) {
            System.out.println("1.enter manager info?\n2.exit");
            opt = sc.nextInt();
            if (opt == 1)
            {
                System.out.println("enter manger id");
                Integer id = sc.nextInt();
                if (id == 1) {
                   Company.m1.add(e);
                    Company.manager.put(id, Company.m1);
                } else if (id == 2) {
                   Company.m2.add(e);
                    Company.manager.put(id, Company.m2);
                } else {
                    Company.m3.add(e);
                    Company.manager.put(id, Company.m3);
                }
                mlist.add(id);
                Company.eManList.put(empid,mlist);
            }
        }
        System.out.println("object created!");
        System.out.println("name of employee:  ");
        e.getName();
        System.out.println("employee type");
        e.getType();

        //set.add(e);
    }
}

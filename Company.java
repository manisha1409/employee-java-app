package myproject;

import java.util.*;



public class Company
{    //static HashSet<employee> set=new HashSet<employee>();
    static TreeMap<Integer,List<employee>> manager= new TreeMap<Integer,List<employee>>();
    static TreeMap<String,List<Integer>> eManList=new TreeMap<String,List<Integer>>();
 static  List<employee> m1=new ArrayList<employee>();    //list of employee working under manager 1
    static  List<employee> m2=new ArrayList<employee>();   //list of employee working under manager 2
    static  List<employee> m3=new ArrayList<employee>();    // //list of employee working under manager 3















    public static void main(String[] args)
    {

        //TreeMap<String,employee> manager2= new TreeMap<String,employee>();

        employee e1=new employee("john","geller","9548376453","101","fresher","A");
        employee e2=new employee("mark","mosby","9874564456","102","experienced","B");
        employee e3=new employee("ted","aldrin","9786556778","103","senior","C");
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
            System.out.println("1.enter\n2.show\n3.delete\n4.update manager record\n5.update employee record\n6.see employee and their manger details\n7.exit");
            //option = sc.nextInt();
            try {
                option = sc.nextInt();
                if (option == 1) create.enter();
                else if (option == 2) display.show();
                else if (option == 3) remove.delete();
                else if (option == 4) updateManager.updateManager();
                else if (option == 5) updateEmp.updateEmp();
                else if(option==6) emandetails.emandetails();

            } catch (InputMismatchException e) {
                System.out.println("Wrong input format");
                break;
            }

        }




    }
}

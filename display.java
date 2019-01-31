package myproject;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class display {

    //to show details of all employee
    public static void show()
    {
        Set<Map.Entry<Integer, List<employee>>> em =
                Company.manager.entrySet();
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
}

package myproject;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class emandetails {
    public static void emandetails()
    {
        Set<Map.Entry<String, List<Integer>>> em =
                Company.eManList.entrySet();
        Iterator<Map.Entry<String, List<Integer>>> iterator =
                em.iterator();
        //eManList is a map which stores the id of all managers associated with a particular employee.
        while (iterator.hasNext()) {

            Map.Entry<String, List<Integer>> entry = iterator.next();

            System.out.println("\nEmployee id: "
                    + entry.getKey()
                    + "\nList of managerid for  employee id "
                    + entry.getKey() + ":");
            for (Integer e : entry.getValue())
                System.out.println(e);


        }
    }

}

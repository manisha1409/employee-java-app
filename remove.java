package myproject;

import java.util.Scanner;

public class remove {

    public static void delete()
    {
        System.out.println("enter manager id for deletion;");
        Scanner sc=new Scanner(System.in);
        final int id=sc.nextInt();
        System.out.println(id);
        Company.manager.put(id,null);

        display.show();
    }

}

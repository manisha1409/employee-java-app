package myproject;

import java.util.Scanner;

public class updateManager {

    // to delete a manager and reassign the associated employees to a new manager
    public static void updateManager()
    {
        System.out.println("enter a manager id for deletion and a manager id to reassign associated employees to a new manager;");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        int newid = sc.nextInt();
        Company.manager.put(id, null);
        if (id == 1 && newid == 2) {
            Company.m2.addAll(Company.m1);
            Company.m1.clear();
        }
        if (id == 1 && newid == 3) {
            Company.m3.addAll(Company.m1);
            Company.m1.clear();
        }
        if (id == 2 && newid == 1) {
            Company.m1.addAll(Company.m2);
            Company.m2.clear();
        }
        if (id == 2 && newid == 3) {
            Company.m3.addAll(Company.m2);
            Company.m2.clear();
        }
        if (id == 3 && newid == 2) {
            Company.m2.addAll(Company.m3);
            Company.m3.clear();
        }
        if (id == 3 && newid == 1) {
            Company.m1.addAll(Company.m3);
            Company.m3.clear();
        }
    }
}

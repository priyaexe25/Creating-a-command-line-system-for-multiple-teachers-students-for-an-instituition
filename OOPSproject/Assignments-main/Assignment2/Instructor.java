package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Instructor{
    Scanner scan = new Scanner(System.in);
    private String i_id;
    public String get_iid(){
        return i_id;
    }
    public void set_iid(String z){      //z will be = s_id
        i_id=z;
    }
    public void ids(){

    }
    public Instructor(){}               //constructor for calling menu
    public Instructor(String z){            //constructor for obj
        get_iid();
        set_iid(z);
        Main.idata.add(i_id);
    }

    public void Instructor_Menu() {
        classMaterial cm= new classMaterial();
        Assessments am=new Assessments();
        //Quiz qz= new Quiz();
        Forum f=new Forum();

        int m = 0;
        String menu = "INSTRUCTOR MENU\r\n" + "1. Add Class materials\r\n" + "2. Add Assessments\r\n" + "3. View Lecture materials\r\n" + "4. View Assessments\r\n" + "5. Grade assessments\r\n" + "6. Close Assessments\r\n" + "7. View Comments\r\n" + "8. Add comments\r\n" + "9. Logout\r\n";
        while (m != 9) {
            System.out.println("Welcome "+Main.User);
            System.out.println(menu);

            m = scan.nextInt();
            if (m == 1) {
                cm.add();
//                System.out.println(Main.cMaterial_s);

            } else if (m == 2) {
                am.add();
//                Scanner s= new Scanner(System.in);
//                int n = 0;
//                String menu1 = "1. Add assignment\r\n" + "2. Add quiz\r\n";
//                while (n != 3) {
//                    System.out.println(menu1);
//                    n = s.nextInt();
//                    if (n == 1) {
//                        am.add();
//
//
//                    } else if (n == 2) {
//                        qz.add();
//
//                    }


//                }
            } else if (m == 3) {
                    cm.view();

            } else if (m == 4) {
                    am.view();
//                System.out.println("---------------");
//                    qz.view();
            } else if (m == 5) {

            } else if (m == 6) {

            } else if (m == 7) {
                    f.view();
            } else if (m == 8) {
                    f.add();
            } else if (m == 9) {
                //System.out.println("Logging out");

            } else{
                System.out.println("Incorrect input");
            }
        }
    }



}


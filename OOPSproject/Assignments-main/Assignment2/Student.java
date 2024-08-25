package com.company;
import java.util.*;

public class Student {
    Scanner scan1= new Scanner(System.in);
    private String s_id;
    public String get_sid(){
        return s_id;
    }
    public void set_sid(String z){      //z will be = s_id
        s_id=z;
    }
    public Student(){}          //constructor for calling menu
    public Student(String z){       //constructor for creating obj
        get_sid();
        set_sid(z);
        Main.sdata.add(s_id);
    }


    public void Student_Menu() {
        int m = 0;
        classMaterial cm= new classMaterial();
        Assessments am=new Assessments();
        //Quiz qz= new Quiz();
        Forum f=new Forum();

        String menu = "STUDENT MENU\r\n" + "1. View lecture materials\r\n" + "2. View Assessments\r\n" + "3. Submit assessments\r\n" + "4. View Grades\r\n" + "5. View comments\r\n" + "6. Add comments\r\n" +  "7. Logout\r\n";
        while (m < 6) {
            System.out.println("Welcome "+Main.User);
            System.out.println(menu);
            m = scan1.nextInt();
            if (m == 1) {
                cm.view();

            } else if (m == 2) {
                am.view();
//                qz.view();
            } else if (m == 3) {
                  am.submit_assessment();
            } else if (m == 4) {

            } else if (m == 5) {
                f.view();
            } else if (m == 6) {
                f.add();
            } else if (m == 7) {

            }else {
                System.out.println("Incorrect input");
            }
        }
    }
    public void add_Student0(){
        get_sid();

        set_sid("S0");
        Main.sdata.add(s_id);
    }
    public void add_Student1(){
        get_sid();

        set_sid("S1");
        Main.sdata.add(s_id);
    }
    public void add_Student2() {
        get_sid();

        set_sid("I0");
        Main.sdata.add(s_id);
    }
}

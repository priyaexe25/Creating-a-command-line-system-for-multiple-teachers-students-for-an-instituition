package com.company;
import java.util.*;
import java.util.Random;
import java.util.Scanner;




public class Main {
    static String User;
    public static String user(String n){
        User=n;
        return User;
    }

    static ArrayList<String> sdata = new ArrayList();
    static ArrayList<String> idata = new ArrayList();
    static ArrayList<classMaterial> cMaterial_s = new ArrayList();  //arraylist of slide content
    static ArrayList<classMaterial> cMaterial_v = new ArrayList();  //arraylist of video contents
    static ArrayList<Assessments> assignment=new ArrayList();
    static ArrayList<Assessments> assignment1=new ArrayList();
    static ArrayList<Assessments> quiz =new ArrayList();
    static ArrayList<Assessments> quiz1 =new ArrayList();
    static ArrayList<Forum> discussions=new ArrayList();


    public static <string> void main(String[] args) {

        Student st= new Student();
        Student st1=new Student("S0");
        Student st2=new Student("S1");
        Student st3=new Student("S2");

        Instructor in= new Instructor();
        Instructor in1= new Instructor("I0");
        Instructor in2= new Instructor("I1");

//        in.get_iid();
//        in.set_iid("I0");
//        idata.add(in.get_iid());
//        in.get_iid();
//        in.set_iid("I1");
//        idata.add(in.get_iid());
        Scanner s = new Scanner(System.in);
        int n = 0;
        String menu = "WELCOME TO BACKPACK\r\n" + "1. Enter as Instructor\r\n" + "2. Enter as Student\r\n" + "3. Exit\r\n" ;
        while (n != 3) {
            System.out.println(menu);
            n=s.nextInt();
            if (n == 1) {
                System.out.println(idata);
                System.out.println("0-"+ idata.get(0));
                System.out.println("1-"+ idata.get(1));
                System.out.println("Chose id");
                int iid=s.nextInt();

                if( iid==idata.indexOf("I0")){
                    System.out.println("Welcome "+ idata.get(0));
                    Main.user(idata.get(0));
                    in.Instructor_Menu();
                } else if (iid==idata.indexOf("I1")){
                    System.out.println("Welcome "+ idata.get(1));
                    Main.user(idata.get(1));
                    in.Instructor_Menu();
                } else{
                    System.out.println("Incorrect input");
                }




            } else if (n == 2) {
                //System.out.println(sdata);
                System.out.println("0-"+ sdata.get(0));
                System.out.println("1-"+ sdata.get(1));
                System.out.println("2-"+ sdata.get(2));
                System.out.println("Chose id");
                int sid=s.nextInt();
////                String x="abcd.mp4";
//                String extension=x.substring(x.lastIndexOf("."));
//                System.out.println(extension);



                    if (sid==sdata.indexOf("S0") ){
                        System.out.println("Welcome "+ sdata.get(0));
                        Main.user(sdata.get(0));
                        st.Student_Menu();
                    }else if(sid==sdata.indexOf("S1")) {
                        System.out.println("Welcome "+ sdata.get(1));
                        Main.user(sdata.get(1));
                        st.Student_Menu();
                    }else if(sid==sdata.indexOf("S2")){
                        System.out.println("Welcome "+ sdata.get(2));
                        Main.user(sdata.get(2));
                        st.Student_Menu();
                    }
                    else{
                        System.out.println("incorrect input");
                    }




            } else if (n == 3) {
                break;
            } else {
                System.out.println("Incorrect input");

            }


        }


    }
}



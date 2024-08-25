package com.company;

import java.util.Date;
import java.util.Scanner;

public class Assessments implements Subject {
    Scanner s = new Scanner(System.in);
    private String p_statement;
    private String ques;
    private int marks;
    private String User;
    private int aindex;
    private int qindex;


    public String toString() {
        return p_statement + " " + ques + " " + marks + " "+User+" "+aindex+" "+qindex;
    }
    public int getAindex(){
        return aindex;
    }
    public void setAindex(int index){
        aindex=index;
    }
    public int getQindex(){
        return qindex;
    }
    public void setQindex(int index){
        qindex=index;
    }
    public String getUser(){
        return User;
    }
    public void setUser(String z){
        User=z;
    }

    public String getP_statement() {
        return p_statement;
    }

    public void setP_statement(String a) {
        p_statement = a;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int b) {
        marks = b;
    }

    public String getQues() {
        return ques;
    }

    public void setQues(String c) {
        ques = c;
    }

    public Assessments() {

    }

    ;                    //constructor for objects of class

    public Assessments(String a, int b,String z) {        //constructor for assignments
        getP_statement();
        setP_statement(a);
        getMarks();
        setMarks(b);
        getUser();
        setUser(z);
    }
    public Assessments(String a, int b,String z,int index) {        //constructor for assignments1 (ID)
        getP_statement();
        setP_statement(a);
        getMarks();
        setMarks(b);
        getUser();
        setUser(z);
        getAindex();
        setAindex(index);
    }

    public Assessments(String b,String z,int k) {      //constructor for quiz
        getQues();
        setQues(b);
        getUser();
        setUser(z);
        getMarks();
        setMarks(k);
    }
    public Assessments(String b,String z,int k,int index) {      //constructor for quiz1 (ID)
        getQues();
        setQues(b);
        getUser();
        setUser(z);
        getMarks();
        setMarks(k);
        getQindex();
        setQindex(index);
    }
        static int wordcount(String string)
        {
            int count=0;

            char ch[]= new char[string.length()];
            for(int i=0;i<string.length();i++)
            {
                ch[i]= string.charAt(i);
                if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
                    count++;
            }
            return count;
        }


        public void add() {
        Scanner s= new Scanner(System.in);
        int n = 0;
        String menu1 = "1. Add assignment\r\n" + "2. Add quiz\r\n";
        while (n != 3) {
            System.out.println(menu1);
            n = s.nextInt();
            if(n==1) {

                Scanner topic3 = new Scanner(System.in);
                System.out.println("Enter problem statement:");
                String a = topic3.nextLine();
                System.out.println("Enter maximum marks");
                int b = topic3.nextInt();
                getP_statement();
                setP_statement(a);
                getMarks();
                setMarks(b);
                String z = Main.User;
                Main.assignment.add(new Assessments(p_statement, marks, z));
            }else if(n==2){
                Scanner topic1 = new Scanner(System.in);
                System.out.println("Enter quiz question:");
                String a = topic1.nextLine();

                getQues();
                setQues(a);
                String z=Main.User;
                int k=1;
                Main.quiz.add(new Assessments(ques,z,1));
//                for(int i=0;i<Main.quiz.size();i++) {
//                    System.out.println(Main.quiz.get(i).ques);
//                }

            }else{
                System.out.println("Incorrect input");
            }
        }


   }


 public void view() {
        int j=0;
    for ( j=0;j<Main.assignment.size();j++) {

        System.out.println("---------------");
        System.out.println("ID: " + j + " Assignment: " + Main.assignment.get(j).p_statement + " Maximum Marks " + Main.assignment.get(j).marks);
        Main.assignment1.add(new Assessments(Main.assignment.get(j).p_statement,Main.assignment.get(j).marks,Main.assignment.get(j).User,j));
        //System.out.println(Main.assignment1);
    }
    int counter=j;

   int x=counter+Main.quiz.size();
        for(counter=j;counter<x;counter++){
            System.out.println("---------------");
            System.out.println("ID: " + counter + " Question: " + Main.quiz.get(counter-j).ques);
            Main.quiz1.add(new Assessments(Main.quiz.get(counter-j).ques,Main.quiz.get(counter-j).marks,Main.quiz.get(counter-j).User,counter));
            //System.out.println(Main.quiz1);
//            System.out.println(Main.assignment.size());
//            System.out.println(Main.quiz.size());

        }






    }


    public void submit_assessment(){
        System.out.println("Pending Assignments");
        int j=0;
        for (j=0;j<Main.assignment.size();j++){
            System.out.println("ID: " + j + " Assignment: " + Main.assignment.get(j).p_statement + " Maximum Marks " + Main.assignment.get(j).marks);
        }
        int counter1=j;
        int x=counter1+Main.quiz.size();
        for(counter1=j;counter1<x;counter1++){
            System.out.println("ID: " + counter1 + " Question: " + Main.quiz.get(counter1-j).ques);


        }
        System.out.println("Enter ID of assessment");
        int id=s.nextInt();
        if (id>=counter1){
            System.out.println("Incorrect ID");
        }else if(id<Main.assignment.size()){
            System.out.println("Enter filename of assignment");
            Scanner name1=new Scanner(System.in);
            String fname=name1.nextLine();
            if (fname.contains(".")) {
                String extension = fname.substring(fname.lastIndexOf("."));
                if (extension.equals(".zip")==true){

                }else{
                    System.out.println("incorrect File type");
                }
            }else{
                System.out.println("Incorrect file name");
            }
        }else{
            System.out.println("One word Solution");
            Scanner word = new Scanner(System.in);
            String string=word.nextLine();
            if (wordcount(string)!=1){
                System.out.println("Incorrect ! Enter only 1 word solution");
            }


        }


    }
}


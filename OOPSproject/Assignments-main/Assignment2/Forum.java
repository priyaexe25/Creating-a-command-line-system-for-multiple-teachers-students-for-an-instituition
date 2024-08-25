package com.company;

import java.util.Date;
import java.util.Scanner;

public class Forum implements Subject {
    private String comments;
    private Date dt;
    private String User;
    public String toString() {
        return comments + " " + dt +" "+User;
    }
    public String getUser(){
        return User;
    }
    public void setUser(String z){
        User=z;
    }
    public Date getDt(){
        return dt;
    }
    public void setDt(Date c){
        dt=c;
    }
    public String getComments(){
        return comments;
    }
    public void setComments(String n){
        comments=n;
    }
    public Forum(){             //Constructor for calling
    }
    public Forum(String n, Date c,String z){
        getComments();
        setComments(n);
        getDt();
        setDt(c);
        getUser();
        setUser(z);
    }



    public void add(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter comment");
        String n=s.nextLine();
        Date date=java.util.Calendar.getInstance().getTime();
        getComments();
        setComments(n);
        getDt();
        setDt(date);
        String z=Main.User;
        Main.discussions.add(new Forum(n,date,z));


    }
    public void view(){
        for(int i=0;i<Main.discussions.size();i++){
            System.out.println(Main.discussions.get(i).comments+ " - "+ Main.discussions.get(i).User);
            System.out.println(Main.discussions.get(i).dt);
        }




















    }











}

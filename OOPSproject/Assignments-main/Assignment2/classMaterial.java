package com.company;
import java.util.Date;
import java.util.Scanner;

public class classMaterial implements Subject{
    Scanner s=new Scanner(System.in);
    private int slide;
private String video;
private String topic;
private String name;
private String User;
private Date dt;
    public String toString() {
        return slide + " " + video + " " + topic +" " + name +" "+dt + " "+User ;
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

public int getSlide(){
    return slide;
}

    public void setSlide(int z){
    slide=z;
    }

public String getVideo(){
    return video;
}

    public void setVideo(String z){
    video=z;
    }

public String getTopic(){
    return topic;
}

    public void setTopic(String z){
    topic=z;
    }

public String getName(){
    return name;
}

    public void setName(String z){
    name=z;
    }




    public classMaterial(){}                        //constructor for making obj


    public classMaterial(String a, String b, Date c,String z){    // constructor for video lectures
        getTopic();
        setTopic(a);
        getName();
        setName(b);
        getDt();
        setDt(c);
        getUser();
        setUser(z);

    }


    public classMaterial(String a, int b, Date c,String z){              //constructor for lecture slides
    getTopic();
    setTopic(a);
    getSlide();
    setSlide(b);
    getDt();
    setDt(c);
        getUser();
        setUser(z);
    }


    public static void content(int n){
    Scanner content1=new Scanner(System.in);
    String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++){
            System.out.println("Enter Content");
            arr[i]=content1.nextLine();

        }
        for (String element:arr)
        {
            System.out.println(element);
        }

    }



    public void add(){
        int n=0;
        String menu = "1. Enter Lecture Slide\r\n" + "2. Enter Lecture Video\r\n"  ;
        while (n<3){
            System.out.println("Welcome "+Main.User);
            System.out.println(menu);
            n=s.nextInt();
            if (n==1){
                Scanner topic3=new Scanner(System.in);
                System.out.println("Enter topic of slides:");
                String a=topic3.nextLine();
                System.out.println("Enter number of slides");
                int b=topic3.nextInt();
                content(b);




                Date date=java.util.Calendar.getInstance().getTime();
                //System.out.println(date);

                getTopic();
                setTopic(a);
                getSlide();
                setSlide(b);
                String z= Main.User;
//                getUser();
//                setUser();

                Main.cMaterial_s.add(new classMaterial(topic,slide,date,z));
                //System.out.println(Main.cMaterial_s);








            }else if(n==2){
                Scanner topic1=new Scanner(System.in);
                System.out.println("Enter topic of video:");
                String a=topic1.nextLine();
                Scanner topic2=new Scanner(System.in);
                System.out.println("Enter filename of video:");
                String b=topic2.nextLine();
                Date date=java.util.Calendar.getInstance().getTime();
                //System.out.println(date);
                if (b.contains(".")){
                    String extension=b.substring(b.lastIndexOf("."));
                    //System.out.println(extension);
                    if (extension.equals(".mp4")==true) {

                        getTopic();
                        setTopic(a);
                        getName();
                        setName(b);
                        String z= Main.User;
                        Main.cMaterial_v.add(new classMaterial(topic, name, date,z));
                        //System.out.println(Main.cMaterial_v);
//                        for(int i=0;i<Main.cMaterial_v.size();i++){
//                            System.out.println(Main.cMaterial_v.get(i).name);
//                    }
                        }else{

                        System.out.println("Incorrect file name");

                    }
                    }else {

                        System.out.println("Incorrect file name");
                    }

                }





            }


        }




    public void view(){
        for(int i=0;i<Main.cMaterial_s.size();i++) {
            System.out.println("Title: " + Main.cMaterial_s.get(i).topic);
            System.out.println("Number of slides: " + Main.cMaterial_s.get(i).slide);
            System.out.println("Date of upload: " + Main.cMaterial_s.get(i).dt);
            System.out.println("Uploaded by: " + Main.cMaterial_s.get(i).User);

        }
        for (int j = 0; j < Main.cMaterial_v.size(); j++) {
            System.out.println("Title of Video : " + Main.cMaterial_v.get(j).topic);
            System.out.println("Video file: " + Main.cMaterial_v.get(j).name);
            System.out.println("Date of upload: " + Main.cMaterial_v.get(j).dt);
            System.out.println("Uploaded by: " + Main.cMaterial_v.get(j).User);
        }





























    }
}

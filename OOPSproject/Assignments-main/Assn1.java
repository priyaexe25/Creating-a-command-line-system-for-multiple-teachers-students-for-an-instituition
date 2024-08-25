package com.company;
import java.util.*;
import java.util.Random;


public class Slot {
    int day;
    int slot;
    int quantity;
    static ArrayList<Slot> sdata = new ArrayList();
    //Vaccine v=new Vaccine(String v_name, int doses, int gap);
    String vname;
    String h_id;

    public Slot(int day, int slot, int quantity, String vname, String h_id ){

        this.vname=vname;
        this.slot=slot;
        this.quantity=quantity;
        this.h_id=h_id;
    }
    public void add_slot(int day, int slot, int quantity, String vname, String h_id ){
        System.out.println("Slot added for Hospital "+ h_id+ " for Day: "+day+", Available Quantity: "+quantity+" of Vaccine "+vname);
        sdata.add(new Slot(day, slot,  quantity, vname,  h_id));
        Main.main(null);
    }
    static void vaccine_search(String vname) {
        Hospital h_id = null;
        for (int i = 0; i < Hospital.data.size(); i++) {
            if (    sdata.get(i).vname == vname) {
                h_id = Hospital.data.get(i);
            } else {
                System.out.println("No Vaccines by this name");
                Main.main(null);
            }

        }
        System.out.println(h_id);
    }
//    public static void add_hospital(String h_id){
//
//    }


}
package com.company;

public class Vaccine {
    String name;
    int doses;
    int gap;


    public Vaccine(String v_name, int doses, int gap){
        this.name=v_name;
        this.doses=doses;
        this.gap=gap;
    }
    public void add_vaccine(String v_name, int doses, int gap){
        System.out.println("Vaccine Name:  "+ v_name);
        System.out.println("Number of doses:  "+ doses);
        System.out.println("Gap between doses:  "+gap);
        System.out.println("Vaccine Name:  "+ v_name+"Number of doses:  "+ doses+"Gap between doses:  "+gap);
        Main.main(null);
    }

}

public class Hospital {
    String name;
    int pincode;
    String n;
    static ArrayList<Hospital> data = new ArrayList();

    public Hospital(String name_hospital, int pincode, String n) {
        this.name = name_hospital;
        this.pincode = pincode;
        this.n=n;
    }


    public void reg_hospital(String name, int pincode, String n) {
        //System.out.println(data);
        System.out.println("Name of hospital: " + name);
        System.out.println("Pincode: " + pincode);
        System.out.println("Name of hospital: " + name + "Pincode: " + pincode + "Unique ID : " + n);
        String name_hospital = name;
        data.add(new Hospital(name_hospital, pincode, n));
        Main.main(null);
    }
    static String hid;
    static void pincode_search(int pincode) {
        Hospital h_id = null;

        for (int i = 0; i < Hospital.data.size(); i++) {
            if (data.get(i).pincode == pincode) {
                h_id = Hospital.data.get(i);
                hid=Hospital.data.get(i).n;
                System.out.println(hid);
            } else {
                System.out.println("No Vaccination in this area");
                Main.main(null);
            }

        }
        System.out.println(h_id);;
    }

}
public class Citizen {
    static ArrayList ids=new ArrayList();

    String name;
    int age;  //no one under 18 allowed
    int id;     // need 6 digits
    String status;

    ////////////////////////////////////////////////////////////////////

    public Citizen(String name, int age, int id, String status) {
        this.name=name;
        this.age=age;
        this.id=id;
        this.status=status;
        if (ids.contains(id)==true){
            System.out.println("ID already present,please try again!");
        }else {
            ids.add(id);
        }



    }


/////////////////////////////////////////////////////////////////////

    void reg_citizen( String name, int age, int id, String status)
    {


        System.out.println("Citizen Name:"+ name);
        System.out.println("Age:"+ age);
        System.out.println("Unique Id:"+ id);
        System.out.println("Citizen Name: "+ name+" ,Age:"+ age+",Unique Id: "+ id);

        System.out.println(ids);
        Main.main(null);




    }


}


package com.company;
import java.util.*;
import java.util.Random;




public class Main {

    public static <string> void main(String[] args) {
        System.out.println("CoWin Portal Initialized....");
        System.out.println("--------------------------------");
        System.out.println("1. Add Vaccine");
        System.out.println("2. Register Hospital");
        System.out.println("3. Register Citizen");
        System.out.println("4. Add Slot for Vaccination");
        System.out.println("5. Book Slot for Vaccination");
        System.out.println("6. List all slots for a hospital");
        System.out.println("7. Check Vaccination Status");
        System.out.println("8. Exit");
        Scanner scan= new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter your choice");
        int selection = scan.nextInt();
        System.out.println("your choice:"+selection);
            switch (selection) {


                case 1:
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("Vaccine name: ");
                    String v_name= sc3.nextLine();
                    System.out.println("Number of doses");
                    int doses=scan.nextInt();
                    System.out.println("Gap between doses");
                    int gap=scan.nextInt();
                    Vaccine v=new Vaccine(v_name, doses,  gap);
                    v.add_vaccine(v_name, doses,  gap);

                    break;



                    case 2:
                    System.out.println("Enter name");
                    Scanner sc = new Scanner(System.in);
                    String name_hospital = sc.nextLine();
                    System.out.println("Enter pincode");
                    int pincode=scan.nextInt();
                    int len_p = String.valueOf(pincode).length();
                    if (len_p != 6) {
                        System.out.println("Incorrect pincode");
                        System.exit(03);
                    }



                        Random rnd = new Random();
                        int r = rnd.nextInt(999999);
                        String n=String.format("%06d", r);



                    Hospital h = new Hospital(name_hospital,pincode,n);
                    h.reg_hospital(name_hospital,pincode,n);

                    break;



                    case 3:
                    System.out.println("Enter name");
                    Scanner sc1 = new Scanner(System.in);
                    String name = sc1.nextLine();
                    System.out.println("Enter age");
                    int age = scan.nextInt();
                    if (age < 18) {
                        System.out.println("You should be at least 18 years old");
                        System.exit(0);
                    }

                    System.out.println("Enter id");

                    int id = scan.nextInt();
                    int len_id = String.valueOf(id).length();
                    if (len_id != 3) {
                        System.out.println("Incorrect ID");
                        System.exit(0);

                    }
                    String status= "REGISTERED";
                    Citizen obj=new Citizen(name,age,id,status);
                    obj.reg_citizen( name,  age,  id, status);

                    break;


                    case 4:
                        System.out.println("Enter hospital ID");
                        Scanner sc4 = new Scanner(System.in);
                        String h_id=sc4.nextLine();
                        if (h_id.length()!=6){
                            System.out.println("Incorrect ID");
                            System.exit(0);
                        }
                        System.out.println("Enter number of slots to be added");
                        int slot=scan.nextInt();
                        System.out.println("Enter Day number");
                        int day=scan.nextInt();
                        if (day>7){
                            System.out.println("Incorrect input");
                            System.exit(0);
                        }
                        System.out.println("Enter Quantity");
                        int quantity=scan.nextInt();

                        System.out.println("Enter vaccine");
                        System.out.println("0. Covax");
                        System.out.println("1. Covi");
                        //String vname="Name";
                        int selected= scan.nextInt();
                        if (selected==0) {
                            String vname = "Covax";
                            Slot s1= new Slot(day, slot, quantity, vname, h_id);
                            s1.add_slot(day, slot, quantity, vname, h_id);
                            break;
                        }else if(selected==1) {
                            String vname = "Covi";
                            Slot s1= new Slot(day, slot, quantity, vname, h_id);
                            s1.add_slot(day, slot, quantity, vname, h_id);
                            break;
                        }else {

                            System.out.println("Invalid input");
                            //System.exit(0);
                        }


                        break;


                case 5:

                            System.out.println("Enter Unique Patient ID: ");
                            int pid= scan.nextInt();
                            int len_pid = String.valueOf(pid).length();
                            if(len_pid!= 3) {
                            System.out.println("Incorrect ID");
                            System.exit(0);}
                            System.out.println("1. Search By area");
                            System.out.println("2. Search by vaccine");
                            System.out.println("3. Exit");
                            int choice = scan.nextInt();
                            if (choice==1){
                                System.out.println("Enter pincode");
                                pincode=scan.nextInt();
                                len_p = String.valueOf(pincode).length();
                                if (len_p != 6) {
                                    System.out.println("Incorrect pincode");
                                    System.exit(03);
                                }else{
                                    Hospital.pincode_search(pincode);
                                }
//                                System.out.println("Enter hospital ID");
//                                Scanner s6=new Scanner(System.in);
//                                String idh=s6.nextLine();
//                                Hospital.id_search(idh,pincode);

                            }else if(choice==2){
                                System.out.println("Enter Vaccine Name:");
                                Scanner sc5=new Scanner(System.in);
                                v_name=sc5.nextLine();
                                Slot.vaccine_search(v_name);

                            }else if (choice==3){
                                System.exit(0);
                            }

                            break;
                case 6:
                    System.out.print("Hospital ID: ");
                    h_id = scan.nextLine();

                    break;
                case 7:
                    System.out.print("Enter Patient ID: ");
                    pid= scan.nextInt();
                    

                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");


            }




    }
}



            }

        


    }
}

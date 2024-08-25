package com.company;
import java.util.Scanner;

import java.util.ArrayList;

public class Main {
    static ArrayList<Matrix> matrix = new ArrayList();
    static ArrayList<Matrix> Rectangular_matrix = new ArrayList();
    static ArrayList<Matrix> Column_matrix = new ArrayList();
    static ArrayList<Matrix> Row_matrix = new ArrayList();
    static ArrayList<Matrix> Square_matrix = new ArrayList();
    static ArrayList<Matrix> Singleton = new ArrayList();
    static ArrayList<Matrix> Singular = new ArrayList();
    static ArrayList<Matrix> Null = new ArrayList();
    static ArrayList<Matrix> Symmetric = new ArrayList();
    static ArrayList<Matrix> skew_symmetric = new ArrayList();
    static ArrayList<Matrix> identity = new ArrayList();
    static ArrayList<Matrix> diagonal = new ArrayList();
    static ArrayList<Matrix> scalar = new ArrayList();
    static ArrayList<Matrix> ones = new ArrayList();
    static ArrayList<Matrix> lowerTriangle = new ArrayList();
    static ArrayList<Matrix> upperTriangle = new ArrayList();

    public static void main(String[] args) {
        Matrix m = new Matrix();
        Scanner s = new Scanner(System.in);
        int n = 0;
        String menu = "Choose Your Task\r\n"
                + "1. Enter Matrix\r\n"
                + "2. Change element of a matrix\r\n"
                + "3. Display type of a matrix\r\n"
                + "4. Perform operations\r\n"
                + "5. Display Transpose of matrix\r\n"
                + "6. Display inverse\r\n"
                + "7. Compute mean\r\n"
                + "8. Compute Determinant\r\n"
                + "9. Compute A+A^T\r\n"
                + "10. Compute Eigen vectors and values\r\n"
                + "11. Solve linear equations\r\n"
                + "12. Request singleton matrices as scalars\r\n"
                + "13. Display all matrices\r\n";
        while (n < 100) {
            System.out.println(menu);
            n = s.nextInt();
            if (n == 1) {
                m.input();
                //m.type();
            } else if (n == 2) {
                m.display();
                System.out.println("Enter matrix number");
                int k = s.nextInt();
            } else if (n == 3) {
                m.displayall();
                System.out.println("Enter matrix number");
                int m1 = s.nextInt();
                for (int i = 0; i < Main.Square_matrix.size(); i++) {
                        if (Main.Square_matrix.get(i).getId() == m1 ) {
                            System.out.println(Main.Square_matrix.get(i).getLabel());
                        }
                }
                for (int i = 0; i < Main.Rectangular_matrix.size(); i++) {
                    if (Main.Rectangular_matrix.get(i).getId() == m1 ) {
                        System.out.println(Main.Rectangular_matrix.get(i).getLabel());
                    }
                }
                for (int i = 0; i < Main.Column_matrix.size(); i++) {
                    if (Main.Column_matrix.get(i).getId() == m1 ) {
                        System.out.println(Main.Column_matrix.get(i).getLabel());
                    }
                }
                for (int i = 0; i < Main.Row_matrix.size(); i++) {
                    if (Main.Row_matrix.get(i).getId() == m1 ) {
                        System.out.println(Main.Row_matrix.get(i).getLabel());
                    }
                }
                for (int i = 0; i < Main.Symmetric.size(); i++) {
                    if (Main.Symmetric.get(i).getId() == m1 ) {
                        System.out.println(Main.Symmetric.get(i).getLabel());
                    }
                }
                for (int i = 0; i < Main.skew_symmetric.size(); i++) {
                    if (Main.skew_symmetric.get(i).getId() == m1 ) {
                        System.out.println(Main.skew_symmetric.get(i).getLabel());
                    }
                }
                for (int i = 0; i < Main.upperTriangle.size(); i++) {
                    if (Main.upperTriangle.get(i).getId() == m1 ) {
                        System.out.println(Main.upperTriangle.get(i).getLabel());
                    }
                }
                for (int i = 0; i < Main.lowerTriangle.size(); i++) {
                    if (Main.lowerTriangle.get(i).getId() == m1 ) {
                        System.out.println(Main.lowerTriangle.get(i).getLabel());
                    }
                }
                for (int i = 0; i < Main.Singular.size(); i++) {
                    if (Main.Singular.get(i).getId() == m1 ) {
                        System.out.println(Main.Singular.get(i).getLabel());
                    }
                }
                for (int i = 0; i < Main.diagonal.size(); i++) {
                    if (Main.diagonal.get(i).getId() == m1 ) {
                        System.out.println(Main.diagonal.get(i).getLabel());
                    }
                }
                for (int i = 0; i < Main.scalar.size(); i++) {
                    if (Main.scalar.get(i).getId() == m1 ) {
                        System.out.println(Main.scalar.get(i).getLabel());
                    }
                }
                for (int i = 0; i < Main.identity.size(); i++) {
                    if (Main.identity.get(i).getId() == m1 ) {
                        System.out.println(Main.identity.get(i).getLabel());
                    }
                }
                for (int i = 0; i < Main.Singleton.size(); i++) {
                    if (Main.Singleton.get(i).getId() == m1 ) {
                        System.out.println(Main.Singleton.get(i).getLabel());
                    }
                }
                for (int i = 0; i < Main.ones.size(); i++) {
                    if (Main.ones.get(i).getId() == m1 ) {
                        System.out.println(Main.ones.get(i).getLabel());
                    }
                }
                for (int i = 0; i < Main.Null.size(); i++) {
                    if (Main.Null.get(i).getId() == m1 ) {
                        System.out.println(Main.Null.get(i).getLabel());
                    }
                }



            } else if (n == 4) {
                String chose = "Element wise operation?  Enter y/n";

                System.out.println(chose);
                Scanner sc1=new Scanner(System.in);
                String selection= sc1.nextLine();
                if (selection.equals("y")==true){
                    int l=0;
                    String operations = "Element wise operation Task\r\n"
                            + "1. Addition\r\n"
                            + "2. Subtraction\r\n"
                            + "3. multiplication\r\n"
                            + "4. Division\r\n";
                    while (l != 5) {
                        System.out.println(operations);
                        System.out.println("Enter task");
                        l = sc1.nextInt();
                        if (l == 1) {
                            m.displayall();
                            System.out.println("Enter matrix number");
                            int m1 = s.nextInt();
                            m.displayall();
                            System.out.println("Enter matrix number");
                            int m2 = s.nextInt();
                            for (int i = 0; i < Main.matrix.size(); i++) {
                                for (int j = 0; j < Main.matrix.size(); j++) {
                                    if (Main.matrix.get(i).getId() == m1 && Main.matrix.get(j).getId() == m2) {
                                        if (Main.matrix.get(i).getRow() == Main.matrix.get(j).getRow() && Main.matrix.get(i).getColumn() == Main.matrix.get(j).getColumn()) {
                                            m.add(Main.matrix.get(i).getMatrix(), Main.matrix.get(j).getMatrix(), Main.matrix.get(i).getRow(), Main.matrix.get(i).getColumn());
                                        } else {
                                            System.out.println("unequal dimensions");
                                        }


                                    }
                                }
                            }

                        }else if (l == 2) {
                            m.displayall();
                            System.out.println("Enter matrix number");
                            int m1 = s.nextInt();
                            m.displayall();
                            System.out.println("Enter matrix number");
                            int m2 = s.nextInt();
                            for (int i = 0; i < Main.matrix.size(); i++) {
                                for (int j = 0; j < Main.matrix.size(); j++) {
                                    if (Main.matrix.get(i).getId() == m1 && Main.matrix.get(j).getId() == m2) {
                                        if (Main.matrix.get(i).getRow() == Main.matrix.get(j).getRow() && Main.matrix.get(i).getColumn() == Main.matrix.get(j).getColumn()) {
                                            m.subtract(Main.matrix.get(i).getMatrix(), Main.matrix.get(j).getMatrix(), Main.matrix.get(i).getRow(), Main.matrix.get(i).getColumn());
                                        } else {
                                            System.out.println("unequal dimensions");
                                        }


                                    }


                                }
                            }
                        }else if(l==3){

                            m.displayall();
                            System.out.println("Enter matrix number");
                            int m1 = s.nextInt();
                            m.displayall();
                            System.out.println("Enter matrix number");
                            int m2 = s.nextInt();
                            for (int i = 0; i < Main.matrix.size(); i++) {
                                for (int j = 0; j < Main.matrix.size(); j++) {
                                    if (Main.matrix.get(i).getId() == m1 && Main.matrix.get(j).getId() == m2) {
                                        if (Main.matrix.get(i).getRow() == Main.matrix.get(j).getRow() && Main.matrix.get(i).getColumn() == Main.matrix.get(j).getColumn()) {
                                            m.elementmul(Main.matrix.get(i).getMatrix(), Main.matrix.get(j).getMatrix(), Main.matrix.get(i).getRow(), Main.matrix.get(i).getColumn());
                                        } else {
                                            System.out.println("unequal dimensions");
                                        }


                                    }
                                }
                            }


                        } else if(l==4){
                            m.displayall();
                            System.out.println("Enter matrix number");
                            int m1 = s.nextInt();
                            m.displayall();
                            System.out.println("Enter matrix number");
                            int m2 = s.nextInt();
                            for (int i = 0; i < Main.matrix.size(); i++) {
                                for (int j = 0; j < Main.matrix.size(); j++) {
                                    if (Main.matrix.get(i).getId() == m1 && Main.matrix.get(j).getId() == m2) {
                                        if (Main.matrix.get(i).getRow() == Main.matrix.get(j).getRow() && Main.matrix.get(i).getColumn() == Main.matrix.get(j).getColumn()) {
                                            m.elementdiv(Main.matrix.get(i).getMatrix(), Main.matrix.get(j).getMatrix(), Main.matrix.get(i).getRow(), Main.matrix.get(i).getColumn());
                                        } else {
                                            System.out.println("unequal dimensions");
                                        }


                                    }
                                }
                            }

                        }
                        }
                }else if(selection.equals("n")==true){


                    int b = 0;
                    Scanner sc = new Scanner(System.in);
                    String operation = "Choose Your Task\r\n"
                            + "1. Addition\r\n"
                            + "2. Subtraction\r\n"
                            + "3. multiplication\r\n"
                            + "4. Division\r\n";
                    while (b != 5) {
                        System.out.println(operation);
                        System.out.println("Enter task");
                        b = sc.nextInt();
                        if (b == 1) {
                            m.displayall();
                            System.out.println("Enter matrix number");
                            int m1 = s.nextInt();
                            m.displayall();
                            System.out.println("Enter matrix number");
                            int m2 = s.nextInt();
                            for (int i = 0; i < Main.matrix.size(); i++) {
                                for (int j = 0; j < Main.matrix.size(); j++) {
                                    if (Main.matrix.get(i).getId() == m1 && Main.matrix.get(j).getId() == m2) {
                                        if (Main.matrix.get(i).getRow() == Main.matrix.get(j).getRow() && Main.matrix.get(i).getColumn() == Main.matrix.get(j).getColumn()) {
                                            m.add(Main.matrix.get(i).getMatrix(), Main.matrix.get(j).getMatrix(), Main.matrix.get(i).getRow(), Main.matrix.get(i).getColumn());
                                        } else {
                                            System.out.println("unequal dimensions");
                                        }


                                    }
                                }
                            }
                        } else if (b == 2) {
                            m.displayall();
                            System.out.println("Enter matrix number");
                            int m1 = s.nextInt();
                            m.displayall();
                            System.out.println("Enter matrix number");
                            int m2 = s.nextInt();
                            for (int i = 0; i < Main.matrix.size(); i++) {
                                for (int j = 0; j < Main.matrix.size(); j++) {
                                    if (Main.matrix.get(i).getId() == m1 && Main.matrix.get(j).getId() == m2) {
                                        if (Main.matrix.get(i).getRow() == Main.matrix.get(j).getRow() && Main.matrix.get(i).getColumn() == Main.matrix.get(j).getColumn()) {
                                            m.subtract(Main.matrix.get(i).getMatrix(), Main.matrix.get(j).getMatrix(), Main.matrix.get(i).getRow(), Main.matrix.get(i).getColumn());
                                        } else {
                                            System.out.println("unequal dimensions");
                                        }


                                    }


                                }
                            }
                        } else if (b == 3) {
                            m.displayall();
                            System.out.println("Enter matrix number");
                            int m1 = s.nextInt();
                            m.displayall();
                            System.out.println("Enter matrix number");
                            int m2 = s.nextInt();
                            for (int i = 0; i < Main.matrix.size(); i++) {
                                for (int j = 0; j < Main.matrix.size(); j++) {
                                    if (Main.matrix.get(i).getId() == m1 && Main.matrix.get(j).getId() == m2) {
                                        if (Main.matrix.get(i).getColumn() == Main.matrix.get(j).getRow()) {
                                            m.multiply(Main.matrix.get(i).getMatrix(), Main.matrix.get(j).getMatrix(), Main.matrix.get(i).getRow(), Main.matrix.get(j).getRow(), Main.matrix.get(i).getColumn(), Main.matrix.get(j).getColumn());
                                        } else {
                                            System.out.println("unequal dimensions");
                                        }


                                    }


                                }
                            }
                        } else if (b == 4) {
                            m.displayall();
                            System.out.println("Enter matrix number");
                            int m1 = s.nextInt();
                            m.displayall();
                            System.out.println("Enter matrix number");
                            int m2 = s.nextInt();
                            for (int i = 0; i < Main.matrix.size(); i++) {
                                for (int j = 0; j < Main.matrix.size(); j++) {
                                    if (Main.matrix.get(i).getId() == m1 && Main.matrix.get(j).getId() == m2) {
                                        //m.inverse(Main.matrix.get(i).getMatrix(),Main.matrix.get(i).getRow());
                                        if (/*m.inverse(Main.matrix.get(i).getMatrix(),Main.matrix.get(i).getRow(),"no")[0].length*/ Main.matrix.get(i).getRow() == Main.matrix.get(j).getRow()) {
                                            //m.divide(m.inverse(Main.matrix.get(i).getMatrix(),Main.matrix.get(i).getRow(),"no"), Main.matrix.get(j).getMatrix(), m.inverse(Main.matrix.get(i).getMatrix(),Main.matrix.get(i).getRow(),"no").length, Main.matrix.get(j).getRow(), m.inverse(Main.matrix.get(i).getMatrix(),Main.matrix.get(i).getRow(),"no")[0].length, Main.matrix.get(j).getColumn());
                                            m.divide(Main.matrix.get(i).getMatrix(), Main.matrix.get(j).getMatrix(), Main.matrix.get(i).getRow(), Main.matrix.get(j).getRow(), Main.matrix.get(i).getColumn(), Main.matrix.get(j).getColumn());

                                        } else {
                                            System.out.println("unequal dimensions");
                                        }
                                    }
                                }
                            }
                        }


                    }
                }


            } else if (n == 5) {
                m.displayall();
                System.out.println("Enter matrix number");
                int k = s.nextInt();
                for (int i = 0; i < Main.matrix.size(); i++) {
                    if (Main.matrix.get(i).getId() == k) {
                        m.transpose(Main.matrix.get(i).getMatrix(), Main.matrix.get(i).getRow(), Main.matrix.get(i).getColumn(),"yes");

                    }
                }

            } else if (n == 6) {


                m.displayall();
                System.out.println("Enter matrix number");
                int k = s.nextInt();
                for (int i = 0; i < Main.Square_matrix.size(); i++) {

                    if (Main.Square_matrix.get(i).getId() == k) {

                        m.inverse(Main.Square_matrix.get(i).getMatrix(), Main.Square_matrix.get(i).getRow(),"yes");
                    }


                }
                    }else if (n == 7) {
                m.displayall();
                System.out.println("Enter matrix number");
                int k = s.nextInt();
                for (int i = 0; i < Main.matrix.size(); i++) {
                    if (Main.matrix.get(i).getId() == k) {
                        m.mean(Main.matrix.get(i).getMatrix(), Main.matrix.get(i).getRow(), Main.matrix.get(i).getColumn());
                    }
                }

                    } else if (n == 8) {
                        m.displayall();
                        System.out.println("Enter matrix number");
                        int k = s.nextInt();
                        for (int i = 0; i < Main.matrix.size(); i++) {
                            if (Main.matrix.get(i).getId() == k) {
                                if (Main.matrix.get(i).getRow() == Main.matrix.get(i).getColumn()){
                                    System.out.println(m.determinantOfMatrix(Main.matrix.get(i).getMatrix(), Main.matrix.get(i).getRow()));
                                break;
                                //System.out.println("Works");
                            } else {
                                    System.out.println("Must be a square matrix");
                                }
                            }
                        }

                    } else if (n == 9) {
                m.displayall();
                System.out.println("Enter matrix number");
                int m1 = s.nextInt();

                for (int i = 0; i < Main.matrix.size(); i++) {
                    for (int j = 0; j < Main.matrix.size(); j++) {
                        if (Main.matrix.get(i).getId() == m1 ) {
                            m.transpose(Main.matrix.get(i).getMatrix(),Main.matrix.get(i).getRow(),Main.matrix.get(i).getColumn(),"no");
                            //if (Main.matrix.get(i).getRow() == Main.matrix.get(j).getRow() && Main.matrix.get(i).getColumn() == Main.matrix.get(j).getColumn()) {
                                m.add(Main.matrix.get(i).getMatrix(), m.transpose(Main.matrix.get(i).getMatrix(), Main.matrix.get(i).getRow(), Main.matrix.get(i).getColumn(), "no"), Main.matrix.get(i).getRow(), Main.matrix.get(i).getColumn());
                            //}


                        } else {
                            //System.out.println("ID not present");
                        }
                    }
                }

                    } else if (n == 10) {
                m.displayall();
                System.out.println("Enter matrix number");
                int m1 = s.nextInt();
                for (int i = 0; i < Main.matrix.size(); i++) {
                    if (Main.matrix.get(i).getId() == m1) {
                        if (Main.matrix.get(i).getRow()==Main.matrix.get(i).getColumn()){
                            //m.eigenValues(Main.matrix.get(i).getMatrix(),Main.matrix.get(i).getRow());
                            m.eigenVector(Main.matrix.get(i).getMatrix(),Main.matrix.get(i).getRow(),Main.matrix.get(i).getRow());
                    } else{
                            System.out.println("Only input square matrix");
                        }
                    }
                }


                    } else if (n == 11) {
                m.displayall();
                System.out.println("Enter square matrix number");
                int m1 = s.nextInt();
                m.displayall();
                System.out.println("Enter column matrix number");
                int m2 = s.nextInt();
                for (int i = 0; i < Main.matrix.size(); i++) {
                    for (int j = 0; j < Main.matrix.size(); j++) {        //i=index of square and j=index of column
                        if (Main.matrix.get(i).getId() == m1 && Main.matrix.get(j).getId() == m2) {
                            if (Main.matrix.get(i).getRow()==Main.matrix.get(i).getColumn() && Main.matrix.get(j).getColumn()==1){
                                //m.inverse(Main.matrix.get(i).getMatrix(),Main.matrix.get(i).getRow(),"no")
                                if (Main.matrix.get(i).getRow() == Main.matrix.get(j).getRow()) {
                                    m.lin_eqn(Main.matrix.get(i).getMatrix(), Main.matrix.get(j).getMatrix(), Main.matrix.get(i).getRow(),Main.matrix.get(j).getRow(), Main.matrix.get(i).getColumn(),Main.matrix.get(j).getColumn());
                                } else {
                                    System.out.println("unequal dimensions");
                                }
                        }else{
                                System.out.println("1st matrix should be square and 2nd matrix should column");
                            }


                        }
                    }
                }

                    } else if (n == 12) {


                System.out.println("Do you wish to use singleton matrices as scalar?  y/n");
                Scanner s3 = new Scanner(System.in);
                String response = s3.nextLine();
                if (response.equals("y") == true) {
                    int l = 0;
                    String operations = "Scalar operation Task\r\n"
                            + "1. Scalar Multiplication\r\n"
                            + "2. Scalar Division\r\n";
                    System.out.println(operations);
                    System.out.println("Choose task");
                    int p = s.nextInt();
                    wloop : while (l != 3) {

                        if (p == 1) {
                            m.displayall();
                            System.out.println("Enter 1st matrix index");
                            int m2 = s3.nextInt();
                            m.displayall();
                            System.out.println("Enter singleton matrix index ");
                            int m1 = s3.nextInt();
                            for (int i = 0; i < Main.matrix.size(); i++) {
                                for (int j = 0; j < Main.matrix.size(); j++) {
                                    if (Main.matrix.get(i).getId() == m1 && Main.matrix.get(j).getId() == m2) {   //i=index for singleton matrix
                                        if (Main.matrix.get(i).getRow() == 1 && Main.matrix.get(i).getColumn() == 1) {
                                            m.scalar_Mul(Main.matrix.get(j).getMatrix(),Main.matrix.get(i).getMatrix()[0][0],Main.matrix.get(j).getRow(),Main.matrix.get(j).getColumn());
                                        }else{
                                            System.out.println("2nd MATRIX MUST BE A SINGLETON MATRIX");
                                        }

                                    }
                                }
                            } break wloop;

                        } else if(p == 2){
                            m.displayall();
                            System.out.println("Enter non-singleton matrix index");
                            int m2 = s3.nextInt();
                            m.displayall();
                            System.out.println("Enter singleton matrix index ");
                            int m1 = s3.nextInt();
                            for (int i = 0; i < Main.matrix.size(); i++) {
                                for (int j = 0; j < Main.matrix.size(); j++) {
                                    if (Main.matrix.get(i).getId() == m1 && Main.matrix.get(j).getId() == m2) {   //i=index for singleton matrix
                                        if (Main.matrix.get(i).getRow() == 1 && Main.matrix.get(i).getColumn() == 1) {
                                            m.scalar_Div(Main.matrix.get(j).getMatrix(),Main.matrix.get(i).getMatrix()[0][0],Main.matrix.get(j).getRow(),Main.matrix.get(j).getColumn());
                                        }else{
                                            System.out.println("2nd MATRIX MUST BE A SINGLETON MATRIX");
                                        }

                                    }
                                }
                            }break wloop;
                        }
                    }
                }
            }

            else if (n == 13) {
                String display="Choose Matrix to be displayed\r\n"
                        + "1. Square Matrix\r\n"
                        + "2. Rectangular matrix\r\n"
                        + "3. Row matrix\r\n"
                        + "4. Column matrix\r\n"
                        + "5. Null matrix\r\n"
                        + "6. Symmetric matrix\r\n"
                        + "7. Skew symmetric matrix\r\n"
                        + "8. Singular matrix\r\n"
                        + "9. Singleton matrix\r\n"
                        + "10. Ones matrix\r\n"
                        + "11. identity matrix\r\n"
                        + "12. Diagonal matrix\r\n"
                        + "13. Upper triangle matrix\r\n"
                        + "14. Lower triangle matrix\r\n"
                        + "15. Scalar matrix\r\n"
                        + "16. Display all matrices\r\n";
                Scanner sc3=new Scanner(System.in);
                int c=0;
                while (c!=17){
                    System.out.println(display);
                    c=sc3.nextInt();
                    if (c==1){
                        for (int k = 0; k < Main.Square_matrix.size(); k++) {
                            System.out.println(Main.Square_matrix.get(k).getLabel()+" : ");
                            for (int i = 0; i < Main.Square_matrix.get(k).getRow(); i++) {
                                for (int j = 0; j < Main.Square_matrix.get(k).getColumn(); j++) {
                                    System.out.print( "      "+Main.Square_matrix.get(k).getMatrix()[i][j] );
                                }
                                System.out.println();
                            }
                        }
                    } else if(c==2){
                        for (int k = 0; k < Main.Rectangular_matrix.size(); k++) {
                            System.out.println(Main.Rectangular_matrix.get(k).getLabel()+" : ");
                            for (int i = 0; i < Main.Rectangular_matrix.get(k).getRow(); i++) {
                                for (int j = 0; j < Main.Rectangular_matrix.get(k).getColumn(); j++) {
                                    System.out.print( "      "+Main.Rectangular_matrix.get(k).getMatrix()[i][j] );
                                }
                                System.out.println();
                            }
                        }
                    }else if(c==3){
                        for (int k = 0; k < Main.Row_matrix.size(); k++) {
                            System.out.println(Main.Row_matrix.get(k).getLabel()+" : ");
                            for (int i = 0; i < Main.Row_matrix.get(k).getRow(); i++) {
                                for (int j = 0; j < Main.Row_matrix.get(k).getColumn(); j++) {
                                    System.out.print( "      "+Main.Row_matrix.get(k).getMatrix()[i][j] );
                                }
                                System.out.println();
                            }
                        }
                    }else if(c==4){
                        for (int k = 0; k < Main.Column_matrix.size(); k++) {
                            System.out.println(Main.Column_matrix.get(k).getLabel()+" : ");
                            for (int i = 0; i < Main.Column_matrix.get(k).getRow(); i++) {
                                for (int j = 0; j < Main.Column_matrix.get(k).getColumn(); j++) {
                                    System.out.print( "      "+Main.Column_matrix.get(k).getMatrix()[i][j] );
                                }
                                System.out.println();
                            }
                        }
                    }else if(c==5){
                        for (int k = 0; k < Main.Null.size(); k++) {
                            System.out.println(Main.Null.get(k).getLabel()+" : ");
                            for (int i = 0; i < Main.Null.get(k).getRow(); i++) {
                                for (int j = 0; j < Main.Null.get(k).getColumn(); j++) {
                                    System.out.print( "      "+Main.Null.get(k).getMatrix()[i][j] );
                                }
                                System.out.println();
                            }
                        }
                    }else if(c==6){
                        for (int k = 0; k < Main.Symmetric.size(); k++) {
                            System.out.println(Main.Symmetric.get(k).getLabel()+" : ");
                            for (int i = 0; i < Main.Symmetric.get(k).getRow(); i++) {
                                for (int j = 0; j < Main.Symmetric.get(k).getColumn(); j++) {
                                    System.out.print( "      "+Main.Symmetric.get(k).getMatrix()[i][j] );
                                }
                                System.out.println();
                            }
                        }
                    }else if(c==7){
                        for (int k = 0; k < Main.skew_symmetric.size(); k++) {
                            System.out.println(Main.skew_symmetric.get(k).getLabel()+" : ");
                            for (int i = 0; i < Main.skew_symmetric.get(k).getRow(); i++) {
                                for (int j = 0; j < Main.skew_symmetric.get(k).getColumn(); j++) {
                                    System.out.print( "      "+Main.skew_symmetric.get(k).getMatrix()[i][j] );
                                }
                                System.out.println();
                            }
                        }
                    }else if(c==8){
                        for (int k = 0; k < Main.Singular.size(); k++) {
                            System.out.println(Main.Singular.get(k).getLabel()+" : ");
                            for (int i = 0; i < Main.Singular.get(k).getRow(); i++) {
                                for (int j = 0; j < Main.Singular.get(k).getColumn(); j++) {
                                    System.out.print( "      "+Main.Singular.get(k).getMatrix()[i][j] );
                                }
                                System.out.println();
                            }
                        }
                    }else if(c==9){
                        for (int k = 0; k < Main.Singleton.size(); k++) {
                            System.out.println(Main.Singleton.get(k).getLabel()+" : ");
                            for (int i = 0; i < Main.Singleton.get(k).getRow(); i++) {
                                for (int j = 0; j < Main.Singleton.get(k).getColumn(); j++) {
                                    System.out.print( "      "+Main.Singleton.get(k).getMatrix()[i][j] );
                                }
                                System.out.println();
                            }
                        }
                    }else if(c==10){
                        for (int k = 0; k < Main.ones.size(); k++) {
                            System.out.println(Main.ones.get(k).getLabel()+" : ");
                            for (int i = 0; i < Main.ones.get(k).getRow(); i++) {
                                for (int j = 0; j < Main.ones.get(k).getColumn(); j++) {
                                    System.out.print( "      "+Main.ones.get(k).getMatrix()[i][j] );
                                }
                                System.out.println();
                            }
                        }
                    }else if(c==11){
                        for (int k = 0; k < Main.identity.size(); k++) {
                            System.out.println(Main.identity.get(k).getLabel()+" : ");
                            for (int i = 0; i < Main.identity.get(k).getRow(); i++) {
                                for (int j = 0; j < Main.identity.get(k).getColumn(); j++) {
                                    System.out.print( "      "+Main.identity.get(k).getMatrix()[i][j] );
                                }
                                System.out.println();
                            }
                        }
                    }else if(c==12){
                        for (int k = 0; k < Main.diagonal.size(); k++) {
                            System.out.println(Main.diagonal.get(k).getLabel()+" : ");
                            for (int i = 0; i < Main.diagonal.get(k).getRow(); i++) {
                                for (int j = 0; j < Main.diagonal.get(k).getColumn(); j++) {
                                    System.out.print( "      "+Main.diagonal.get(k).getMatrix()[i][j] );
                                }
                                System.out.println();
                            }
                        }
                    }else if(c==13){
                        for (int k = 0; k < Main.upperTriangle.size(); k++) {
                            System.out.println(Main.upperTriangle.get(k).getLabel()+" : ");
                            for (int i = 0; i < Main.upperTriangle.get(k).getRow(); i++) {
                                for (int j = 0; j < Main.upperTriangle.get(k).getColumn(); j++) {
                                    System.out.print( "      "+Main.upperTriangle.get(k).getMatrix()[i][j] );
                                }
                                System.out.println();
                            }
                        }
                    }else if(c==14){
                        for (int k = 0; k < Main.lowerTriangle.size(); k++) {
                            System.out.println(Main.lowerTriangle.get(k).getLabel()+" : ");
                            for (int i = 0; i < Main.lowerTriangle.get(k).getRow(); i++) {
                                for (int j = 0; j < Main.lowerTriangle.get(k).getColumn(); j++) {
                                    System.out.print( "      "+Main.lowerTriangle.get(k).getMatrix()[i][j] );
                                }
                                System.out.println();
                            }
                        }
                    }else if(c==15){
                        for (int k = 0; k < Main.scalar.size(); k++) {
                            System.out.println(Main.scalar.get(k).getLabel()+" : ");
                            for (int i = 0; i < Main.scalar.get(k).getRow(); i++) {
                                for (int j = 0; j < Main.scalar.get(k).getColumn(); j++) {
                                    System.out.print( "      "+Main.scalar.get(k).getMatrix()[i][j] );
                                }
                                System.out.println();
                            }
                        }
                    }else if(c==16){
                        m.display();
                    }



                }











            } else {
                        System.out.println("Incorrect input");
                    }


                }
            }
        }



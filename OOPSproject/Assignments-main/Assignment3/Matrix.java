package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    private int row;
    private int column;
    public int count1=0;
    private int count=0;
    private int id;
    private int matrix[][];
    private String label;
    public String toString() {
        return id + " " + matrix + " " + count + " " + row + " "+ column + " " +label;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Matrix(){};          //constructor for calling class


    public Matrix(int matrix[][], int id ,int row, int column,String label){
        getMatrix();
        setMatrix(matrix);
        getId();
        setId(id);
        getRow();
        setRow(row);
        getColumn();
        setColumn(column);
        getLabel();
        setLabel(label);
    }
    public void input() {
        int matrix[][] = new int[3][3];
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter row for the array (max 3) : ");

        int row = scan.nextInt();


        System.out.print("Enter column for the array (max 3) : ");
        int column = scan.nextInt();

        if (row!=0 && column !=0 && row<4 && column<4) {
            System.out.println("Enter " + (row * column) + " Array Elements : ");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    matrix[i][j] = scan.nextInt();
                }
            }
            System.out.print("The Matrix is :\n");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            getCount();
            id = count++;
            getMatrix();
            setMatrix(matrix);
            getId();
            setId(id);
            getRow();
            setRow(row);
            getColumn();
            setColumn(column);
            getLabel();
            setLabel(label);
//        System.out.println("Number of row"+row);
//        System.out.println("Number of column"+column);
            Main.matrix.add(new Matrix(matrix, id, row, column, label));
            type();
        }else
        {
            System.out.println("Cannot be 0 or more than 3 rows and columns");
        }
    }
    public int[][] transpose(int A[][],int row, int column ,String print) {

        int[][] transpose = new int[column][row];    //temp matrix
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                transpose[i][j] = A[j][i];
            }
        }

        // Display transposed matrix
        if (print == "yes") {
            print_transpose(transpose);
        }
        return transpose;
    }




    public void print_transpose(int T[][]){

        System.out.print("Result matrix is \n");
        for (int i = 0; i < column; i++)
        {
            for (int j = 0; j < row; j++)
                System.out.print(T[i][j] + " ");
            System.out.print("\n");
        }

    }


    public boolean symmetric (int mat[][],int row,int column,String label){

        boolean symmetric = true;


        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                //System.out.println(matrix[j][i]);
                if(mat[i][j] != transpose(mat,row,column,"no")[i][j])
                {
                    symmetric = false;
                    break;
                }
            }
        }

        return symmetric;

    }
    public boolean skew_symmetric (int mat[][],int row,int column){


        //int tr[][] = new int[row][100];

        for (int i = 0; i < row; i++)
            for (int j = 0; j < row; j++) {
                if (transpose(mat, row, column, "no")[i][j] != 0) {
                    if (mat[i][j] != -(transpose(mat, row, column, "no")[i][j])) {
                        return false;
                    }
                }else{
                    continue;
                }
            }
        return true;

    }
    public void getCofactor(int matrix[][], int temp[][],
                            int p, int q, int n)
    {

        int i = 0, j = 0;


        for (int row = 0; row < n; row++)
        {
            for (int col = 0; col < n; col++)
            {
                // Copying into temporary matrix

                if (row != p && col != q)
                {
                    temp[i][j++] = matrix[row][col];
                    if (j == n - 1)
                    {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }


    public int determinantOfMatrix(int matrix[][], int n )   //recursion to find determinant
    {
        int D = 0; // Initialize result


        // Base case : if matrix contains single elmnt
        if (n == 1)
            return matrix[0][0];

        // To store cofactors
        int temp[][] = new int[n][n];

        // To store sign multiplier
        int sign = 1;

        // Iterate for each element of first row
        for (int f = 0; f < n; f++)
        {
            // Getting Cofactor of mat[0][f]
            getCofactor(matrix, temp, 0, f, n);
            D += sign * matrix[0][f]
                    * determinantOfMatrix(temp, n - 1);

            // terms are to be added with
            // alternate sign
            sign = -sign;
        }

        return D;
    }
    public int nullMatrix(int matrix[][], int row, int column){

        int Null=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                if(matrix[i][j]!=0)
                {
                    Null=1;
                    break;
                }
            }
            if(Null==1)
                break;
        }
        return Null;
    }
    public int onesMatrix(int matrix[][], int row, int column){

        int Null=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                if(matrix[i][j]!=1)
                {
                    Null=1;
                    break;
                }
            }
            if(Null==1)
                break;
        }
        return Null;
    }
    public int identity(int matrix[][], int row, int column) {

        int flag = 1;
        if(row != column){
            flag=0;
        }
        else {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    if (i == j && matrix[i][j] != 1) {
                        flag = 0;
                        break;
                    }
                    if (i != j && matrix[i][j] != 0) {
                        flag = 0;
                        break;
                    }
                }
            }
        }

        return flag;
    }
    public int diagonal(int matrix[][], int row, int column) {

        int i, j;
        int point = 0;
        if (row!=column){
            return point=1;
        }
        else{

            loop:for (i = 0; i < row; i++) {
                for (j = 0; j < row; j++) {
                    if(i == j) {
                        if(matrix[i][j] == 0)
                        {
                            point = 1;
                            break loop ;
                        }
                    } else if(i != j){
                        if((matrix[i][j] != 0)){
                            point=1;
                            break loop;
                        }
                    }


                }
            }
        }

        return point;

  }
    public int scalar(int matrix[][], int row, int column){

        int point=0;
        int point1=0;
        int point2=0;
        int i,j;
        int x=matrix[0][0];
        loop:for(i=0;i<row;i++)
        {
            for(j=0;j<column;j++)
            {
                if(i!=j && matrix[i][j]!=0)
                {
                    point2=1;
                    break loop;
                }
                if(i==j && (matrix[i][j] ==0 || matrix[i][j] != x))
                {
                    point1=1;
                    break loop;
                }
            }
        }
        if (point1==0 && point2==0){
             point=0;
        }else{
            point=1;
        }
        return point;
    }
    public boolean lowertriangle(int matrix[][],int row,int column){

        if(row!=column){
            return false;
        }
            for (int i = 0; i < row; i++)
                for (int j = i + 1; j < row; j++)
                    if (i!=j && matrix[i][j] != 0)
                        return false;

            return true;
        }
    public boolean isUpperTriangularMatrix(int matrix[][],int row,int column)
    {

        if(row!=column){
            return false;
        }
            for (int i = 1; i < row ; i++)
                for (int j = 0; j < i; j++)
                    if (matrix[i][j] != 0)
                        return false;

        return true;
    }
    public void add(int firstMatrix[][],int secondMatrix[][], int row, int column) {
        int[][] sum = new int[row][column];
        if (row == column) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
                }
            }

            // Displaying the result
            System.out.println("Sum of two matrices is: ");
            for (int[] x : sum) {


                System.out.println(Arrays.toString(x));
            }
        } else {
            System.out.println("incorrect dimension");
        }
    }


    public void subtract(int firstMatrix[][],int secondMatrix[][], int row, int column){
        int[][] difference = new int[row][column];
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                difference[i][j] = firstMatrix[i][j] - secondMatrix[i][j];
            }
        }

        // Displaying the result
        System.out.println("Sum of two matrices is: ");
        for( int[] x : difference) {
            for( int y :x){

            System.out.println(Arrays.toString(x));
        }
        }


    }

    public void adjoint(int A[][],int [][]adj,int row)
    {
        if (row == 1)
        {
            adj[0][0] = 1;
            return;
        }

        // temp is used to store cofactors of A[][]
        int sign = 1;
        int [][]temp = new int[row][row];

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < row; j++)
            {
                // Get cofactor of A[i][j]
                getCofactor(A, temp, i, j, row);

                // sign of adj[j][i] positive if sum of row
                // and column indexes is even.
                sign = ((i + j) % 2 == 0)? 1: -1;

                // Interchanging rows and columns to get the
                // transpose of the cofactor matrix
                adj[j][i] = (sign)*(determinantOfMatrix(temp, row-1));

            }
        }
    }
    //float[][] inverse=new float[3][3];
    public float[][] inverse(int[][] A, int row,String print)
    {
        // Find determinant of A[][]
        float[][] inverse=new float[row][row];
        boolean inv=true;
        int det = determinantOfMatrix(A, row);
        if (det == 0)

        {
            System.out.print("Singular matrix, can't find its inverse \n");
            inv=false;
        }

        // Find adjoint
        int [][]adj = new int[row][row];
        adjoint(A, adj,row);

        // Find Inverse using formula "inverse(A) = adj(A)/det(A)"
        for (int i = 0; i < row; i++)
            for (int j = 0; j < row; j++) {
                inverse[i][j] = adj[i][j] / (float) det;

            }
        if (print=="yes"){
            print_inverse(inverse,row);
        }

        return inverse;
    }
    public void print_inverse(float A[][],int row){
        //inverse(A,row,"yes");
        System.out.println("Inverse");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < row; j++)

                System.out.printf(" %.6f ",A[i][j]);
            System.out.println();
        }
    }
    public void multiply(int firstMatrix[][],int secondMatrix[][], int row1, int row2,int column1, int column2){

        int[][] product = new int[row1][column2];
        for(int i = 0; i < row1; i++) {
            for (int j = 0; j < column2; j++) {
                for (int k = 0; k < row2; k++) {
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        System.out.println("product of two matrices is: ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column2; j++)
                System.out.print(product[i][j] + " ");

            System.out.println();
        }
    }
    public void divide(int firstMatrix[][],int secondMatrix[][], int row1, int row2,int column1, int column2){
            int row3=inverse(firstMatrix,row1,"no").length;
            float[][] divide = new float[row3][column2];
            for(int i = 0; i < row3; i++) {
                for (int j = 0; j < column2; j++) {
                    for (int k = 0; k < row2; k++) {
                        divide[i][j] += inverse(firstMatrix,row1,"no")[i][k] * secondMatrix[k][j];

                    }
                }
            }
            System.out.println("Division of two matrices is: ");
            for (int i = 0; i < row3; i++) {
                for (int j = 0; j < column2; j++)
                    System.out.print(divide[i][j] + " ");

                System.out.println();
            }




    }
    public void mean(int A [][],int row,int col) {
        for (int i = 0; i < row; i++) {
            int sumRow = 0;
            for (int j = 0; j < col; j++) {
                sumRow = sumRow + A[i][j];
            }
            float rowavg = sumRow / (float) row;

            System.out.println("Mean of " + (i + 1) + "st row: " + rowavg);
        }
        System.out.println("***************");

        //Calculates sum of each column of given matrix
        for (int i = 0; i < col; i++) {
            int sumCol = 0;
            for (int j = 0; j < row; j++) {
                sumCol = sumCol + A[j][i];
            }
            float colavg = sumCol / (float) col;

            System.out.println("Mean of " + (i + 1) + "st column: " + colavg);
        }
        System.out.println("***************");
        int totalsum = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                totalsum += A[i][j];

            }

        }

        float elements=row*col;
        float totavg = totalsum /  elements;
        System.out.println("Mean of " + (row * col) + " elements :" + totavg);
    }
    public double[] getBasis(double[][] matrix){

        double a = matrix[0][0];
        double b = matrix[0][1];
        double c = matrix[1][0];
        double d = matrix[1][1];

        double eigenvalue1 = ((a+d) + Math.sqrt( Math.pow(a-d,2) + 4*b*c))/2;
        double eigenvalue2 = ((a+d) - Math.sqrt( Math.pow(a-d,2) + 4*b*c))/2;

        // store the basis in a 2 element array
        double[] basis = new double[2];

        for (double y = -1000; y <= 1000; y++) {
            for (double x = -1000; x <= 1000; x++) {
                if (((a-eigenvalue1)*x + b*y == 0) && (c*x + (d-eigenvalue1)*y == 0)) {
                    //System.out.println("Eigenvector1: (" + x + "," + y + ")");
                    basis[0] = eigenvalue1;
                }
            }
        }

        for (double y = -10; y <= 10; y++) {
            for (double x = -10; x <= 10; x++) {
                if (((a-eigenvalue2)*x + b*y == 0) && (c*x + (d-eigenvalue2)*y == 0)) {
                    //System.out.println("Eigenvector2: (" + x + "," + y + ")");
                    basis[1] = eigenvalue2;
                }
            }
        }

        return basis;
    }
    public void elementmul(int firstMatrix[][],int secondMatrix[][], int row, int column){
            int[][] eproduct = new int[row][column];
            for(int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    eproduct[i][j] = firstMatrix[i][j] * secondMatrix[i][j];
                }
            }

            // Displaying the result
            System.out.println("Sum of two matrices is: ");
            for( int[] x : eproduct) {


                System.out.println(Arrays.toString(x));
            }


    }
    public void elementdiv(int firstMatrix[][],int secondMatrix[][], int row, int column){
        float[][] edivison = new float[row][column];
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                edivison[i][j] = firstMatrix[i][j] / (float)secondMatrix[i][j];
            }
        }

        // Displaying the result
        System.out.println("Sum of two matrices is: ");
        for( float[] x : edivison) {


            System.out.println(Arrays.toString(x));
        }


    }
    public void scalar_Mul(int matrix[][],int scalar,int row,int column){
        //System.out.println(scalar);
        int[][] product = new int[row][column];
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                product[i][j] = matrix[i][j] * scalar;
            }
        }
        System.out.println("Scalar multiplication is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++)
                System.out.print(product[i][j] + " ");

            System.out.println();
        }
    }
    public void scalar_Div(int matrix[][],int scalar,int row,int column){
        //System.out.println(scalar);
        float[][] ans = new float[row][column];
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                ans[i][j] = matrix[i][j] / (float)scalar;
            }
        }
        System.out.println("Scalar Division is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++)
                System.out.print(ans[i][j] + " ");

            System.out.println();
        }
    }
    public void lin_eqn(int firstMatrix[][],int secondMatrix[][], int row1, int row2,int column1, int column2){
        //inverse(firstMatrix,row1,"no");
        float[][] product = new float[row1][column2];
        for(int i = 0; i < row1; i++) {
            for (int j = 0; j < column2; j++) {
                for (int k = 0; k < row2; k++) {
                    product[i][j] += inverse(firstMatrix,row1,"no")[i][k] * secondMatrix[k][j];
                }
            }
        }
        System.out.println("Solution to Linear eqn Inv(Matrix 1) * Matrix 2 : ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column2; j++)
                System.out.print(product[i][j] + " ");

            System.out.println();
        }
    }
    public double trace(int matrix[][],int row){
        double trace = 0;
        for (int i=0;i<row;i++){
            trace += matrix[i][i];
        }
        //System.out.println(trace);
        return trace;
    }

    public double[] eigenValues(int[][] matrix, int row){
        double EigenValue[] =new double[2];
        if(row==2){

            double trace = trace(matrix,row);
            double determinant=determinantOfMatrix(matrix,row);
            //System.out.println(determinant);
            EigenValue[1] = (trace+ Math.sqrt(Math.pow(trace,2) - 4* determinant))/2;
            EigenValue[0] = (trace- Math.sqrt(Math.pow(trace,2) - 4* determinant))/2;
//            for(int i=0;i<2;i++) {
//                System.out.println(EigenValue[i]);
//            }
            System.out.println("["+EigenValue[0]+","+EigenValue[1]+"]");

        }else {
            System.out.println("Enter only 2x2 Matrix for Eigenvalues");
            return null;
        }

        return EigenValue;
    }


    public double[][] eigenVector(int[][] matrix, int row, int column) {
        System.out.println("Eigenvalues:");
        double eigenValues[] = eigenValues(matrix,row);

        double eigenVectors0[][] = {{1}, {0}};
        double eigenVectors1[][] = {{1}, {0}};

        if ((row == 2) && column == 2) {
            if (matrix[0][1] == 0) {
                float z= matrix[0][0]/ (float) matrix[1][0];
                //System.out.println(z);
                eigenVectors0[1][0] = eigenValues[0] - z;
                //System.out.println("Vector0:"+eigenVectors0[1][0]);
            } else {
                float n=(float)eigenValues[0] -matrix[1][1];
                //System.out.println(n);
                eigenVectors0[1][0] = matrix[0][1] / n;
                //System.out.println("Vector0(ii):"+eigenVectors0[1][0]);

            }
            if (matrix[1][0] == 0) {
                float k=matrix[0][0] / (float)matrix[0][1];
                //System.out.println(k);
                eigenVectors1[1][0] = eigenValues[1] - k;
                //System.out.println("Vector1:"+eigenVectors1[1][0]);

            } else {
                float b =(float)eigenValues[0] - matrix[1][1];
                //System.out.println(b);
                eigenVectors1[1][0] = matrix[0][1] / b;
                //System.out.println("Vector1(ii):"+eigenVectors1[1][0]);

            }
        } else{
            System.out.println("Enter only 2x2 Matrix for Eigenvectors");
            return null;
        }
        double[][] array = {{eigenVectors0[0][0], eigenVectors1[0][0]}, {eigenVectors0[1][0], eigenVectors1[1][0]}};
        System.out.println("EigenVectors:");
        System.out.println("["+eigenVectors0[0][0]+","+eigenVectors1[0][0]+","+eigenVectors0[1][0]+","+ eigenVectors1[1][0]+"]");
        return array;
    }









































    public void type(){

//        System.out.println(row);
//        System.out.println(column);
        if(row != column){
            Main.Rectangular_matrix.add(new Matrix(matrix, id, row, column,"Rectangular"));

            //System.out.println("identified rectangular matrix");
            if ( this.column == 1){
                //System.out.println("identified column matrix");
                Main.Column_matrix.add(new Matrix(matrix, id, row, column,"Column"));
            }
            if(this.row == 1 ){
                //System.out.println("identified row matrix");
                Main.Row_matrix.add(new Matrix(matrix, id, row, column,"Row"));
            }
            if (nullMatrix(matrix,row, column)==0){
                //System.out.println("identified null matrix");
                Main.Null.add(new Matrix(matrix,id,row,column,"Null"));
            }
            if (onesMatrix(matrix, row, column)==0 && row!=column) {
                Main.ones.add(new Matrix(matrix, id,row,column,"Ones"));
                //System.out.println("identified ones matrix");
            }

        }else if (row == column){
            Main.Square_matrix.add(new Matrix(matrix, id, row, column,"Square"));
            //System.out.println("identified square matrix");
            if (row == 1 && column == 1) {
                Main.Singleton.add(new Matrix(matrix, id, row, column,"Singleton"));
           }
            if (determinantOfMatrix(matrix, row)==0){
                Main.Singular.add(new Matrix(matrix, id, row, column,"Singular"));
            }
            if (nullMatrix(matrix, row, column)==0){
                Main.Null.add(new Matrix(matrix, id, row, column,"Null"));
            }
            if (symmetric(matrix, row, column,"Symmetric")){
                Main.Symmetric.add(new Matrix(matrix, id, row, column,"symmetric"));
                //System.out.println("yes");
                }

            }
            if (skew_symmetric(matrix, row, column)){
                //System.out.println("identified skew-symmetric matrix");
                Main.skew_symmetric.add(new Matrix(matrix, id, row, column,"Skew symmetric"));

            }
            if (identity(matrix, row, column)==1){

                Main.identity.add(new Matrix(matrix, id, row, column,"identity"));
            }
            if (diagonal(matrix, row, column)==0){
                //System.out.println("identified diagonal matrix");
                Main.diagonal.add(new Matrix(matrix, id, row, column,"Diagonal"));
            }
            if (scalar(matrix, row, column)==0){
                //System.out.println("identified scalar matrix");
                Main.scalar.add(new Matrix(matrix, id, row, column,"Scalar"));
            //System.out.println("yes");
            }
            if (row==column && onesMatrix(matrix,row, column)==0) {
            Main.ones.add(new Matrix(matrix, id, row, column,"Ones"));

//
            }
            if(isUpperTriangularMatrix(matrix, row, column)){

            Main.upperTriangle.add(new Matrix(matrix, id, row, column,"Uppertriangle"));
            }
            if(lowertriangle(matrix, row, column)){
                //System.out.println("identified lowertriangle matrix");
            Main.lowerTriangle.add(new Matrix(matrix, id, row, column,"Lowertriangle"));
             }

            }





    public void display(){

        for (int k = 0; k < Main.Rectangular_matrix.size(); k++) {
            System.out.println(Main.Rectangular_matrix.get(k).label+" : ");
            //System.out.println(Main.Rectangular_matrix.get(k).id+" : ");
//            System.out.println(Main.matrix.get(k).row+ "Hi");
//            System.out.println(Main.matrix.get(k).column+ "Hi");
            for (int i = 0; i < Main.Rectangular_matrix.get(k).row; i++) {
                for (int j = 0; j < Main.Rectangular_matrix.get(k).column; j++) {
                    System.out.print( "      "+Main.Rectangular_matrix.get(k).matrix[i][j] );
                }
                System.out.println();
            }
        }
        for (int k = 0; k < Main.Column_matrix.size(); k++) {
            System.out.println(Main.Column_matrix.get(k).label+" : ");
            //System.out.println(Main.Column_matrix.get(k).id+" : ");
//            System.out.println(Main.matrix.get(k).row+ "Hi");
//            System.out.println(Main.matrix.get(k).column+ "Hi");
            for (int i = 0; i < Main.Column_matrix.get(k).row; i++) {
                for (int j = 0; j < Main.Column_matrix.get(k).column; j++) {
                    System.out.print( "      "+Main.Column_matrix.get(k).matrix[i][j] );
                }
                System.out.println();
            }
        }
        for (int k = 0; k < Main.Row_matrix.size(); k++) {
            System.out.println(Main.Row_matrix.get(k).label+" : ");
            //System.out.println(Main.Row_matrix.get(k).id+" : ");
//            System.out.println(Main.matrix.get(k).row+ "Hi");
//            System.out.println(Main.matrix.get(k).column+ "Hi");
            for (int i = 0; i < Main.Row_matrix.get(k).row; i++) {
                for (int j = 0; j < Main.Row_matrix.get(k).column; j++) {
                    System.out.print( "      "+Main.Row_matrix.get(k).matrix[i][j] );
                }
                System.out.println();
            }
        }
        for (int k = 0; k < Main.Null.size(); k++) {
            System.out.println(Main.Null.get(k).label+" : ");
            //System.out.println(Main.Null.get(k).id+" : ");
//            System.out.println(Main.matrix.get(k).row+ "Hi");
//            System.out.println(Main.matrix.get(k).column+ "Hi");
            for (int i = 0; i < Main.Null.get(k).row; i++) {
                for (int j = 0; j < Main.Null.get(k).column; j++) {
                    System.out.print( "      "+Main.Null.get(k).matrix[i][j] );
                }
                System.out.println();
            }
        }
        for (int k = 0; k < Main.ones.size(); k++) {
            System.out.println(Main.ones.get(k).label+" : ");

            for (int i = 0; i < Main.ones.get(k).row; i++) {
                for (int j = 0; j < Main.ones.get(k).column; j++) {
                    System.out.print( "      "+Main.ones.get(k).matrix[i][j] );
                }
                System.out.println();
            }
        }
        for (int k = 0; k < Main.Square_matrix.size(); k++) {
            System.out.println(Main.Square_matrix.get(k).label+" : ");

            for (int i = 0; i < Main.Square_matrix.get(k).row; i++) {
                for (int j = 0; j < Main.Square_matrix.get(k).column; j++) {
                    System.out.print( "      "+Main.Square_matrix.get(k).matrix[i][j] );
                }
                System.out.println();
            }
        }
        for (int k = 0; k < Main.Singleton.size(); k++) {
            System.out.println(Main.Singleton.get(k).label+" : ");

            for (int i = 0; i < Main.Singleton.get(k).row; i++) {
                for (int j = 0; j < Main.Singleton.get(k).column; j++) {
                    System.out.print( "      "+Main.Singleton.get(k).matrix[i][j] );
                }
                System.out.println();
            }
        }
        for (int k = 0; k < Main.Singular.size(); k++) {
            System.out.println(Main.Singular.get(k).label+" : ");

            for (int i = 0; i < Main.Singular.get(k).row; i++) {
                for (int j = 0; j < Main.Singular.get(k).column; j++) {
                    System.out.print( "      "+Main.Singular.get(k).matrix[i][j] );
                }
                System.out.println();
            }
        }
        for (int k = 0; k < Main.Symmetric.size(); k++) {
            System.out.println(Main.Symmetric.get(k).label+" : ");

            for (int i = 0; i < Main.Symmetric.get(k).row; i++) {
                for (int j = 0; j < Main.Symmetric.get(k).column; j++) {
                    System.out.print( "      "+Main.Symmetric.get(k).matrix[i][j] );
                }
                System.out.println();
            }
        }
        for (int k = 0; k < Main.skew_symmetric.size(); k++) {
            System.out.println(Main.skew_symmetric.get(k).label+" : ");

            for (int i = 0; i < Main.skew_symmetric.get(k).row; i++) {
                for (int j = 0; j < Main.skew_symmetric.get(k).column; j++) {
                    System.out.print( "      "+Main.skew_symmetric.get(k).matrix[i][j] );
                }
                System.out.println();
            }
        }
        for (int k = 0; k < Main.identity.size(); k++) {
            System.out.println(Main.identity.get(k).label+" : ");

            for (int i = 0; i < Main.identity.get(k).row; i++) {
                for (int j = 0; j < Main.identity.get(k).column; j++) {
                    System.out.print( "      "+Main.identity.get(k).matrix[i][j] );
                }
                System.out.println();
            }
        }
        for (int k = 0; k < Main.diagonal.size(); k++) {
            System.out.println(Main.diagonal.get(k).label+" : ");

            for (int i = 0; i < Main.diagonal.get(k).row; i++) {
                for (int j = 0; j < Main.diagonal.get(k).column; j++) {
                    System.out.print( "      "+Main.diagonal.get(k).matrix[i][j] );
                }
                System.out.println();
            }
        }
        for (int k = 0; k < Main.scalar.size(); k++) {
            System.out.println(Main.scalar.get(k).label+" : ");
            for (int i = 0; i < Main.scalar.get(k).row; i++) {
                for (int j = 0; j < Main.scalar.get(k).column; j++) {
                    System.out.print( "      "+Main.scalar.get(k).matrix[i][j] );
                }
                System.out.println();
            }
        }
        for (int k = 0; k < Main.lowerTriangle.size(); k++) {
            System.out.println(Main.lowerTriangle.get(k).label+" : ");

          System.out.println(Main.matrix.get(k).column+ "Hi");
            for (int i = 0; i < Main.lowerTriangle.get(k).row; i++) {
                for (int j = 0; j < Main.lowerTriangle.get(k).column; j++) {
                    System.out.print( "      "+Main.lowerTriangle.get(k).matrix[i][j] );
                }
                System.out.println();
            }
        }
        for (int k = 0; k < Main.upperTriangle.size(); k++) {
            System.out.println(Main.upperTriangle.get(k).label+" : ");
          System.out.println(Main.matrix.get(k).column+ "Hi");
            for (int i = 0; i < Main.upperTriangle.get(k).row; i++) {
                for (int j = 0; j < Main.upperTriangle.get(k).column; j++) {
                    System.out.print( "      "+Main.upperTriangle.get(k).matrix[i][j] );
                }
                System.out.println();
            }
        }





    }
    public void displayall() {
        for (int k = 0; k < Main.matrix.size(); k++) {

            System.out.println(Main.matrix.get(k).id + " : ");

//            System.out.println(Main.matrix.get(k).row+ "Hi");
//            System.out.println(Main.matrix.get(k).column+ "Hi");
            for (int i = 0; i < Main.matrix.get(k).row; i++) {
                for (int j = 0; j < Main.matrix.get(k).column; j++) {
                    System.out.print("      " + Main.matrix.get(k).matrix[i][j]);
                }
                System.out.println();
            }
        }
    }


}


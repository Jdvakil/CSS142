import java.io.*;
import java.util.*;
/**
 * This class takes two contructors, one passes a 2-d array and second contructor takes in a file name as a string. in this class, a matrice(2d array)
 * has several methods that do many calculations.
 * @author Jay Darshan Vakil
 * @version 03/16/19
 */
public class MDArray{

    private double[][] mdarray;

    /**
     * Constrcutor 1
     * @param mdarray a 2d array.
     */
    public MDArray(double [][] mdarray)    {
        this.mdarray=mdarray;
    }

    /**
     * Contructor 2
     * @param fileName a file name as a string. 
     */
    public MDArray(String fileName) throws FileNotFoundException{
        Scanner scanner=new Scanner(new File(fileName));
        mdarray = new double[scanner.nextInt()][];
        int count=0;
        while(scanner.hasNextLine()){
            String text[]=scanner.next().split(" ");
            mdarray[count]=new double[text.length];
            for(int i=0; i<text.length; i++){
                mdarray[count][i]=Double.parseDouble(text[i]);
            }
            count++;
        }

    }

    /**
     * This method checks if mdarray is ragged or not.
     * @return isRagged boolean result of the array and if it is ragged or not.
     */
    public boolean isRagged(){
        boolean isRagged = false;
        for(int i = 1; i < mdarray.length; i++){
            if(mdarray[i].length != mdarray[i-1].length){
                isRagged = true;
            }
        }
        return isRagged;
    }

    /**
     * This method returns the rows of mdarray
     * @return the length of mdarray
     */
    public int getNumberOfRows(){        
        return mdarray.length;
    }

    /**
     * This method gets the column of mdarray.
     * @return col the column number.
     */
    public int getNumberOfCols(){
        int col = mdarray[0].length;

        if(mdarray == null){
            col = 0;
        }

        for(int i = 1; i < mdarray.length; i++){
            if(mdarray[i].length > col){
                col = mdarray[i].length;
            }
        }

        return col;
    }

    /**
     * This returns the value in the array at the given row and column 
     * @param i,j the row and column
     * @retunr valAt the value at the given i and j.
     */
    public double getValAt(int i, int j){
        double valAt = 0;

        try{
            valAt=mdarray[i][j];
        }
        catch(Exception e){
            System.out.println("Array indexes out of bound, please try again...");
        }

        return valAt;
    }

    /**
     * This is the sort method, this method uses selection sorting method to sort mdarray row-wise or column-wise depending on the users preference
     * @param byColumn if the uses passes true thru the parameter then the array would be sorted column-wise, if false is passed then sorted row-wise.
     */
    public void sort(boolean byColumn) {
        int size = 0;

        for(int i = 0; i < mdarray.length; i++) {
            size += mdarray[i].length;
        }

        double[] auxArray = new double[size];//auxillary array
        int count = 0;

        for(int i = 0; i < mdarray.length; i++){
            for(int j = 0; j < mdarray[i].length; j++){
                auxArray[count++] = mdarray[i][j];
            }
        }

        if(!byColumn){//by row
            double temp = 0;
            int row = getNumberOfRows();
            int col = getNumberOfCols();
            for(int j = 0; j < row; j++){
                for(int i = 1; i < col; i++){
                    if(mdarray[j][i-1] > mdarray[j][i]){
                        temp = mdarray[j][1-1];
                        mdarray[j][i-1] = mdarray[j][1];
                        mdarray[j][i] = temp;
                    }
                }
            }
        }
        else {//by col
            if(isRagged())
                System.out.println("Cannot sort ragged array");
            else {
                double temp = 0;
                int row = mdarray.length;
                int col = getNumberOfCols();
                for(int i = 0; i <row; i++){
                    for(int j= 1; j<col; j++){
                        if(mdarray[i][j-1]>mdarray[i][j]){
                            temp = mdarray[i][j-1];
                            mdarray[i][j-1] = mdarray[i][j];
                            mdarray[i][j] = temp;
                        }
                    }
                }
            }
        }
    }

    /**
     * This is the hamming class, it takes a boolean parameter. it returns the hamming interger of the sorted matrix. 
     * @param byColumn if the array is ragged and byColumn sorting is true then the hamming number is -1.
     * @return hammingNum the hamming number of the sorted array. 
     */
    public int hamming(boolean byColumn){
        double hamming[][]=new double[mdarray.length][];
        int hammingNum=0;
        if(byColumn && isRagged()){
            return -1;
        }

        for(int i = 0; i < mdarray.length; i++){
            for(int j = 0 ; j < mdarray[i].length; j++)
            {
                if(hamming[i]==null){
                    hamming[i]=new double[mdarray[i].length];
                }
                hamming[i][j]=mdarray[i][j];
            }
        }
        sort(byColumn);
        for(int i = 0; i < mdarray.length; i++){
            for(int j = 0; j < mdarray[i].length; j++){
                if(hamming[i][j] != mdarray[i][j]){
                    hammingNum++;
                }
            }
        }

        return hammingNum;
    }

    /**
     * This method returns the row with the highest number in form of an array. 
     * @return mdarray[row] the row of mdarray with the max number.
     */
    public double[] max(){
        int row=0;
        double max=0;
        for(int i = 0; i < mdarray.length; i++){
            for(int j = 0; j < mdarray[i].length; j++){
                if(mdarray[i][j] > max){
                    max = mdarray[i][j];
                    row=i;
                }
            }
        }
        return mdarray[row];
    }

    /**
     * This is the toString method, this converts the array into string form so that it could be printed to the outmut screen.
     * @return res the string form of the array.
     */
    public String toString(){
        String res="";
        for(int i=0; i<mdarray.length; i++){
            for(int j=0; j<mdarray[i].length; j++){
                res=res+mdarray[i][j]+" ";
            }
            res=res+"\n";
        }
        return res;
    }
}
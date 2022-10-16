import java.util.*;
public class arrays2D{
    public static void main(String args[]){
        Scanner balu = new Scanner(System.in);
        System.out.println("enter the number of rows: ");
        int rows = balu.nextInt();
        System.out.println("enter the number of rows: ");
        int cols = balu.nextInt();
        int arrays[][] = new int[rows][cols];
        System.out.println("enter the values");
        for (int i = 0 ; i < rows ; i++ ){
            for (int j = 0 ; j < cols ; j++){
                arrays[i][j] = balu.nextInt();
            }
        }
        System.out.println("entered numbers are: ");
        for (int i = 0 ; i < rows ; i++ ){
            for (int j = 0 ; j < cols ; j++){
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
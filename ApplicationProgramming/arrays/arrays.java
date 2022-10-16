import java.util.*;
//arrays
public class arrays{
    public static void main(String args[]){
        System.out.println("enter the size of the array: ");
        Scanner balu = new Scanner(System.in);
        int a = balu.nextInt();
        int array[] = new int[a];
        for(int i = 0 ; i < a ; i++){
            System.out.println("enter the " + (i+1) + " element: ");
            array[i] = balu.nextInt();
        }
        System.out.println("The elements are: ");
        for(int i = 0 ; i < a ; i++){
            System.out.print(array[i] + " ");
        }
    }
}
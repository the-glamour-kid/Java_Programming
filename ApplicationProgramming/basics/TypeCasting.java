import java.util.Scanner;

public class TypeCasting{
    public static void main(String[] args){
        System.out.println("enter a number and it converts it from string to number: ");
        Scanner input = new Scanner(System.in);
        String in = input.next();
        int x = Integer.parseInt(in);
        System.out.println("the output is: " + x);
    }
}
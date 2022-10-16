import java.util.*;
public class conditionals {
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            /*int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == b){
                System.out.println(a + " is equal to " + b);
            }else if (a <= b){
                System.out.println(a + " is lesser than " + b);
            }else{
                System.out.println(a + " is greater than " + b);
            }*/
            
            System.out.println("enter an option between 1 and 3");
            int option = sc.nextInt();
            switch(option){
                case 1 : System.out.println("this is first case"); break ;
                case 2 : System.out.println("this is second case"); break ;
                case 3 : System.out.println("this is third case"); break ;
                default : System.out.println("invalid option");
            }
    }
}
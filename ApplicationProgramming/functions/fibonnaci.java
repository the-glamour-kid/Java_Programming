import java.util.*;

public class fibonnaci{

    //here function can be written
    public static void fibonnaCi(int a){
        int f = 1;
        if ( a == 1){
            f = 0;
            System.out.println("fibonacci for " + a + " is: " + f);
            return ;
        }
        else if (a == 2 || a == 3 ){
            f = 1;
            System.out.println("fibonacci for " + a + " is: " + f);
            return ;
        }
        else if (a < 0){
            System.out.println("fibonacci doesn't exist for negative numbers");
            return ;
        }
        else {
            int prev = 1;
            int pres = 1;
            System.out.print("0 1 ");
            for (int i = 1 ; i <= a-3 ; i++){
                System.out.print(f + " ");
                prev = pres;
                pres = f;
                f = prev + pres;
            }
            System.out.print(f + " ");
            System.out.println("");
        System.out.print("fibonacci for " + a + " steps is: " + f);
        }
    }
    public static void main(String args[]){
        Scanner balu = new Scanner(System.in);
        System.out.println("enter the steps for fibonacci: ");
        int a = balu.nextInt();
        fibonnaCi(a);
    }
}
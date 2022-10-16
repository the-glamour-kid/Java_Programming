import java.util.*;



class EncapsulationJava{
    public static void main(String args[]){
        Scanner balu = new Scanner(System.in);
        System.out.println("enter a number for finding the factorial: ");
        int FactNum = balu.nextInt();
        if (FactNum >=  0){ 
            FactorialClass obj1 = new FactorialClass();
            obj1.a = FactNum;
            System.out.println("factorial of " + FactNum + " is: " + obj1.CalculateFactorial());
        }
        else System.out.println("factorial doestn't exist for negative numbers");
        return ;
    }
}


class FactorialClass{
    int a;
    public int CalculateFactorial(){
        int dummy = a;
        if (a == 0) dummy = 1;
        else if ( a == 1 ) dummy = 1;
        else{
            dummy = a ;
            for(int i = a ; i > 1 ; i-- ){
                dummy = dummy * (a-1);
                a = a - 1;
            }
        } 
        return dummy ;
    }
}
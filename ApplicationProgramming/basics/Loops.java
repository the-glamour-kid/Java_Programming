public class Loops {
    public static void main(String args[]){
        int b = 11;
        int c = 11;
        //using for loop
        System.out.println("counting using for loop");
        for(int i = 0 ; i < 11 ; i++){
            System.out.println(i);
        }
        System.out.println("counting using while loop");
        //using while loop
        while(b >= 0){
            System.out.println(b);
            b--;
        }
        System.out.println("counting using do while");
        //using do while
        do {
            System.out.println(c);
            c--;
        }while(c >= 0);
    }
}
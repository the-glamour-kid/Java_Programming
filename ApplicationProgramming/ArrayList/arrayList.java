import java.util.ArrayList;
import java.util.Collections;


public class arrayList{
    public static void main(String args[]){
        //initialization of array list
        ArrayList<Integer> val = new ArrayList<Integer>();
        //adding values to the list 
        val.add(5);
        val.add(6);
        val.add(7);
        System.out.println(val);

        //getting elements by the index number
        System.out.println(val.get(1));

        //inserting using add function
        val.add(3,9);
        val.add(3,8);
        System.out.println(val);

        //setting an element
        val.set(0,4);
        System.out.println(val);

        //removing an element by the index
        val.remove(1);
        System.out.println(val);

        //printing the size of the list 
        int n = val.size();
        System.out.println(n);

        //printing all the elements in array list 
        for (int i = 0 ; i < val.size() ; i++){
            System.out.print(val.get(i) + " ");
        }
        System.out.println();

        //sorting of array list
        Collections.sort(val);
        System.out.println(val);

    }
}
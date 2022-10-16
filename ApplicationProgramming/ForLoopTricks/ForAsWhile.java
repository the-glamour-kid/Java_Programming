


class ForAsWhile{
    public static void main(String args[]){
        boolean bool = true;
        int num = 0;
        System.out.println("im printing");
        for (;bool;){
            System.out.println(num);
            num = num + 1;
            if(num > 10) 
            {
                bool = false;
            }
        }
    }
}
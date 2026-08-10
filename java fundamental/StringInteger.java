public class StringInteger{
    public static void main(String args[]){
        if(args.length !=2){
            System.out.println("please enter two numbers");
        }else{
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            System.out.println("the sum of " + a + " and " + b + " is " + (a+b));
        }

    }
}

import java.util.Scanner;
public class AlphabeticalOrder{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        if(a.compareTo(b)<0){
            System.out.print(a+" "+b);
        }else{
            System.out.print(b+" "+a);
        }
    }
}
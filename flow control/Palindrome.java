import java.util.Scanner;
public class Palindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String rev="";
        int i=str.length()-1;
        while(i>=0){
            rev += str.charAt(i);
            i--;
        }
        if(str.equals(rev)){
            System.out.println(str + " is Palindrome");
        }
        else{
            System.out.println(str + " is Not a Palindrome");
        }
    }
}

import java.util.Scanner;
public class SumofDigits {
    public static void main (String []args){
    Scanner sc =new Scanner (System.in);
    System.out.println("Enter a number:");
    int n=sc.nextInt();
    int sum=0,rem;
    while(n>0){
        rem=n%10;
        sum=sum+rem;
        n=n/10;
    }
System.out.println("Sum of the digits of the given number="+sum); 
}
}
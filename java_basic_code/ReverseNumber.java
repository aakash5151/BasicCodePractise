import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int a,b;
        int c=0;
        System.out.println("Enter a Number : ");
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        scanner.close();

        while (a>0) {
            b=a%10;
	    c=(c*10)+b;
            a=a/10;
            

        }
        System.out.println("Reverse Number = "+ d);
    }
}

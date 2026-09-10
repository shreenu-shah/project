import java.util.Scanner;
public class practice{
    public static void main(String args[]){
     double pi=3.14159;
     int roundPi =(int)pi;
     System.out.println(pi);
     System.out.println(roundPi);
     char ch='A';
     int ascii=ch;
     System.out.println(ascii);
     int x=5;
     int number=ascii+x;
     System.out.println(number);

Scanner sc = new Scanner(System.in);
System.out.println("Enter a number: ");
int number = sc.nextInt();
Scanner Pc = new Scanner(System.in);
System.out.println("Enter your second number: ");
int Number = Pc.nextInt();
int sum= number+Number;
System.out.println("Sum of two number is: "+sum);
int product=number*Number;
System.out.println("Product is: "+product);
int Diff=number-Number;
System.out.println("Difference is: "+Diff);
float div= (float)(number / Number);
System.out.println("Division is: "+div);
    }
}


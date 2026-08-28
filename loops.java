import java.util.Scanner;
public class loops {
    public static void main(String args[]){
        Scanner Ac =new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int Age= Ac.nextInt();
        System.out.println(Age);
    if(Age<=12){
        System.out.println("YOu area child");
    }
    else if(Age>=12 && Age<18){
        System.out.println("YOu are a teenager");
    }
    else if(Age>18)
    {
    System.out.println("You are a adult now");
}
else{
    System.out.println("invalid age");
}

    }
    
}

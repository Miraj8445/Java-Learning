import java.util.Scanner;

public class Substraction {
   public static void main(String[] args){
       Scanner scr = new Scanner(System.in);
       System.out.print("Enter first number: ");
       int num1 = scr.nextInt();
       System.out.print("Enter second number: ");
       int num2 = scr.nextInt();

       int result = num1 - num2;

       System.out.println("Subtraction: " + result);
    }
}

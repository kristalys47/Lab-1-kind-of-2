import java.util.Scanner;

public class MyComplexNumber {

    public static void main(String[] args) 
    {       
        Scanner keyboard = new Scanner(System.in);
          int val1, val2, val3, val4, sum1, sum2, multi1, multi2;
       
      System.out.print("Given two complex numbers a+bi and c+di, enter the next digits.\n");
      System.out.print("Enter the value of a  : ");
      val1 = keyboard.nextInt();
      System.out.print("Enter the value of b  : ");
      val2 = keyboard.nextInt();
      System.out.print("Enter the value of c  : ");
      val3 = keyboard.nextInt();
      System.out.print("Enter the value of d  : ");
      val4 = keyboard.nextInt();

      sum1=val1+val3;
      sum2=val2+val4;
      
      multi1=val1*val3-val2*val4;
      multi2=val1*val4+val2*val3;
      
      System.out.println("The sum of the complex numbers is = " + sum1 + " + " + sum2 + "i " );
      System.out.println("The multiplication of the complex numbers is = " + multi1 + " + " + multi2 + "i " ); 
    }}
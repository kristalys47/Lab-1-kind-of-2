import java.util.Scanner;

public class MyComplexNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		  int val1, val2, val3, val4, sum1, sum2, sub1, sub2;
         
      String wordForTheResult;
      System.out.print("Given a Complex number a+bi and c+di:\nIf a=1 integer, b=2 integer, c=3 integer, d=4 integer, enter the next digits.\n");
      System.out.print("Enter the first integer   : ");
      val1 = keyboard.nextInt();
      System.out.print("Enter the second integer  : ");
      val2 = keyboard.nextInt();
      System.out.print("Enter the third integer   : ");
      val3 = keyboard.nextInt();
      System.out.print("Enter the fourth integer  : ");
      val4 = keyboard.nextInt();
      System.out.print("Enter label that will precede the result  : ");
      wordForTheResult = keyboard.next();

      sum1=val1+val3;
      sum2=val2+val4;
      sub1=val1-val3;
      sub2=val2-val4;
      
      
      


      System.out.println(wordForTheResult + " = " + sum);

      keyboard.close();
      
      
      
      
	}

}

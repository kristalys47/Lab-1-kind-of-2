import java.util.Scanner;

public class AgeInMonths 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int years, months, copy;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter your age in months: ");
		months= keyboard.nextInt();
		copy=months;
		if (copy>=12)
		{
			do 
				copy=copy-12;
			while(copy>=12);
			years=months/12;
			System.out.print("\nYour age in years and months is: " + years + " years and " + copy + " months");
		}
		else	
			System.out.print("\nYour age in years and months is: 0 years and " + months + " months");
	
	}

}

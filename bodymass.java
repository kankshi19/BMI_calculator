import java.util.Scanner;
class bodymass
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your weight in kg : ");
		double kg = sc.nextDouble();
		System.out.println("Enter your height in cm : ");
		double m = sc.nextDouble();
		m= m/100;
		double bmi = kg/(m*m) ;
		System.out.println("BMI = "+bmi);
		if(bmi>0 &&bmi<18)
		{
			System.out.println(" You are Underweight , Eat more!");
		}
		else if (bmi<24)
		{
			System.out.println("You are perfectly fit!");
		}
		else if (bmi<29)
		{
			System.out.println("You are overweight , Exercise daily!");
		}
		else if (bmi>30)
		{
			System.out.println("Oops! You are suffering from obessity , Be more Active!");
		}
		else
		{
			System.out.println("invalid");
		}
		
	}
}
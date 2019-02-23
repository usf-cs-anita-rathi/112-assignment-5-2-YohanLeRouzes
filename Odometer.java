import java.util.Scanner;

public class Odometer {
		
	public int milesDriven;
	public double fuelEfficiency;
	public double tripMilesDriven;
	public double gallonsConsumed;
	public double totalMiles;
	public String answer;
	public int anotherTrip;
	
	public void resetMiles()
	{
		milesDriven = 0;
	}
	
	public void totalMiles()
	{
		totalMiles += milesDriven;
		System.out.println("Your total mileage is " + totalMiles);
	}
	
	public void setFuelEfficiency()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("What is the fuel effeciency ( in miles per gallon ) ?");
		fuelEfficiency=input.nextDouble();
	}
	
	public void tripMiles()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("How many miles did you travel ?");
		tripMilesDriven=input.nextDouble();
		milesDriven += tripMilesDriven;
	}
	
	public void displayGallons()
	{
		gallonsConsumed= tripMilesDriven/fuelEfficiency;
		System.out.println("The number of gallons consumed is " + gallonsConsumed);
	}
	
}

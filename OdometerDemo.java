import java.util.Scanner;

public class OdometerDemo {

	public static void main(String[] args)
	{	
		int anotherTrip=1;
		String answer = "";
		Scanner input=new Scanner(System.in);
		Odometer vehicule1;
		vehicule1 = new Odometer();
		while (anotherTrip == 1)
		{
			vehicule1.resetMiles();
			vehicule1.setFuelEfficiency();
			vehicule1.tripMiles();
			vehicule1.displayGallons();
			vehicule1.totalMiles();
			System.out.println("Do you want to do another trip?");
			answer=input.next();
			switch (answer) {
			case "yes":
			case "Yes": anotherTrip = 1;
			break;
			
			case "no":
			case "No": anotherTrip = 0;
			break;
			
			default: System.out.println("Invalid Input");
			break;
			}
		}
		System.out.println("Have a great day!");
	}
	
}

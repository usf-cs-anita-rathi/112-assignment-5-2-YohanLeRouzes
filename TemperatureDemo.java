public class TemperatureDemo {

	public static void main (String[] args)
	{
		Temperature temp1, temp2, temp3, temp4, temp5, temp6, temp7, temp8;
		temp1 = new Temperature();
		temp2 = new Temperature();
		temp3 = new Temperature();
		temp4 = new Temperature();
		temp5 = new Temperature();
		temp6 = new Temperature();
		temp7 = new Temperature();
		temp8 = new Temperature();
		
		temp1.temp=0;
		temp1.scale='C';
		temp2.temp=32;
		temp2.scale='F';
		temp3.temp=-40;
		temp3.scale='C';
		temp4.temp=-40;
		temp4.scale='F';
		temp5.temp=100;
		temp5.scale='C';
		temp6.temp=212;
		temp6.scale='F';
		temp7.temp=28;
		temp7.scale='C';
		temp8.temp=36;
		temp8.scale='C';
		
		temp1.toFahrenheit();
		temp3.toFahrenheit();
		temp5.toFahrenheit();
		temp7.toFahrenheit();
		temp8.toFahrenheit();
		
		if(temp1.equals(temp2))
		{
			temp1.toCelsius();
			System.out.println(temp1 + " is equal to " + temp2);
		}
		else
		{
			temp1.toCelsius();
			System.out.println(temp1 + " is not equal to " + temp2);
		}
		
		if(temp3.equals(temp4))
		{
			temp3.toCelsius();
			System.out.println(temp3 + " is equal to " + temp4);
		}
		else
		{
			temp3.toCelsius();
			System.out.println(temp3 + " is not equal to " + temp4);
		}
		
		if(temp5.equals(temp6))
		{
			temp5.toCelsius();
			System.out.println(temp5 + " is equal to " + temp6);
		}
		else
		{
			temp5.toCelsius();
			System.out.println(temp5 + " is not equal to " + temp6);
		}
		
		if(temp7.lessThan(temp2))
		{
			temp7.toCelsius();
			System.out.println(temp7 + " is less than " + temp2);
		}
		else
		{
			temp7.toCelsius();
			System.out.println(temp7 + " is not less than " + temp2 + " it is greater.");
		}
		
		if(temp8.greaterThan(temp3))
		{
			temp8.toCelsius();
			System.out.println(temp8 + " is greater than " + temp3);
		}
		else
		{
			temp8.toCelsius();
			System.out.println(temp8 + " is not greater than " + temp3 + " it is less.");
		}
	}
	
}



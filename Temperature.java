
	public class Temperature {

	public float temp, t;
	public char scale, s;
	
	public void setTemperature(float temp, char scale)
	{
		temp = t;
		scale = s;
	}

	public Temperature()
	{
		temp=0;
		scale='C';
	}
	
	public void toCelsius()
	{
		temp=5*(temp-32)/9;
	}
	
	public void toFahrenheit()
	{
		temp=((9*(temp)/5)+32);
	}
	
	
	public String toString()
	{
		return (temp + " " + scale);
	}
	
	public float getTemp()
	{
		return temp;
	}
	
	public boolean equals(Temperature othertemp)
	{
		if (temp==othertemp.temp)
			return true;
		else
			return false;
	}
	
	public boolean greaterThan(Temperature othertemp)
	{
		if (temp>othertemp.temp)
			return true;
		else
			return false;
	}
	
	public boolean lessThan(Temperature othertemp)
	{
		if (temp<othertemp.temp)
			return true;
		else
			return false;
	}
	
}

package week9;

public class UnitConverter {
	
	public static double toFahrenheit(double celsius) {
		double Fahrenheit = celsius*1.8+32;
		return Fahrenheit;
	}
	public static double toCelsius(double fahrenheit) {
		double celsius = (fahrenheit-32)/1.8;
		return celsius;
	}
}

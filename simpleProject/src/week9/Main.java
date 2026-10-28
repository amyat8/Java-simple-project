package week9;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("===[problem1] SharedCounter (static vs non-static) ===");
		SharedCounter c1 = new SharedCounter();
		SharedCounter c2 = new SharedCounter();
		c1.increase();
		c1.increase();
		c2.increase();
		System.out.print("c1 counter: ");
		c1.showCount();
		System.out.print("c2 counter: ");
		c2.showCount();
		System.out.println("Total count(static approach): "+SharedCounter.getTotalCount());
		System.out.println();
		
		System.out.println("===[problem2] UnitConverter (static method) ===");
		double fahrenheit = UnitConverter.toFahrenheit(25.0);
		double celsius = UnitConverter.toCelsius(77.0);
		System.out.println("celsius 25.0 to fahrenheit: "+fahrenheit+"Degree");
		System.out.println("fahrenheit 77.0 to celsius: "+celsius+"Degree");
	}

}

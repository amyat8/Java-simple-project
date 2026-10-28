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
	}

}

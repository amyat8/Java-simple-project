package week9;

public class SharedCounter {
	private static int totalCount =0;
	private int myCount =0;
	
	public void increase() {
		totalCount+=1;
		myCount +=1;
	}
	public void showCount() {
		System.out.println("[myCount: "+myCount+ ",total Count: " +totalCount+"]");
	}

	public static int getTotalCount() {
		return totalCount;
	}
}

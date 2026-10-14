package miniTest;
import java.util.*;
public class SumOfInputNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum =0;
		int input = -1;
		
		System.out.println("Please enter integer( enter 0 to exit)");
		
		while(input !=0) {
			System.out.print("Enter: ");
			input = sc.nextInt();
			sum+= input;
		}
		System.out.println("sum of input numbers: "+sum);
		
		sc.close();
	}
}

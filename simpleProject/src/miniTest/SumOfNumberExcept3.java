package miniTest;
import java.util.*;

public class SumOfNumberExcept3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Plese Enter integer: ");
		int num = sc.nextInt();
		
		int sum=0;
		for(int i=1; i<=num; i++) {
			if (i % 3==0) {
				continue;
			}
				sum+=i;
		}
		System.out.println("sum of num1 to num"+num+" except power 3 = "+sum);
		sc.close();
	}


}

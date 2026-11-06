package miniTest;
import java.util.Scanner;

public class SumOfTwoArr {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int [] arr1 = new int[50];
		int [] arr2 = new int[50];
		int [] arr3 = new int[50];
		int sum =0;
		
		int arrSize;
		System.out.print("Please enter arr size: ");
		arrSize = input.nextInt();
		
		System.out.print("Please enter arr1: ");
		for (int i =0; i<arrSize; i++) {
			arr1[i] = input.nextInt();
		}
		
		System.out.print("Please enter arr2: ");
		for (int i =0; i<arrSize; i++) {
			arr2[i] = input.nextInt();
		}

		for (int i =0; i<arrSize; i++) {
			arr3[i] = arr1[i] + arr2[i];
		}
	
		System.out.print("the sum of two array: ");
		for (int i =0; i<arrSize; i++) {
			System.out.print(arr3[i]+ " ");
		}
		input.close();
		
	}

}

package miniTest;
import java.net.Socket;
import java.util.Scanner;

public class InsertNumInArr {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int arrSize, InsertingIndex, InsertingNum;
		int [] arr = new int[50];
		
		System.out.print("Please enter arr size: ");
		arrSize = input.nextInt();
		
		System.out.print("Please enter original array: ");
		for(int i=0; i<arrSize; i++) {
			arr[i] = input.nextInt();
		}
		System.out.print("original arr is: ");
		for(int i=0; i<arrSize; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		System.out.print("\nPlease enter inserting index: ");
		InsertingIndex = input.nextInt();
		
		System.out.print("Please enter inserting num: ");
		InsertingNum = input.nextInt();
		
		for(int i = arrSize; i>InsertingIndex; i--) {
			arr[i] = arr[i-1];
		}
		
		arr[InsertingIndex] = InsertingNum;
		arrSize++;
		
		System.out.print("Array after inserting new number : ");
		for(int i=0; i<arrSize; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println("");
		input.close();
	}
	

}

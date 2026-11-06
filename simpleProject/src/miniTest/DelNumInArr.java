package miniTest;
import java.util.Scanner;

public class DelNumInArr {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int arrSize, DeletingNum, found=-1;
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
		
		System.out.print("\nPlease enter deleting num: ");
		DeletingNum = input.nextInt();
		
		for(int i=0; i<arrSize; i++) {
			if(arr[i]== DeletingNum) {
				found = i;
				break;
			}
		}
		
		if(found != -1) {
			for(int i = found; i<arrSize; i++) {
				arr[i] = arr[i+1];
		}
		arrSize--;

		System.out.print("Array after deleting number : ");
		for(int i=0; i<arrSize; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println("");
		
		}
		else {
			System.out.println("Data not found to delete");
		}
		
		input.close();
	}
	

}

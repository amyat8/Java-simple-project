package miniTest;
import java.util.Scanner;

public class IntegerCounter {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int [] arr = new int [50];
		int arrSize = 0 ;
		int PositiveNum = 0;
		int NegativeNum = 0;
		int Zero = 0;
		System.out.print("please enter arrSize: ");
		arrSize = input.nextInt();
		
		System.out.print("please enter number: ");
		for(int i =0; i<arrSize; i++) {
			arr[i] = input.nextInt();
			if (arr[i]>0) {
				PositiveNum+= 1;
			}else if(arr[i]==0){
				Zero +=1;
			}else NegativeNum +=1;
		}
		
		System.out.println("Total Postive Number: "+ PositiveNum);
		System.out.println("Total Zero Number: "+ Zero);
		System.out.println("Total Negative Number: "+ NegativeNum);
		
		input.close();
		
	}

}

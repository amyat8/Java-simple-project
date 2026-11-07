package project;
import java.util.Scanner;
public class ManagingUser {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int inputNum;
		String user[][] = new String[50][3];
		int userId;
		String userName, address;
		int userCount =0;
		
		do {
		System.out.println("1.Create user\n2.Read user\n3.Update user\n4.Delete user\n5.Exit");
		System.out.print("Enter your option: ");
		inputNum = input.nextInt();
		input.nextLine();
		
		if(inputNum == 5) {
			System.out.println("Bye. See you again.");
			break;
		}
		else if(inputNum!=1 && inputNum!=2 && inputNum!=3 && inputNum!=4){
			System.out.println("Invalid option number. try again.");
		}
		else {
			switch(inputNum) {
			case 1:
				System.out.println("Create user\n *********");
				
				System.out.print("Please enter user name: ");
				user[userCount][1] = input.nextLine();
				
				System.out.print("Please enter address: ");
				user[userCount][2] = input.nextLine();
				
				userId = 1001+userCount;
				user[userCount][0] =String.valueOf(userId);
				
				userCount++;
				break;
				
			case 2:
				System.out.println("Read user\n*********");
				break;
			case 3:
				System.out.println("Update user\n*********");
				break;
			case 4:
				System.out.println("Delete user\n*********");
				break;
			}
		}	
		
		}
		while(true);
		
		input.close();
	}
}

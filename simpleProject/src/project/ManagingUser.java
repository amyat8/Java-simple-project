package project;
import java.util.Scanner;
public class ManagingUser {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int inputNum;
		String user[][] = new String[50][3];
		int userId = 1001;
		int userCount =0;
		int updateId, deleteId;
		
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
				System.out.println("\n***********\nCreate user\n***********");
				
				if (userCount >= user.length) {
					System.out.println("user list is full");
					System.out.println("");
					break;
				}
				
				System.out.print("Please enter user name: ");
				user[userCount][1] = input.nextLine();
				
				System.out.print("Please enter address: ");
				user[userCount][2] = input.nextLine();
				
				user[userCount][0] =String.valueOf(userId);
				userId++;
				
				userCount++;
				System.out.println("");
				break;
				
			case 2:
				System.out.println("\n***********\nRead user\n***********");
				if(userCount==0) {
					System.out.println("no user found"); 
				}
				else {
					for(int i=0; i<userCount; i++) {
						System.out.println("["+user[i][0]+", "+ user[i][1] +", "+ user[i][2]+"]");
						}	
				}
				System.out.println("");
				break;
				
			case 3:
				System.out.println("\n***********\nUpdate user\n***********");
				System.out.print("enter ID to update:");
				updateId = input.nextInt();
				input.nextLine();
				int foundUpdateindex = -1;
				
				for(int i=0; i<userCount; i++) {
					if(user[i][0].equals(String.valueOf(updateId))) {
						foundUpdateindex = i;
						break;
					}
				}
				
				if(foundUpdateindex!=-1) {
					System.out.print("Please enter user name to update: ");
					user[foundUpdateindex][1] = input.nextLine();
					
					System.out.print("Please enter address to update: ");
					user[foundUpdateindex][2] = input.nextLine();
					
					System.out.println("user Updated");
					
				}
				else {
					System.out.println("no user found with this Id, try again.");
				}					
				
				System.out.println("");
				break;
				
			case 4:
				System.out.println("\n***********\nDelete user\n***********");
				
				System.out.print("enter ID to delete:");
				deleteId = input.nextInt();
				input.nextLine();
				int foundDelindex = -1;
				
				for(int i=0; i<userCount; i++) {
					if(user[i][0].equals(String.valueOf(deleteId))) {
						foundDelindex = i;
						break;
					}
				}
				
				if(foundDelindex!=-1) {
					for(int i=foundDelindex; i<userCount-1; i++) {
						user[i] = user[i+1];
					}
					userCount--;
					user[userCount] = new String[3];   
					System.out.println("user Deleted");
				}
				else {
					System.out.println("no user found with this Id, try again.");
				}
				
				System.out.println("");
				break;
			}
			
		}	
		
		}
		while(true);
		
		input.close();
	}
}

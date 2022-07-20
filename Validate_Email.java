package Practice_project_2;

import java.util.ArrayList;
import java.util.Scanner;
public class Validate_Email {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<String> Email = new ArrayList<String>();
		Email.add("gokulkrish@gmail.com");
		Email.add("kalathi@gmail.com");
		Email.add("abishek@gmail.com");
		Email.add("vicky@gmail.com");
		Email.add("ganesh@gmail.com");
		System.out.println("Enter user Email_id: ");
		String user_Id = s.nextLine();
		//Validating user mail id is found or not
			if (Email.contains(user_Id)) {
				System.out.println();
				System.out.println("Email_Id " + user_Id + " found");
			} 
			else {
				System.out.println("Email_Id " + user_Id + " Not found");

			}
		}
	}
package myfirstpackage;

import java.util.Scanner;
public class conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/** STRING & CONDITIONALS */
		String username = "Carlpogi";
		String password = "carl1234";
			if (username == "Carlpogi") {
				System.out.println("Welcome " + username + ". Now please enter your password.");
					if (password == "carl1234") {
						System.out.println("Successfully Login");
					} else {
						System.out.println("Incorrect Password");
					}
		} else {
			System.out.println("No account found. Create your account first");
		}
			
		/** Integer, Input and If condition */	
		 //Enter your grade here!
		System.out.println("Please Enter your grade: ");
		Scanner yourgrade = new Scanner(System.in);
		int grade = yourgrade.nextInt();
		if(grade >= 75) {
			System.out.println("Congratulations you passed!");
			if(grade >= 85) {
				System.out.println("You are amazing! You really understand my lessons. Keep it up!");
				 if(grade >= 95) {
						System.out.println("You are one of the top performing students! Congratulations");
					}
			}
		} else {
			System.out.println("You have failed. Please try harder and don't give up!");
		}
		
		/** If else condition */
		System.out.println("Please Enter your Age : "); //Enter your age
		Scanner myage = new Scanner(System.in);
		int age = myage.nextInt();
		boolean isVIP = false; // Enter if VIP or not
		if(age > 18 && isVIP == true ) {
			System.out.println("You may enter the Lucky7 Casino! This way to our VIP casino room.");
		}else if(age > 18 && isVIP == false){
			System.out.println("You may enter the Lucky7 Casino.");
		}else if(age < 18 && isVIP == true) {
			System.out.println("Minors are not allowed inside the casino room, Please wait for your parents in the VIP lounge.");
		}else {
			System.out.println("Minors are not allowed.");
		}
			
		
		/** Switch condition */
	    	int month = 2;
	    	switch(month) {
	    		case 1:
	    			System.out.println("January");
	    			break;
	    		case 2:
	    			System.out.println("February");
	    			break;
	    		case 3:
	    			System.out.println("March");
	    			break;
	    		case 4:
	    			System.out.println("April");
	    			break;
	    		case 5:
	    			System.out.println("May");
	    			break;
	    		case 6:
	    			System.out.println("June");
	    			break;
	    		case 7:
	    			System.out.println("July");
	    			break;	
	    		case 8:
	    			System.out.println("August");
	    			break;
	    		case 9:
	    			System.out.println("September");
	    			break;
	    		case 10:
	    			System.out.println("October");
	    			break;
	    		case 11:
	    			System.out.println("November");
	    			break;
	    		case 12:
	    			System.out.println("December");
	    			break;
	    	}
		}
	}



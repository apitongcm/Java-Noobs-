package myfirstpackage;


import java.util.Scanner;
public class mysecondclass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please Enter Your USERNAME : __ ");
		Scanner username = new Scanner(System.in);
		System.out.print("Please Enter Your PASSWORD : ");
		Scanner password = new Scanner(System.in);
		System.out.println
		("Your Username is " + username.next() + " and Your Password is " + password.next());
		Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt();
		int seconds = days * 60 * 60 * 24;
		System.out.println(seconds);	
	}

}

package com.encapsulation;

import java.util.Random;
import java.util.Scanner;

public class Loginpage {
	static Scanner sc=new Scanner(System.in); 
	static Random random=new Random();

		final String username;
		private String password;
		final long mobileNum;
		
		public Loginpage(String username,long mobileNum) {
			this.username = username;
			this.mobileNum = mobileNum;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		int attempt=0;
		public  void islogin(String user,String pass) {
			
			while(attempt<3) {
			if(this.username.equals(user) && this.password.equals(pass)) {
				System.out.println("Login Successfull.......");
				break;
			}else {
				
				attempt++;
				System.err.println("Invalid Username / Password and attemps remaining are : "+(3-attempt));
				System.out.println("do you want login again if yes.. enter yes or no... ");
				String response=sc.next();
				if(response.equalsIgnoreCase("Yes")) {
					System.out.println("Enter userName");
					String userName=sc.next();
					System.out.println("Enter Password");
					String passWord=sc.next();
					islogin(userName, passWord);
				}else {
					System.exit(0);
				}
			}
			}
			if(attempt==3) {
				System.err.println("you have attempted 3 times invalid username/password");
				System.out.println("do you want reset your password if yes please enter yes or no... and click on the forget password button. ");
				String resetResponse=sc.next();
				if(resetResponse.equalsIgnoreCase("yes")) {
					System.out.println("Please provide your registered Mobile number.");
					long mobilenumber=sc.nextLong();
					if(this.mobileNum == mobilenumber) {
						int generatedOtp=otp();
						System.out.println("please check your registered mobile number and enter the OTP: "+generatedOtp);
						System.out.println("Enter OTP :");
						int otp=sc.nextInt();
						if(generatedOtp==otp) {
							System.out.println("Enter new password");
							String newPassword = sc.next();
							setPassword(newPassword);
							System.out.println("your password created successfull ");
						}else {
							System.out.println("Wrong otp please click on resend otp");
						}
					}
					else {
						System.out.println("please enter your registered mobile number");
					}
				}else {
					System.out.println("Thank You ...!!");
				}	
			}
		}
		public void registerPage() {
			System.out.println("Registration is Successfull");
			System.out.println("Please login...");
			System.out.println("Enter Username and Password");
			islogin(username, password);
		}
		public int otp() {
			return random.nextInt(9000);
		}
//		public void display()
//		{
//			System.out.println("Username : "+username+", Password : "+getPassword());
//		}
		public static void main(String[] args) {
			System.out.println("Welcome to our Application, please register...");
			System.out.println("Enter your Username: ");
			String username=sc.nextLine();
			System.out.println("Enter your password: ");
			String password = sc.nextLine();
			System.out.println("Enter your Mobile Number: ");
			long mobileNum = sc.nextLong();
			Loginpage lp=new Loginpage(username, mobileNum);
		
			lp.setPassword(password);
			lp.registerPage();
//			System.out.println("Enter your name/username: ");
//			String user=sc.nextLine();
//			System.out.println("Enter your password: ");
//			String pass=sc.nextLine();
//			lp.setPassword(password);
		}
}

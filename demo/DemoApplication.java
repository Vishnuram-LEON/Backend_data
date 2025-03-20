package com.demo;

import java.util.Scanner;

public class DemoApplication {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter username");
		String userName=sc.nextLine();
		System.out.println("enter password");
		String password=sc.nextLine();
		if(userName.equals("admin") && password.equals("1234")) {
			System.out.println("login success");
		}else {
			System.out.println("login failed");
		}
				
	}

}

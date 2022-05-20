package com.whatsapp.view;

import java.util.Scanner;

import com.whatsapp.controller.WhatsappController;

public class WhatsappView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "y";
		
		while(s.equals("y")) {
			
		
		System.out.println("********** Main Menu **********");
		System.out.println("Press 1 to create profile");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		
		WhatsappController wc = new WhatsappController();
		
		switch(ch) {
			case 1:
				wc.createProfile();
				break;
			default:
				System.out.println("Wrong choice");
		}
		System.out.println("Press y to contine");
		s = sc.next();
	}

	}

}

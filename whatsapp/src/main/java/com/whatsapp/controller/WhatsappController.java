package com.whatsapp.controller;

import java.util.Scanner;

import com.whatsapp.entity.WhatsappUser;
import com.whatsapp.service.WhatsappService;

public class WhatsappController {

	public void createProfile() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number:");
		int number = sc.nextInt();
		
		System.out.println("Enter Name:");
		String name = sc.next();
		
		System.out.println("Enter Password:");
		String password = sc.next();
		
		WhatsappUser wu = new WhatsappUser();
		wu.setNumber(number);
		wu.setName(name);
		wu.setPassword(password);
		
		WhatsappService ws = new WhatsappService();
		int i = ws.createProfileService(wu);
		
		if(i>0) {
			System.out.println("Your profile is created"+name);
		}
		else {
			System.out.println("oops profile is not created");
		}
		
		
		
		
	}
	
	

}

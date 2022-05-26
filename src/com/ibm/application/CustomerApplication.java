package com.ibm.application;

import com.ibm.bean.Customer;
import java.util.*;
import com.ibm.service.CustomerService;


public class CustomerApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creat instance of customer service class 
		CustomerService cs=new CustomerService();
		
		Scanner r= new Scanner(System.in);
		
		// call all the methods in customer 
		/*cs.createCustomer();
		cs.listCustomer();
		cs.updateCustomer(102);
		//cs.listCustomer();
		cs.deleteCustomer(2);
		cs.listCustomer();
		*/
		String text="";
		do {
			System.out.println("Press 1: Creat Customer"); 
			System.out.println("Press 2: Delete Customer");
			System.out.println("Press 3: Update Customer");
			System.out.println("Press 4: List Customer");
			System.out.println("Enter Your choice:");
			int option= r.nextInt();
			
		switch(option) {
		case 1:cs.createCustomer();
		break;
		case 2: cs.deleteCustomer(2);
		break;
		case 3:cs.updateCustomer(1);
		break;
		case 4: cs.listCustomer();
		break;
		default:System.out.println("Invalid Input");
		}
		System.out.println("Do yoy want to continue? Y/N");
		text = r.next();
		}while(text.equalsIgnoreCase("Y"));
		System.out.println("Thank You for using Application.");
		r.close();

}
	}

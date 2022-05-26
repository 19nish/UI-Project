package com.ibm.service;

import com.ibm.bean.Customer;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.Scanner;

public class CustomerService {
	Scanner inp= new Scanner(System.in);
	Customer myCustomers[]= new Customer[] {new Customer(),new Customer(),new Customer(),new Customer(),new Customer()};

	
	// Create customer 
	public void createCustomer() {
		
		System.out.println("How many customer you wants to create:" );
		int n=inp.nextInt();
		
		System.out.println("Enter the element of array:");
		for(int i = 0; i <=n; i++) {
		for (Customer d:myCustomers) {
			d.setCustID(inp.nextInt());
			d.setName(inp.nextLine());
			d.setAddress(inp.nextLine());
		}
		}
	
		
	/*	myCustomers[0].setCustID();
		myCustomers[0].setName("Ravi");
		myCustomers[0].setAddress("Palghar");
		
		myCustomers[1].setCustID(102);
		myCustomers[1].setName("Kiritish");
		myCustomers[1].setAddress("Indore,Madhypradesh");
		
		myCustomers[2].setCustID(103);
		myCustomers[2].setName("Keshav");
		myCustomers[2].setAddress("Gurgaon,Uttar Pradesh");
		
		myCustomers[3].setCustID(104);
		myCustomers[3].setName("Vijay");
		myCustomers[3].setAddress("Varnasi,Uttar Pradesh");
		
		myCustomers[4].setCustID(105);
		myCustomers[4].setName("Naresh");
		myCustomers[4].setAddress("Latur,Maharashtra");
		*/
		System.out.println("customer details are added");
		
	}
	//list customer 
	public void listCustomer() {
		for(Customer cust: myCustomers) {
			if(cust != null)
			System.out.println("All Customer Details one by one:\n "+cust.getCustID() + "---"+ cust.getName() + "--"+cust.getAddress());
			// System.out.println("list customer method")
		}
		
	}	// update customer
	public void updateCustomer(int custID) {
	
		System.out.println("\nData to be updated:" + custID);
		for (Customer i: myCustomers) {
			if(i.getCustID() == custID) {
				System.out.println("to update address please enter:");
				String newAddress = inp.nextLine();
				i.setAddress(newAddress);
				
			}
			
		}
		
	}
	public void deleteCustomer(int custID) {
		System.out.println("\ndelete customer: " + custID);
		int len = myCustomers.length;
		for(int i=custID-1;i<len-1;i++) {
			myCustomers[i]=myCustomers[i+1];
			
		}
		myCustomers[len-1]=null;
		len--;
		System.out.println("Value deleted successfully");
		System.out.println("List after deletion");
	
	}
}
	
	



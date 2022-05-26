package com.ibm.array;

import com.ibm.bean.Customer;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// array o primitive data type
		
		int arrayOfInt[]= new int[5];
		arrayOfInt[0]=101;
		arrayOfInt[1]=102;
		arrayOfInt[2]=103;
		arrayOfInt[3]=104;
		arrayOfInt[4]=105;
		
		for(int i= 0;i<arrayOfInt.length; i++) {
			System.out.println("primitive data is:"+arrayOfInt[i]);
		}
		
		//Array of wrapper class
		String names[]= new String[] {"Nishant","Kirtish","Ravi","Abhishek"};
		for(int i= 0;i<names.length; i++) {
			System.out.println("Participants Name: "+names[i]);
		}
		
		Customer myCustomers[]= new Customer[] {new Customer(),new Customer(),new Customer(),};
		myCustomers[0].setCustID(101);
		myCustomers[0].setName("Ravi");
		myCustomers[0].setAddress("Palghar");
		
		myCustomers[1].setCustID(102);
		myCustomers[1].setName("Kalin");
		myCustomers[1].setAddress("Indore,Madhypradesh");
		
		myCustomers[2].setCustID(103);
		myCustomers[2].setName("Keshav");
		myCustomers[2].setAddress("Gurgaon,Utter Pradesh");
		
		for(Customer cust: myCustomers) {
			System.out.println("All Customer Details one by one"+cust.getCustID() + "---"+ cust.getName() + "--"+cust.getAddress());
		}
		
		
		
	}
}

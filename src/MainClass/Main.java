package cogent.infotec.MainClass;

import java.util.Scanner;

import cogent.infotech.controller.ProductController;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductController pc = new ProductController();
		int choice = 0;
		do {
			System.out.println("1-add");
			System.out.println("2-Display");
			System.out.println("3-Update");
			System.out.println("4-Delete");
			System.out.println("5-Exit");
			System.out.println("Please enter your choice? ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: 
				System.out.println("Please enter product id");
				int pId = sc.nextInt();
				System.out.println("Please enter product Name");
				String pName = sc.next();
				System.out.println("Please enter product category");
				String pCat = sc.next();
				System.out.println("Please enter product date");
				String manufecture_date = sc.next();
				System.out.println("Please enter product expiry date ");
				String p_expiry_date = sc.next();
				pc.create(pId, pName, pCat, manufecture_date, p_expiry_date);
				
			}
			
		}while(choice !=5);
		
	}

}

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
			System.out.println("2-Delete product by Id");
			System.out.println("3-Delete by Category");
			System.out.println("4-find product by Id");
			System.out.println("5-Update Product");
			System.out.println("6-Update expired product");
			System.out.println("7-Exit!");
			
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
				break;
				
			case 2: 
				System.out.println("Enter the product id to be deleted");
				int deleteId = sc.nextInt();
				pc.delete(deleteId);
				break;
			case 3:
				System.out.println("Enter the product category to be deleted");
				String deleteCat = sc.next();
				pc.delete(deleteCat);
				break;
			case 4:
				System.out.println("Enter the product category");
				String findCat = sc.next();
				pc.find(findCat);
				break;
			case 5:
				System.out.println("Enter the product name to be updated");
				String name = sc.next();
				System.out.println("Enter the new price");
				int newPrice = sc.nextInt();
				pc.update(name, newPrice);
				break;
			case 6:
				pc.findExpired();
				break;
			case 7:
				break;
				
			default:
				System.out.println("Invalid Choice");
				break;
			
				
			}
			
			
		}while(choice !=7);
		
	}

}

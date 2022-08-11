

import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {

		ArrayList<Items> menuList = new ArrayList<Items>();

		menuList.add(new Items("Chicken Rice", "3.00" , "YES" ));
		menuList.add(new Items("Fried Rice", "3.50" , "YES" ));
		menuList.add(new Items("Nasi Lemak", "2.50" , "YES" ));
		
		menuList.add(new Items("Fish and Chip", "5.50" , "YES" ));
		menuList.add(new Items("Aglio olio", "3.50" , "YES" ));
		
		menuList.add(new Items("Vegetarian bee hoon", "2.50" , "YES" ));
		menuList.add(new Items("Prata set ", "2.50" , "YES" ));
		
		menuList.add(new Items("Ice milo", "1.50" , "YES" ));
		menuList.add(new Items("Ribena", "1.50" , "YES" ));
		menuList.add(new Items("Pokka Green tea", "1.80" , "YES" ));
		
		menuList.add(new Items("Strawberries", "0.80" , "YES" ));
		menuList.add(new Items("Watermelon", "0.80" , "YES" ));
		menuList.add(new Items("Banana", "0.80" , "YES" ));
		
		int option = 0;

		while (option != 2) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				C206_CaseStudy.viewAllItems(menuList);
				
			}else if (option == 2) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}
		}

	}

	public static void menu() {
		C206_CaseStudy.setHeader("MENU ITEMS APP");
		System.out.println("1. Show Menu Items");
		System.out.println("2. Quit");
		Helper.line(80, "-");

	}

	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

	public static String showAvailability(boolean isAvailable) {
		String avail;
		if (isAvailable == true) {
			avail = "YES";
		} else {
			avail = "NO";
		}
		return avail;
	}
	
	
	public static String retrieveAllItems(ArrayList<Items> menuList) {
		String output = "";
		for (int i = 0; i < menuList.size(); i++) {
			output += String.format("%-20s %-15s %-10s\n", menuList.get(i).getItem(),
					menuList.get(i).getCost(), 
					C206_CaseStudy.showAvailability(menuList.get(i).getIsAvailable()));
					
		}
		return output;
	}
	
	public static void viewAllItems(ArrayList<Items> menuList) {
		C206_CaseStudy.setHeader("Menu LIST");
		String output = String.format("%-20s %-15s %-10s\n", "ITEM", "COST",
				"AVAILABLE");
		 output += retrieveAllItems(menuList);	
		System.out.println(output);

	}

}

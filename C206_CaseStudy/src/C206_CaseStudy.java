

import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {

		ArrayList<Items> menuList = new ArrayList<Items>();
		ArrayList<userAccount> accountList = new ArrayList<userAccount>();

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

		while (option != 3) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");
			
			if(option == 1) {
				
				int option2 = 0;
				
				while (option2 != 4) {
					
					C206_CaseStudy.AcctMenu();
					option2 = Helper.readInt("Enter an option > ");
					
					if(option2 == 1) {
						C206_CaseStudy.viewAllAccount(accountList);
					}else if(option2 == 2) {
						userAccount acc = inputaccount();
						C206_CaseStudy.addacc(accountList, acc);
					}else if(option2 == 3) {
						userAccount acc = inputaccount();
						C206_CaseStudy.deleteacc(accountList, acc);
					}else if(option2 == 4) {
						C206_CaseStudy.menu();
					}else {
						System.out.println("Invalid option");
					}
				}
				
				
			}else if (option == 2) {
				C206_CaseStudy.viewAllItems(menuList);
				
			}else if (option == 3) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}
		}

	}
	
	public static void AcctMenu() {
		C206_CaseStudy.setHeader("ACCOUNT");
		System.out.println("1. View Account");
		System.out.println("2. Add Account");
		System.out.println("3. Delete Account");
		System.out.println("4. Main Menu");
		Helper.line(80, "-");

	}

	public static void menu() {
		C206_CaseStudy.setHeader("MENU ITEMS APP");
		System.out.println("1. User Account");
		System.out.println("2. Show Menu Items");
		System.out.println("3. Quit");
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
	public static String retrieveAllacc(ArrayList<userAccount> accountList) {
	    String output = "";

	    for (int i = 0; i < accountList.size(); i++) {
	      userAccount accountlist = accountList.get(i);
	      output += String.format("%-40s %-20s\n", accountlist.getUsername(), accountlist.getPassword());
	    }

	    return (output);
	  }

	  // USER ACCOUNT
	  private static void viewAllAccount(ArrayList<userAccount> accountList) {
	    Helper.line(80, "-");
	    System.out.println("VIEW Accounts");
	    Helper.line(80, "-");

	    String output = String.format("%-40s %-20s\n", "USERNAME", "PASSWORD");
	    output += retrieveAllacc(accountList);

	    System.out.println(output);

	  }

	  public static userAccount inputaccount() {
	    String username = Helper.readString("Enter username > ");
	    String password = Helper.readString("Enter password > ");

	    userAccount acc = new userAccount(username, password);

	    return acc;

	  }

	  public static void addacc(ArrayList<userAccount> accountList, userAccount acc) {

	    accountList.add(acc);
	    System.out.println("Account added!");

	  }

	  public static void deleteacc(ArrayList<userAccount> accountList, userAccount acc) {
	    boolean accFound = false;

	    for (int i = 0; i < accountList.size(); i++) {
	      if (acc.getUsername().equals(accountList.get(i).getUsername())) {
	        accFound = true;
	        if (accFound == false) {
	          System.out.println("Username not found");
	        } else {
	          accountList.remove(i);
	          System.out.println("Account deleted!");
	        }
	        accountList.remove(acc);

	      }
	    }

	  }
	

}

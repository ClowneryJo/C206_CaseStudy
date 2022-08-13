
import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		
		ArrayList<Menu> monthlyMenuList = new ArrayList<Menu>();
		ArrayList<Items> menuList = new ArrayList<Items>();
		ArrayList<userAccount> accountList = new ArrayList<userAccount>();
		ArrayList<lunchbox> lunchboxlist = new ArrayList<lunchbox>();
		ArrayList<orderBill> orderBillList = new ArrayList<orderBill>();
		
		//Add Asian Menu
		monthlyMenuList.add(new Menu("Asian", "Fried Rice", 2.00, "Yes"));
		monthlyMenuList.add(new Menu("Asian", "Dumpling Noodle", 3.50, "Yes"));
		monthlyMenuList.add(new Menu("Asian", "Oyakodon", 3.00, "Yes"));
		
		//Add Western Menu
		monthlyMenuList.add(new Menu("Western", "Tomato Pasta ", 2.50, "Yes"));
		monthlyMenuList.add(new Menu("Western", "Chicken Cutlet With Fries", 4.00, "Yes"));
		monthlyMenuList.add(new Menu("Western", "Chicken Tortilla Wrap", 3.00, "Yes"));
			

		//Add Vegetarian Menu
		monthlyMenuList.add(new Menu("Vegetarian", "Teriyaki Tofu Rice ", 3.50, "Yes"));
		monthlyMenuList.add(new Menu("Vegetarian", "Corn Sushi", 2.50, "Yes"));
		monthlyMenuList.add(new Menu("Vegetarian", "Roasted Chickpea Wrap", 3.00, "Yes"));
			
		//Add Drinks Menu
		monthlyMenuList.add(new Menu("Drinks", "Apple Juice", 1.80, "Yes"));
		monthlyMenuList.add(new Menu("Drinks", "Soymilk", 2.00, "Yes"));
		monthlyMenuList.add(new Menu("Drinks", "Ice Chocolate", 1.50, "Yes"));

		//Add Fruits Menu
		monthlyMenuList.add(new Menu("Fruits", "Watermelon", 1.20, "Yes"));
		monthlyMenuList.add(new Menu("Fruits", "Pineapple", 1.40, "Yes"));
		monthlyMenuList.add(new Menu("Fruits", "Grapes", 1.40, "Yes"));
		
		//Order Menu
		menuList.add(new Items("Chicken Rice", "3.00", "YES"));
		menuList.add(new Items("Fried Rice", "3.50", "YES"));
		menuList.add(new Items("Nasi Lemak", "2.50", "YES"));

		menuList.add(new Items("Fish and Chip", "5.50", "YES"));
		menuList.add(new Items("Aglio olio", "3.50", "YES"));

		menuList.add(new Items("Vegetarian bee hoon", "2.50", "YES"));
		menuList.add(new Items("Prata set ", "2.50", "YES"));

		menuList.add(new Items("Ice milo", "1.50", "YES"));
		menuList.add(new Items("Ribena", "1.50", "YES"));
		menuList.add(new Items("Pokka Green tea", "1.80", "YES"));

		menuList.add(new Items("Strawberries", "0.80", "YES"));
		menuList.add(new Items("Watermelon", "0.80", "YES"));
		menuList.add(new Items("Banana", "0.80", "YES"));

		
		int option = 0;

		while (option != 6) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				
				int option2 = 0;
				C206_CaseStudy.MonthlyMenu();
				
				while (option2 != 4) {
					
					option = Helper.readInt("Enter an option > ");
								
					if(option == 1) {
						//View monthly menu
						C206_CaseStudy.viewMonthlyMenu(monthlyMenuList);				
					} else if (option == 2) {
						//Create monthly menu
						Menu addMonthlyMenu = createMenu();
						C206_CaseStudy.createMonthlyMenu(monthlyMenuList, addMonthlyMenu);
						System.out.println("Monthly Menu Successfully Added!");

					} else if (option == 3) {
						// Delete monthly menu
						C206_CaseStudy.deleteMonthlyMenu(monthlyMenuList);
						
					} else if (option == 4){
						C206_CaseStudy.menu();
						
					} else {
						System.out.println("Invalid option.");
					}
				}	
													
			} else if (option == 2) {

				int option3 = 0;

				while (option3 != 4) {

					C206_CaseStudy.AcctMenu();
					option3 = Helper.readInt("Enter an option > ");

					if (option3 == 1) {
						C206_CaseStudy.viewAllAccount(accountList);
						
					} else if (option3 == 2) {
						userAccount acc = inputaccount();
						C206_CaseStudy.addacc(accountList, acc);
						
					} else if (option3 == 3) {
						userAccount acc = inputaccount();
						C206_CaseStudy.deleteacc(accountList, acc);
						
					} else if (option3 == 4) {
						//C206_CaseStudy.menu();
						
					} else {
						System.out.println("Invalid option");
					}
				}

			} else if (option == 3) {
				C206_CaseStudy.viewAllItems(menuList);
			
				int option4 = 0;

				while (option4 != 4) {

					C206_CaseStudy.LBMenu();
					option4 = Helper.readInt("Enter an option > ");

					if (option4 == 1) {
						lunchbox acc = inputlunchbox();
						C206_CaseStudy.addlunchbox(lunchboxlist, acc);
					} else if (option4 == 2) {
						C206_CaseStudy.viewlunchboxorder(lunchboxlist);
					} else if (option4 == 3) {
						lunchbox acc = deletelunchbox();
						C206_CaseStudy.deletelunchorder(lunchboxlist, acc);
					} else if (option4 == 4) {
						//C206_CaseStudy.menu();
					} else {
						System.out.println("Invalid option");
					}
				}

				C206_CaseStudy.viewAllItems(menuList);

			} else if (option == 4) {
				C206_CaseStudy.viewAllItems(menuList);

				int option5 = 0;

				while (option5 != 4) {

					C206_CaseStudy.OrderMenu();
					option5 = Helper.readInt("Enter an option > ");

					if (option5 == 1) {
						orderBill ob = inputorderBills();
						C206_CaseStudy.addorderBill(orderBillList, ob);
						
					} else if (option5 == 2) {
						C206_CaseStudy.viewAllorderbill(orderBillList);
						
					} else if (option5 == 3) {
						C206_CaseStudy.deleteOrderBill(orderBillList);
						System.out.println("Order bill deleted!");
						
					} else if (option5 == 4) {
						//C206_CaseStudy.menu();
						
					} else {
						System.out.println("Invalid option");
					}
				}
			} else if (option == 5) {
				C206_CaseStudy.viewAllItems(menuList);

				int option6 = 0;

				while (option6 != 4) {

					C206_CaseStudy.itemMenu();
					option6 = Helper.readInt("Enter an option > ");

					if (option6 == 1) {
						Items additems = createItems();
						C206_CaseStudy.createMonthlyItem(menuList, additems);
						
					} else if (option6 == 2) {
						C206_CaseStudy.deleteMonthlyItem(menuList);
						System.out.println("Item deleted!");
					} else if (option6 == 3) {
						C206_CaseStudy.viewAllItems(menuList);
											
					} else if (option6 == 4) {
						//C206_CaseStudy.menu();
						
					} else {
						System.out.println("Invalid option");
					}
				}
			} else if (option == 6) {
				System.out.println("Bye!");
				
			} else {
				System.out.println("Invalid option");
			}
		}
	}

	public static void MonthlyMenu(){
		Helper.line(80, "-");
		System.out.println("MONTHLY MENU");
		Helper.line(80,"-");
		System.out.println("1. View monthly menu(s)");
		System.out.println("2. Create new monthly menu");
		System.out.println("3. Delete monthly menu");
		System.out.println("4. Main Menu");
		Helper.line(80, "-");
	
	}
	
	public static void OrderMenu() {
		C206_CaseStudy.setHeader("ORDER BILL");
		System.out.println("1. Add Order Bill");
		System.out.println("2. View Order Bill");
		System.out.println("3. Delete Order Bill");
		System.out.println("4. Main Menu");
		Helper.line(80, "-");

	}
	
	public static void itemMenu() {
		C206_CaseStudy.setHeader("ITEM MENU");
		System.out.println("1. ADD ITEM");
		System.out.println("2. DELETE ITEM");
		System.out.println("3. VIEW ITEM");
		System.out.println("4. Main Menu");
		Helper.line(80, "-");

	}

	public static void AcctMenu() {
		C206_CaseStudy.setHeader("ACCOUNT");
		System.out.println("1. View Account");
		System.out.println("2. Add Account");
		System.out.println("3. Delete Account");
		System.out.println("4. Main Menu");
		Helper.line(80, "-");

	}

	public static void LBMenu() {
		C206_CaseStudy.setHeader("LUNCHBOX ORDER");
		System.out.println("1. Add lunchbox order");
		System.out.println("2. Retrieve order");
		System.out.println("3. Delete order");
		System.out.println("4. Main Menu");
		Helper.line(80, "-");

	}

	public static void menu() {
		C206_CaseStudy.setHeader("MENU ITEMS APP");
		System.out.println("1. Monthly Menu");
		System.out.println("2. User Account");
		System.out.println("3. Show Menu Items");
		System.out.println("4. Order Bill");
		System.out.println("5. Add/Delete Main Menu Item");
		System.out.println("6. Quit");
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
			output += String.format("%-20s %-15s %-10s\n", menuList.get(i).getItem(), menuList.get(i).getCost(),
					C206_CaseStudy.showAvailability(menuList.get(i).getIsAvailable()));

		}
		return output;
	}

	public static void viewAllItems(ArrayList<Items> menuList) {
		C206_CaseStudy.setHeader("Menu LIST");
		String output = String.format("%-20s %-15s %-10s\n", "ITEM", "COST", "AVAILABLE");
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
	
	public static Items createItems() {
	    String items= Helper.readString("Enter item > ");
	    String cost = Helper.readString("Enter cost > ");
	    String available = "Yes";
	    
	    Items additems = new Items(items, cost, available);
	    return additems;
	  }
	
	public static void createMonthlyItem(ArrayList<Items> menuList, Items additems) {

	    menuList.add(additems);
	    System.out.println("Item Added!");

	  }
	
	
	public static boolean deleteItem(ArrayList<Items> menuList,  String item) {
		boolean itemFound = false;

	    for (int i = 0; i < menuList.size(); i++) {
	      if (item.equalsIgnoreCase(menuList.get(i).getItem())
	    		  && menuList.get(i).getIsAvailable() == true) {

	    	  menuList.remove(i);
	        itemFound = true;
	      	}			      
	    }
		return itemFound;
	}
	
	
	public static void deleteMonthlyItem(ArrayList<Items> menuList) {
		String item = Helper.readString("Enter item to remove > ");
		
		Boolean itemFound = deleteItem(menuList, item);

	    if (itemFound == false) {
	      System.out.println("Menu Item given not found!");
	    } else {
	      System.out.println("Deleted successfully!");
	    }
	}
	
	//MONTHLYMENU
	
	//================================= Monthly Menu Option 1 View Items ==================================//
	public static String availability(boolean availablity) {
	    String available;
	    if (availablity == true) {
	      available = "Yes";
	    } else {
	      available = "No";
	    }
	    return available;
	  }

	public static String retrieveMonthlyMenu(ArrayList<Menu> monthlyMenuList) {
		
		String output = "";
		for (int i = 0; i < monthlyMenuList.size(); i++) {
		  
			String category = monthlyMenuList.get(i).getCategory();
			String item = monthlyMenuList.get(i).getItem();
			double price = monthlyMenuList.get(i).getPrice();
			String available = C206_CaseStudy.availability(monthlyMenuList.get(i).getIsAvailable());
					
		    output += String.format("%-20s %-40s %-20.2f %-10s\n", category ,item ,price ,available); 	
		}
		return output;	
	}
	
	public static void viewMonthlyMenu(ArrayList<Menu> monthlyMenuList) {
		Helper.line(80, "=");
	    System.out.println("VIEW MONTHLY MENU");
	    Helper.line(80, "=");
	    
	    String output = String.format("%-20s %-40s %-20s %-10s\n", "CATEGORY", "FOOD ITEMS", "COST", "AVAILABILITY");		    
	    output += retrieveMonthlyMenu(monthlyMenuList);
	    
	    System.out.println(output);
	    
	}		   
	
	//================================= Monthly Menu Option 2 Create New Items ==================================//
	public static Menu createMenu() {
	    String category= Helper.readString("Enter category > ");
	    String items = Helper.readString("Enter food inside of monthly menu > ");
	    double price = Helper.readDouble("Enter monthly menu price > ");
	    String available = "Yes";
	    
	    Menu addMonthlyMenu = new Menu(category, items, price, available);
	    return addMonthlyMenu;
	  }
	
	public static void createMonthlyMenu(ArrayList<Menu> monthlyMenuList, Menu addMonthlyMenu) {

	    monthlyMenuList.add(addMonthlyMenu);

	  }
	
	
	//================================= Monthly Menu Option 3 Delete Items ==================================//
	public static boolean deleteMenu(ArrayList<Menu> monthlyMenuList,  String item) {
		boolean menuFound = false;

	    for (int i = 0; i < monthlyMenuList.size(); i++) {
	      if (item.equalsIgnoreCase(monthlyMenuList.get(i).getItem())
	    		  && monthlyMenuList.get(i).getIsAvailable() == true) {

	        monthlyMenuList.remove(i);
	        menuFound = true;
	      	}			      
	    }
		return menuFound;
	}
	
	
	public static void deleteMonthlyMenu(ArrayList<Menu> monthlyMenuList) {
		String item = Helper.readString("Enter category to remove > ");
		
		Boolean menuFound = deleteMenu(monthlyMenuList, item);

	    if (menuFound == false) {
	      System.out.println("Menu Item given not found!");
	    } else {
	      System.out.println("Deleted successfully!");
	    }
	}	
	
	// USER ACCOUNT
	
	//================================= User Account Option 1 View Accounts ==================================//
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
	
	//================================= User Account Option 2 Add Accounts ==================================//
	public static void addacc(ArrayList<userAccount> accountList, userAccount acc) {

		accountList.add(acc);
		System.out.println("Account added!");

	}

	//================================= User Account Option 3 Delete Accounts ==================================//
	
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

	
	//LUNCHBOX MENU
	
	//================================= LunchBox Option 1 View LunchBoxes ==================================//
	
	public static String retrievelunchboxorder(ArrayList<lunchbox> lunchboxlist) {
		String output = "";
		for (int i = 0; i < lunchboxlist.size(); i++) {
			output += String.format("%-40s %-20s %-20s %-20s %-40s\n", lunchboxlist.get(i).getId(),
					lunchboxlist.get(i).getDate(), lunchboxlist.get(i).getFood(), lunchboxlist.get(i).getDrink(),
					lunchboxlist.get(i).getFruit());
		}
		return output;
	}
	
	public static void viewlunchboxorder(ArrayList<lunchbox> lunchboxlist) {
		C206_CaseStudy.setHeader("LUNCHBOX ORDER LIST");
		String output = String.format("%-40s %-20s %-20s %-20s %-40s\n", "ID", "DATE", "FOOD", "DRINK", "FRUIT");
		output += retrievelunchboxorder(lunchboxlist);
		System.out.println(output);
	}

	//================================= LunchBox Option 2 Add LunchBox Item ==================================//
		
	public static lunchbox inputlunchbox() {
		String id = Helper.readString("Enter id > ");
		String date = Helper.readString("Enter date > ");
		String food = Helper.readString("Enter food > ");
		String drink = Helper.readString(" Enter drink > ");
		String fruit = Helper.readString("Enter fruit> ");
		lunchbox acc = new lunchbox(id, date, food, drink, fruit);
		System.out.println("Lunchbox added!");
		return acc;
	}
	
	public static void addlunchbox(ArrayList<lunchbox> lunchboxlist, lunchbox LB) {
		lunchboxlist.add(LB);
	}
	
	//================================= LunchBox Option 3 Delete LunchBox Item ==================================//
	
	public static lunchbox deletelunchbox() {
	    String id = Helper.readString("Enter id > ");
	    String date = Helper.readString("Enter date > ");
	    String food = Helper.readString("Enter food > ");
	    String drink = Helper.readString(" Enter drink > ");
	    String fruit = Helper.readString("Enter fruit> ");
	    lunchbox acc = new lunchbox(id, date, food, drink, fruit);
	    return acc;
	  }

	public static void deletelunchorder(ArrayList<lunchbox> lunchboxlist, lunchbox LB) {
		boolean idFound = false;

		for (int i = 0; i < lunchboxlist.size(); i++) {
			if (LB.getId().equals(lunchboxlist.get(i).getId())) {
				idFound = true;
				if (idFound == false) {
					System.out.println("order not found");
				} else {
					lunchboxlist.remove(i);
					System.out.println("order deleted!");
				}
				lunchboxlist.remove(LB);

			}

		}
	}
	
	
	//ORDER BILL
	
	//================================= OrderBill Option 1 Add Order Bill ==================================//
	
	public static orderBill inputorderBills() {
		Helper.line(80, "-");
		System.out.println("ADD ORDER BILL");
		Helper.line(80, "-");

		String id = Helper.readString("Enter id > ");
		String date = Helper.readString("Enter date > ");
		String meal = Helper.readString("Enter meal > ");
		String drink = Helper.readString("Enter drink > ");
		String fruit = Helper.readString("Enter fruit > ");
		double price = Helper.readDouble("Enter price > ");

		orderBill ob = new orderBill(id, date, meal, drink, fruit, price);
		return ob;
	}

	public static void addorderBill(ArrayList<orderBill> orderBillList, orderBill ob) {
		orderBillList.add(ob);
		System.out.println("Order Bill Added!");
	}

	//================================= OrderBill Option 2 Retrieve Order Bill ==================================//
	
	public static String retrieveorderBills(ArrayList<orderBill> orderBillList) {

		String output = "";

		for (int i = 0; i < orderBillList.size(); i++) {
			orderBill orderBilllist = orderBillList.get(i);
			output += String.format("%-10s %-30s %-20s %-15s %-40s %-20.2f\n", orderBilllist.getId(),
					orderBilllist.getDate(), orderBilllist.getMeal(), orderBilllist.getDrink(),
					orderBilllist.getFruit(), orderBilllist.getPrice());
		}

		return (output);
	}

	private static void viewAllorderbill(ArrayList<orderBill> orderBillList) {
		Helper.line(80, "-");
		System.out.println("VIEW ORDER BILL");
		Helper.line(80, "-");

		String output = String.format("%-10s %-30s %-20s %-15s %-40s %-20s\n", "ORDER ID", "DATE", "MEAL", "DRINK",
				"FRUIT", "PRICE");
		output += retrieveorderBills(orderBillList);

		System.out.println(output);
	}

	//================================= OrderBill Option 3 Delete Order Bill ==================================//	
	
//		  public static boolean DeleteOrderBill(ArrayList<orderBill> orderBillList, String id) {
//			    boolean isDeleted = false;
//
//			    for (int i = 0; i < orderBillList.size(); i++) {
//			      String obID = orderBillList.get(i).getId();
//			      if (id == obID) {
//			        isDeleted = true;
//			      }
//
//			    }
//			    return isDeleted;
//			  }
//		  
	public static void deleteOrderBill(ArrayList<orderBill> orderBillList) {
		Helper.line(80, "-");
		System.out.println("DELETE ORDER BILL");
		Helper.line(80, "-");

		boolean orderBillFound = false;
		String orderBillDelete = Helper.readString("Enter order id to delete > ");
		for (int i = 0; i < orderBillList.size(); i++) {
			if (orderBillDelete.equals(orderBillList.get(i).getId())) {
				orderBillFound = true;
				if (orderBillFound == false) {
					System.out.println("Menu description given not found!");
				} else {
					orderBillList.remove(i);
					System.out.println("Deleted successfully!");
				}
			}
		}
	}
}


import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {

		ArrayList<Items> menuList = new ArrayList<Items>();
		ArrayList<userAccount> accountList = new ArrayList<userAccount>();
		ArrayList<lunchbox> lunchboxlist = new ArrayList<lunchbox>();
		ArrayList<orderBill> orderBillList = new ArrayList<orderBill>();

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

		while (option != 4) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {

				int option2 = 0;

				while (option2 != 4) {

					C206_CaseStudy.AcctMenu();
					option2 = Helper.readInt("Enter an option > ");

					if (option2 == 1) {
						C206_CaseStudy.viewAllAccount(accountList);
					} else if (option2 == 2) {
						userAccount acc = inputaccount();
						C206_CaseStudy.addacc(accountList, acc);
					} else if (option2 == 3) {
						userAccount acc = inputaccount();
						C206_CaseStudy.deleteacc(accountList, acc);
					} else if (option2 == 4) {
						//C206_CaseStudy.menu();
					} else {
						System.out.println("Invalid option");
					}
				}

			} else if (option == 2) {
				C206_CaseStudy.viewAllItems(menuList);

				int option3 = 0;

				while (option3 != 4) {

					C206_CaseStudy.LBMenu();
					option3 = Helper.readInt("Enter an option > ");

					if (option3 == 1) {
						lunchbox acc = inputlunchbox();
						C206_CaseStudy.addlunchbox(lunchboxlist, acc);
					} else if (option3 == 2) {
						C206_CaseStudy.viewlunchboxorder(lunchboxlist);
					} else if (option3 == 3) {
						lunchbox acc = deletelunchbox();
						C206_CaseStudy.deletelunchorder(lunchboxlist, acc);
					} else if (option3 == 4) {
						C206_CaseStudy.menu();
					} else {
						System.out.println("Invalid option");
					}
				}

				C206_CaseStudy.viewAllItems(menuList);

			} else if (option == 3) {
				C206_CaseStudy.viewAllItems(menuList);

				int option4 = 0;

				while (option4 != 4) {

					C206_CaseStudy.OrderMenu();
					option4 = Helper.readInt("Enter an option > ");

					if (option4 == 1) {
						orderBill ob = inputorderBills();
						C206_CaseStudy.addorderBill(orderBillList, ob);
					} else if (option4 == 2) {
						C206_CaseStudy.viewAllorderbill(orderBillList);
					} else if (option4 == 3) {
						C206_CaseStudy.deleteOrderBill(orderBillList);
						System.out.println("Order bill deleted!");
					} else if (option4 == 4) {
						//C206_CaseStudy.menu();
					} else {
						System.out.println("Invalid option");
					}
				}
			} else if (option == 4) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}
		}

	}

	public static void OrderMenu() {
		C206_CaseStudy.setHeader("ORDER BILL");
		System.out.println("1. Add Order Bill");
		System.out.println("2. View Order Bill");
		System.out.println("3. Delete Order Bill");
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
		System.out.println("1. User Account");
		System.out.println("2. Show Menu Items");
		System.out.println("3. Order Bill");
		System.out.println("4. Quit");
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

	public static void viewlunchboxorder(ArrayList<lunchbox> lunchboxlist) {
		C206_CaseStudy.setHeader("LUNCHBOX ORDER LIST");
		String output = String.format("%-40s %-20s %-20s %-20s %-40s\n", "ID", "DATE", "FOOD", "DRINK", "FRUIT");
		output += retrievelunchboxorder(lunchboxlist);
		System.out.println(output);
	}

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
	public static lunchbox deletelunchbox() {
	    String id = Helper.readString("Enter id > ");
	    String date = Helper.readString("Enter date > ");
	    String food = Helper.readString("Enter food > ");
	    String drink = Helper.readString(" Enter drink > ");
	    String fruit = Helper.readString("Enter fruit> ");
	    lunchbox acc = new lunchbox(id, date, food, drink, fruit);
	    return acc;
	  }

	public static void addlunchbox(ArrayList<lunchbox> lunchboxlist, lunchbox LB) {
		lunchboxlist.add(LB);
	}

	public static String retrievelunchboxorder(ArrayList<lunchbox> lunchboxlist) {
		String output = "";
		for (int i = 0; i < lunchboxlist.size(); i++) {
			output += String.format("%-40s %-20s %-20s %-20s %-40s\n", lunchboxlist.get(i).getId(),
					lunchboxlist.get(i).getDate(), lunchboxlist.get(i).getFood(), lunchboxlist.get(i).getDrink(),
					lunchboxlist.get(i).getFruit());
		}
		return output;
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

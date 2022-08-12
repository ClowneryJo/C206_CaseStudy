import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {

	private userAccount A1;
	private userAccount A2;
	private userAccount A3;

	private orderBill o1;
	private orderBill o2;
	private orderBill o3;

	// prepare test data
	private Menu m1;
	private Menu m2;
	private Menu m3;
	private Menu m4;
	private Menu m5;

	private lunchbox L1;
	private lunchbox L2;
	private lunchbox L3;

	private ArrayList<Menu> monthlyMenu;

	private ArrayList<orderBill> orderBillList;

	private ArrayList<userAccount> userAccountList;

	private ArrayList<lunchbox> lunchBoxList;

	@Before
	public void setUp() throws Exception {
		// Prepare Asian Menu
		m1 = new Menu("Asian", "Fried Rice", 2.00, "Yes");

		// Prepare Western Menu
		m2 = new Menu("Western", "Tomato Pasta ", 2.50, "Yes");

		// Prepare Vegetarian Menu
		m3 = new Menu("Vegetarian", "Teriyaki Tofu Rice ", 3.50, "Yes");

		// Prepare Drinks Menu
		m4 = new Menu("Drinks", "Apple Juice", 1.80, "Yes");

		// Prepare Fruits Menu
		m5 = new Menu("Fruits", "Watermelon", 1.20, "Yes");

		monthlyMenu = new ArrayList<Menu>();

		A1 = new userAccount("Badi", "Bud123");
		A2 = new userAccount("Xav", "Xav123");
		A3 = new userAccount("ZH", "ZH123");

		userAccountList = new ArrayList<userAccount>();

		o1 = new orderBill("m1002", "6 june", "nasi lemak", "ice milo", "banana", 5.3);
		o2 = new orderBill("m1003", "5 june", "chicken rice", "green tea", "orange", 7.3);
		o3 = new orderBill("m1004", "4 june", "fried rice", "lemon tea", "apple", 6.3);

		orderBillList = new ArrayList<orderBill>();

		lunchBoxList = new ArrayList<lunchbox>();
		L1 = new lunchbox("123", "7 july", "nasi lemak", "ice milo", "banana");
		L2 = new lunchbox("1234", "8 july", "chicken rice", "green tea", "orange");
		L3 = new lunchbox("12345", "9 july", "fried rice", "lemon tea", "apple");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void c206_test() {
		// fail("Not yet implemented");
		assertTrue("C206_CaseStudy_SampleTest ", true);
	}

	@Test
	public void testaddacc() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid account arraylist to add to", userAccountList);

		// Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addacc(userAccountList, A1);
		assertEquals("Test if that account arraylist size is 1?", 1, userAccountList.size());

		// The item just added is as same as the first item of the list
		assertSame("Test that account is added same as 1st item of the list?", A1, userAccountList.get(0));

		// Add another item. test The size of the list is 2?
		C206_CaseStudy.addacc(userAccountList, A2);
		C206_CaseStudy.addacc(userAccountList, A3);
		assertEquals("Test that account arraylist size is 3?", 3, userAccountList.size());
		assertSame("Test that account is added same as 3rd item of the list?", A3, userAccountList.get(2));
	}

	@Test
	public void testdeleteacc() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid account arraylist to delete from", userAccountList);

		// Given an empty list, after adding 1 item, the size of the list is 1
		String allacc = C206_CaseStudy.retrieveAllacc(userAccountList);
		String testOutput = "";
		assertEquals("Test that the retrived accountlist is empty?", testOutput, allacc);

		C206_CaseStudy.addacc(userAccountList, A1);
		C206_CaseStudy.deleteacc(userAccountList, A1);

		assertEquals("Test that the account list equals 0", 0, userAccountList.size());

		C206_CaseStudy.addacc(userAccountList, A1);
		C206_CaseStudy.addacc(userAccountList, A2);
		C206_CaseStudy.deleteacc(userAccountList, A2);
		assertSame("Test user account is still in the list?", A1, userAccountList.get(0));
		assertEquals("Test that the useraccount equals 1", 1, userAccountList.size());
	}

	@Test
	public void viewAllAccount() {
		// fail("Not yet implemented");
		// write your code here
		assertNotNull("Test if there is valid account arraylist to add to", userAccountList);

		String acc = C206_CaseStudy.retrieveAllacc(userAccountList);
		String testOutput = "";
		assertEquals("Check that ViewAllAccountlist", testOutput, acc);

		C206_CaseStudy.addacc(userAccountList, A2);
		C206_CaseStudy.addacc(userAccountList, A3);
		assertEquals("Test if that account arraylist size is 2?", 2, userAccountList.size());

		acc = C206_CaseStudy.retrieveAllacc(userAccountList);
		testOutput = String.format("%-40s %-20s\n", "Xav", "Xav123");
		testOutput += String.format("%-40s %-20s\n", "ZH", "ZH123");

		assertEquals("Check that ViewAlluserAccountList", testOutput, acc);

	}

	@Test
	public void testviewAllorderbill() {
		// fail("Not yet implemented");
		// write your code here
		assertNotNull("Test if there is valid orderbill arraylist to add to", orderBillList);
		String ob = C206_CaseStudy.retrieveorderBills(orderBillList);
		String testOutput = "";
		assertEquals("Check that ViewAllOrderBillList", testOutput, ob);

		C206_CaseStudy.addorderBill(orderBillList, o1);
		C206_CaseStudy.addorderBill(orderBillList, o2);
		assertEquals("Test if that OrderBill arraylist size is 2?", 2, orderBillList.size());

		ob = C206_CaseStudy.retrieveorderBills(orderBillList);
		testOutput = String.format("%-10s %-30s %-20s %-15s %-40s %-20s\n", "m1002", "6 june", "nasi lemak", "ice milo",
				"banana", 5.3);
		testOutput += String.format("%-10s %-30s %-20s %-15s %-40s %-20s\n", "m1003", "5 june", "chicken rice",
				"green tea", "orange", 7.3);

		assertEquals("Check that ViewAllOrderBill", testOutput, ob);

	}

	@Test
	public void testaddorderBill() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid account arraylist to add to", orderBillList);

		// Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addorderBill(orderBillList, o1);
		assertEquals("Test if that account arraylist size is 1?", 1, orderBillList.size());

		// The item just added is as same as the first item of the list
		assertSame("Test that account is added same as 1st item of the list?", o1, orderBillList.get(0));

		// Add another item. test The size of the list is 2?
		C206_CaseStudy.addorderBill(orderBillList, o2);
		C206_CaseStudy.addorderBill(orderBillList, o3);
		assertEquals("Test that account arraylist size is 3?", 3, orderBillList.size());
		assertSame("Test that account is added same as 3rd item of the list?", o3, orderBillList.get(2));
	}

	
	@Test
	public void testdeleteOrderBill() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid order bill arraylist to delete from", orderBillList);

		// Given an empty list, after adding 1 item, the size of the list is 1
		String ob = C206_CaseStudy.retrieveorderBills(orderBillList);
		String testOutput = "";
		assertEquals("Test that the retrieved accountlist is empty?", testOutput, ob);

		C206_CaseStudy.addorderBill(orderBillList, o1);
		C206_CaseStudy.deleteOrderBill(orderBillList);

		assertEquals("Test that the account list equals 0", 0, orderBillList.size());

		C206_CaseStudy.addorderBill(orderBillList, o1);
		C206_CaseStudy.addorderBill(orderBillList, o2);
		C206_CaseStudy.deleteOrderBill(orderBillList);
		assertSame("Test order bill is still in the list?", o1, orderBillList.get(0));
		assertEquals("Test that the order bill equals 1", 1, orderBillList.size());
	}

	@Test
	public void testViewMonthlyMenu() {
		// Test if Item list is not null but empty, so that can view items
		assertNotNull("Test if there is valid Monthly Menu arraylist to view", monthlyMenu);

		// test if the list of menu items retrieved from the SourceCentre is empty
		String allMenuItems = C206_CaseStudy.retrieveMonthlyMenu(monthlyMenu);
		String testOutput = "";
		assertEquals("Check that ViewMonthlyMenu", testOutput, allMenuItems);

		// Given an empty list, after adding 5 items, test if the size of the list is 5
		C206_CaseStudy.createMonthlyMenu(monthlyMenu, m1);
		C206_CaseStudy.createMonthlyMenu(monthlyMenu, m2);
		C206_CaseStudy.createMonthlyMenu(monthlyMenu, m3);
		C206_CaseStudy.createMonthlyMenu(monthlyMenu, m4);
		C206_CaseStudy.createMonthlyMenu(monthlyMenu, m5);
		assertEquals("Test if that Monthly Menu arraylist size is 5?", 5, monthlyMenu.size());

		// test if the expected output string same as the list of menu items retrieved
		// from the SourceCentre
		allMenuItems = C206_CaseStudy.retrieveMonthlyMenu(monthlyMenu);

		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "Asian", "Fried Rice", 2.00, "Yes");
		testOutput += String.format("%-20s %-40s %-20.2f %-10s\n", "Western", "Tomato Pasta ", 2.50, "Yes");
		testOutput += String.format("%-20s %-40s %-20.2f %-10s\n", "Vegetarian", "Teriyaki Tofu Rice ", 3.50, "Yes");
		testOutput += String.format("%-20s %-40s %-20.2f %-10s\n", "Drinks", "Apple Juice", 1.80, "Yes");
		testOutput += String.format("%-20s %-40s %-20.2f %-10s\n", "Fruits", "Watermelon", 1.20, "Yes");

		assertEquals("Check that ViewMonthlyMenu", testOutput, allMenuItems);
	}

	@Test
	public void testCreateMonthlyMenu() {
		// Test if Item list is not null but empty, so that can add a new item
		assertNotNull("Test if there is valid Monthly Menu arraylist to add to", monthlyMenu);

		// Given an empty list, after adding 5 items, test if the size of the list is 5
		C206_CaseStudy.createMonthlyMenu(monthlyMenu, m1);
		C206_CaseStudy.createMonthlyMenu(monthlyMenu, m2);
		C206_CaseStudy.createMonthlyMenu(monthlyMenu, m3);
		C206_CaseStudy.createMonthlyMenu(monthlyMenu, m4);
		C206_CaseStudy.createMonthlyMenu(monthlyMenu, m5);
		assertEquals("Test if that Monthly Menu arraylist size is 5?", 5, monthlyMenu.size());

		// The item just added is the same as the second item of the list
		assertSame("Test that Menu Item is added same as 1st item of the list?", m2, monthlyMenu.get(1));

	}

	@Test
	public void testDeleteMonthlyMenu() {
		// Test if Item list is not empty, so that can delete items
		assertNotNull("Test if there is valid Monthly Menu arraylist to delete from", monthlyMenu);

		// Test that item is removed
		monthlyMenu.remove(m1);
		assertEquals("Check if item has been removed", 0, monthlyMenu.size());

		// Test that item is not available to be deleted
		m1.setAvailable(false);
		boolean available = C206_CaseStudy.deleteMenu(monthlyMenu, "Fried Rice");
		assertFalse("Test that item is avilable to be deleted", available);

	}

	@Test
	public void testaddlunchbox() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid lunchorder arraylist to add to", lunchBoxList);

		// Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addlunchbox(lunchBoxList, L1);
		assertEquals("Test if that lunchbox arraylist size is 1?", 1, lunchBoxList.size());

		// The item just added is as same as the first item of the list
		assertSame("Test that lunchbox is added same as 1st item of the list?", L1, lunchBoxList.get(0));

		// Add another item. test The size of the list is 2?
		C206_CaseStudy.addlunchbox(lunchBoxList, L2);
		C206_CaseStudy.addlunchbox(lunchBoxList, L3);
		assertEquals("Test that lunchbox arraylist size is 3?", 3, lunchBoxList.size());
		assertSame("Test that lunchbox is added same as 3rd item of the list?", L3, lunchBoxList.get(2));
	}

	@Test
	public void testdeletelunchorder() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid lunchbox arraylist to delete from", lunchBoxList);

		// Given an empty list, after adding 1 item, the size of the list is 1
		String allLB = C206_CaseStudy.retrievelunchboxorder(lunchBoxList);
		String testoutput = "";
		assertEquals("Test that the retrived lunchbox list is empty?", testoutput, allLB);

		C206_CaseStudy.addlunchbox(lunchBoxList, L1);
		C206_CaseStudy.deletelunchorder(lunchBoxList, L1);

		assertEquals("Test that the lunchbox list equals 0", 0, lunchBoxList.size());

		C206_CaseStudy.addlunchbox(lunchBoxList, L1);
		C206_CaseStudy.addlunchbox(lunchBoxList, L2);
		C206_CaseStudy.deletelunchorder(lunchBoxList, L2);
		assertSame("Test lunchbox order is still in the list?", L1, lunchBoxList.get(0));
		assertEquals("Test that the lunchbox order equals 1", 1, lunchBoxList.size());
	}

	@Test
	public void viewlunchboxorder() {
		assertNotNull("Test if there is valid lunchbox arraylist to add to", lunchBoxList);

		String LB = C206_CaseStudy.retrievelunchboxorder(lunchBoxList);
		String testoutput = "";
		assertEquals("Check that View lunchbox order", testoutput, LB);

		C206_CaseStudy.addlunchbox(lunchBoxList, L1);
		C206_CaseStudy.addlunchbox(lunchBoxList, L2);
		assertEquals("Test if that lunchbox arraylist size is 2?", 2, lunchBoxList.size());

		LB = C206_CaseStudy.retrievelunchboxorder(lunchBoxList);
		testoutput = String.format("%-40s %-40s %-40s %-40s %-40s\n", "123", "7 july", "nasi lemak", "ice milo",
				"banana");
		testoutput += String.format("%-40s %-40s %-40s %-40s%-40s\n", "1234", "8 july", "chicken rice", "green tea",
				"orange");

		assertEquals("Check that View lunchbox order", testoutput, LB);

	}

}

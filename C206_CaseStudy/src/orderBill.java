
public class orderBill {
	private String id;
	private String date;
	private String meal;
	private String drink;
	private String fruit;
	private double price;
	
	public orderBill(String id, String date, String meal, String drink, String fruit, double price) {
		this.id = id;
		this.date = date;
		this.meal = meal;
		this.drink = drink;
		this.fruit = fruit;
		this.price = price;
		
		
	}

	public String getId() {
		return id;
	}

	public String getDate() {
		return date;
	}

	public String getMeal() {
		return meal;
	}

	public String getDrink() {
		return drink;
	}

	public String getFruit() {
		return fruit;
	}

	public double getPrice() {
		return price;
	}
	
}



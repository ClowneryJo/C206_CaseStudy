
public class lunchbox {

	private String id;
	private String date;
	private String food;
	private String drink;
	private String fruit;

	public lunchbox(String id, String date, String food, String drink, String fruit) {
		this.id = id;
		this.date= date;
		this.food = food ;
		this.drink = drink;
		this.fruit=fruit;
	}

	public String getId() {
		return id;
	}

	public String getDate() {
		return date;
	}

	public String getFood() {
		return food;
	}

	public String getDrink() {
		return drink;
	}

	public String getFruit() {
		return fruit;
	}
}



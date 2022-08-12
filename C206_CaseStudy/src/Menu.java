
public class Menu {

	private String category;
	private String item;
	private double price;
	private boolean isAvailable;
	
	public Menu(String category, String item, double price, String i) {
		this.category = category;
		this.item = item;
		this.price = price;
		this.isAvailable = true;
	}

	public String getCategory() {
		return category;
	}

	public String getItem() {
		return item;
	}

	public double getPrice() {
		return price;
	}

	public void setAvailable(boolean isAvailable) {
		 this.isAvailable = isAvailable;
	}

	public boolean getIsAvailable() {
		 return isAvailable;
	}

	public void setIsAvailable(boolean isAvailable) {
		 this.isAvailable = isAvailable;
	}
	
	public String getDescription() {
		return null;
	}
}

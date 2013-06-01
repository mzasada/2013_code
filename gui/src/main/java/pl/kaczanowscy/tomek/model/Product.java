package pl.kaczanowscy.tomek.model;

public class Product {
	private String name;
	private int price;
	private int id;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Product{" +
				"name='" + name + '\'' +
				", price=" + price +
				", id=" + id +
				'}';
	}
}

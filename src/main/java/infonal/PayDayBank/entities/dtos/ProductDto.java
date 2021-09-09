package infonal.PayDayBank.entities.dtos;

public class ProductDto {

	public int getId() {
		return id;
	}

	public void setId(int puroductId) {
		this.id = puroductId;
	}

	public String getName() {
		return name;
	}

	public void setName(String productName) {
		this.name = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private int id;

	private String name;

	private int price;

	private Boolean available;

	private String description;

}

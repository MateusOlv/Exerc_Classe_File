package entities;

public class Product {
	private String name;
	private Double unitValue;
	private Integer quantity;
	private Double totalValue;
	
	public Product(String name, Double unitValue, Integer quantity) {
		this.name = name;
		this.unitValue = unitValue;
		this.quantity = quantity;
		this.totalValue = this.unitValue * this.quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getUnitValue() {
		return unitValue;
	}

	public void setUnitValue(Double unitValue) {
		this.unitValue = unitValue;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}
		
}

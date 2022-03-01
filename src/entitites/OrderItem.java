package entitites;

public class OrderItem {

	private Integer quantity;
	private double price;
	private Product product;
	
	
	public OrderItem(Integer quantity, double price, Product product) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.product=product;
	}	
	
	public OrderItem() {
		
	}
	
	public double subTotal() {
		return quantity * price;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return product.getName() 
				+ ", $" 
				+ String.format("%.2f", price) 
				+ ", Quantity: " 
				+ quantity + 
				", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}
	
	
	
	
}

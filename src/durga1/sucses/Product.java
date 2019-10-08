package durga1.sucses;

public class Product {
	private int productID;
	private String productName;
	private int price;
	public Product ()
	{
		
	}
	public Product(int productID, String productName, int price) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.price = price;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", price=" + price + "]";
	}
	

}

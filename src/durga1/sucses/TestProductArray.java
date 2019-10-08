package durga1.sucses;

public class TestProductArray {
	public static void main(String[] args)
	{
		Product product1=new Product(1001,"TV",22000);
		Product product2=new Product(1002,"table",1000);
		Product product3=new Product(1003,"Book",2000);
		
		//product[] productArray= {product1,product2,product3};
		Product [] productArray=new Product[3];
		productArray[0]=product1;
		productArray[1]=product2;
		productArray[2]=product3;
		
		//displayArray(productArray);
		//displayMostcostlyProduct(productArray);
		//displayCheapestProduct(productArray);
		displayProductsWhoseNameStartsWith(productArray,"T");
		
	}
	public static void displayProductsWhoseNameStartsWith(Product[] productArray,String firstChar)
	{
		for(Product product:productArray)
		{
			if(product.getProductname().startsWith(firstChar))
			{
				System.out.println(product);
			}
		}
	}
	public static void displayMostcostlyProduct(Product[] productArray)
	{
		int maxprice=0;
		Product maxPriceProduct=null;
		for(Product product:productArray)
		{
		
			if(product.getPrice() > maxprice)
			{
				maxprice=product.getPrice();
				maxPriceProduct=product;
			}
		
		}
		System.out.println("Max price is"+maxprice);
		System.out.println(maxPriceProduct);
	}
	public static void displayCheapestProduct(Product[] productArray)
	{
		
		Product minProductPrice=productArray[0];
		int minprice = minProductPrice.getPrice();
		for(Product product:productArray)
		{
			//minprice=product.getPrice();
			//minProductPrice=product;
			if(product.getPrice()< minprice)
			{
				minprice=product.getPrice();
				minProductPrice=product;
			}
		}
		System.out.println("Min price is"+minprice);
		System.out.println(minProductPrice);
	}
	public static void displayArray(Product[] productArray)
	{

		for(Product product:productArray)
		{
			System.out.println(product);
		}
		
	}
}

}

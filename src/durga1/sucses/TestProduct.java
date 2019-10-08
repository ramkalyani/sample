package durga1.sucses;

public class TestProduct {
	Product product1=new Product(100,"Laptop",50000);
	product1.setPrice(50000);
	product1.setProductid(100);
	product1.setProductname("Laptop");

	System.out.println(product1.getProductid());
	System.out.println(product1.getProductname());
	System.out.println(product1.getPrice());
	System.out.println();
	

}

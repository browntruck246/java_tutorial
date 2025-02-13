package java_tutorial;

import java.util.ArrayList;
import java.util.List;

public class Main_ListProduct {

	public static void main(String[] args) {
		
		System.out.println("*** main ***" );
		
		List<Product> products = new ArrayList<>();
		
        Product product1 = new Product(1, "Laptop", "High-end gaming laptop", "$1500");
        Product product2 = new Product(2, "Smartphone", "Latest model smartphone", "$999");

        products.add(product1);
        products.add(product2);
        
        for (Product product : products) {
            System.out.println(product.toString());
        }

	}

}

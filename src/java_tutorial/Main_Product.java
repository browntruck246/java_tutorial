package java_tutorial;

public class Main_Product {

    public static void main(String[] args) {
        System.out.println("*** main ***");

        // Creating product 1 and product 2
        Product product1 = new Product(1, "Laptop", "High-end gaming laptop", "$1500");
        Product product2 = new Product(2, "Smartphone", "Latest model smartphone", "$999");

        // Print out the names of the products
        System.out.println(" Product 1 Name : " + product1.getName());
        System.out.println(" Product 2 Name : " + product2.getName());

        System.out.println("*** Set Name ***");

        // Change the name of product 1 to Desktop
        product1.setName("Desktop");

        System.out.println(" Product 1 Name : " + product1.getName());

        System.out.println("*** Print All ***");

        System.out.println(" Product 1  : " + product1.toString());

    }

}

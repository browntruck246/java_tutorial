The provided code defines a `Product` class in Java, which models a product with attributes such as `id`, `name`, `description`, and `price`. The class includes a default constructor and a parameterized constructor to initialize these attributes. It also provides getter and setter methods for each attribute, allowing for encapsulation and controlled access to the class's fields.

```java
Product product1 = new Product(1, "Laptop", "High-end gaming laptop", "$1500");

Product product2 = new Product(2, "Smartphone", "Latest model smartphone", "$999");
```

The `getName` and `setName` methods are used to retrieve and modify the `name` attribute of a `Product` instance, respectively. Similarly, there are getter and setter methods for `id`, `description`, and `price`. The `toString` method is overridden to provide a string representation of a `Product` object, which includes all its attributes.

```java
        System.out.println( " Product 1 Name : " + product1.getName() );
        System.out.println( " Product 2 Name : " + product2.getName() );

        product1.setName("Desktop");
```

In the Main_Product.java file, two `Product` objects, `product1` and `product2`, are instantiated with specific values. The code then prints the name of each product using the `getName` method. It demonstrates the use of the `setName` method by changing the name of `product1` to "Desktop" and printing the updated name. Finally, it prints the complete details of `product1` using the `toString` method.

```java
System.out.println( " Product 1  : " + product1.toString() );
```

This code showcases basic object-oriented programming principles such as encapsulation, constructors, and method overriding in Java. It also demonstrates how to create and manipulate objects, access their attributes, and print their details.

# Output
```
*** main ***
 Product 1 Name : Laptop
 Product 2 Name : Smartphone
*** Set Name ***
 Product 1 Name : Desktop
*** Print All ***
 Product 1  : Product [id=1, name=Desktop, description=High-end gaming laptop, price=$1500]
 ```

 # Code 
 - [Main_Product.java](https://github.com/browntruck246/java_tutorial/blob/main/src/java_tutorial/Main_Product.java)
 - [Product.java](https://github.com/browntruck246/java_tutorial/blob/main/src/java_tutorial/Product.java)
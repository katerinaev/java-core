package hw_12.task_5;
/*
Task 5: Warehouse Inventory
Description:
Develop a warehouse management system that allows adding and retrieving products of
various types. The system should manage access to the warehouse through the isInventoryOpen
variable and handle out-of-stock situations by throwing an OutOfStockException.

Functional Requirements:
Classes and Interfaces:
Product: A product has minimal characteristics, such as name, price, and category.
InventoryService: A service for managing products in the warehouse. It should support adding
and retrieving products by category.
Inventory Management:
Products are stored in a Map<String, List<Product>> structure, where the key is the product
category.
A method for adding a product to the warehouse. If the isInventoryOpen flag is false,
the add operation should not be performed.
A method for retrieving a product by category. If there are no products in the
specified category, an OutOfStockException should be thrown.
Data Management:
Using the Stream API to search and filter products by category.
Filtering products by price using lambda expressions.
*/
public class Product {
    private final String name;
    private final double price;
    private final String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }
}

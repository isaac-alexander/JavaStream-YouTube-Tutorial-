package streams.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Product {
    private String name;
    private double price;
    private String category;

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

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}

public class FilterCustomObjects {

    static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Phone", 999.99, "Electronics"));
        products.add(new Product("Short", 29.99, "Clothing"));
        products.add(new Product("Tv", 1499.99, "Electronics"));
        products.add(new Product("Laptop", 1299.99, "Electronics"));
        products.add(new Product("Jeans", 59.99, "Clothing"));

        // Create Stream from list
//        Stream<Product> stream = products.stream();

        // filter products that belongs to "Electronics" category
//        List<Product> filteredProducts = stream.filter(product -> product.getCategory().equals("Electronics"))
//                .toList();
//        filteredProducts.forEach((product) -> {
//            System.out.println(product.toString());
//        });

        // Applying multiple filter conditions
        // 1. Product must belong to the "Electronics" category
        // 2. Product price must be greater than 1000
        Stream<Product> stream = products.stream();

        List<Product> filteredProducts = stream.filter(product -> product.getCategory().equals("Electronics"))
                .filter(product -> product.getPrice() > 1000)
                .toList();
        filteredProducts.forEach((product) -> {
            System.out.println(product.toString());
        });


    }
}

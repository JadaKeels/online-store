package com.pluralsight;

public class Product {

    private static String; sku
    private static String; productName
    private static double; price
    private static String; demparment

    public Product(Sring sku, String productName, double price, String department) {
        this.sku = sku;
        this.productName = productName;
        this.price = price;
        this.department = department;
    }

    public static String getSku() {
        return sku;
    }

public static void setSku(String sku) {
    Product.sku = sku;
}

public static String getProductName() {
    return productName;
}

public static void setProductName(String productName) {
    Product.productName = productName;
}

public static String getDepartment() {
    return department;
}

public static void setDepartment (String department) {
    Product.department = department;
}

public static double getPrice() {
        return price;
}
public static void setPrice(double price) {
    Product.price = price;
}

@Override
public String toString() {
        return "Product{}";
}
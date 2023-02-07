package ss17_io_binari_serialization.product_management;

import java.io.Serializable;

public class Product implements Serializable {
    int productCode;
    String name;
    String manufacturerName;
    Double price;

    public Product(int productCode, String name, String manufacturerName, Double price) {
        this.productCode = productCode;
        this.name = name;
        this.manufacturerName = manufacturerName;
        this.price = price;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productCode=" + productCode +
                ", name='" + name + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", price=" + price +
                '}';
    }
}

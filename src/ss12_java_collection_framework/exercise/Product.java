package ss12_java_collection_framework.exercise;

public class Product {
    private String product;
    private int id;
    private double price;

    public Product() {
    }

    public Product(String product, int id, double price) {
        this.product = product;
        this.id = id;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Game:'" + product + '\'' +
                ", ID = " + id +
                ", Price = " + price +
                '}';
    }
}


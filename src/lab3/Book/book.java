package lab3.Book;

public class book {
    private String name;
    private author author;
    private double price;
    private int qty;

    public book(String name, author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = 0;
    }

    public book(String name, author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[name=" + name +
                ", " + author +
                ", price=" + price +
                ", qty=" + qty + "]";
    }

}

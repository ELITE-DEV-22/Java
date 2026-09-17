package lab3.Bookshop;

public class books {
    private String title;
    private String author;
    private double price;
    private String publisher;
    private int stock;

    public books(String title, String author, double price,String publisher, int stock){
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
        this.stock = stock;
    }
    public void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Publisher: " + publisher);
        System.out.println("Stock: " + stock);
    }

    public boolean searchBook( String title, String author){
        if (this.title.equalsIgnoreCase(title) && this.author.equalsIgnoreCase(author)){
            return true;
        }
        return false;
    }
    public double calculateCost(int copies) {
        return price * copies;
    }

    public boolean isAvailable(int copies) {
        return copies <= stock;
    }
}

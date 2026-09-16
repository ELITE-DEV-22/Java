package lab3.Book;

public class testbook {
    public static void main(String[] args) {

        author a1 = new author("elita", "elita@gmail.com", 'F');
        author a2 = new author("novak", "novak@gmail.com", 'M');

        book b1 = new book("java", a1, 20.00, 10);
        book b2 = new book("python", a2, 30.00);

        assert b1.getName().equals("java");
        assert b1.getAuthor().getName().equals("elita");
        assert b1.getPrice() == 20.00;

        b1.setPrice(25.00);
        assert b1.getPrice() == 25.00;

        assert b1.getQty() == 10;

        b1.setQty(25);
        assert b1.getQty() == 25;

        System.out.println(b1);
        System.out.println("All assertions passed!");
    }
}

package lab3.Bookshop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        books b1 = new books(
                "Harry Potter",
                "J.K. Rowling",
                500,
                "Bloomsbury",
                10
        );

        books b2 = new books(
                "1984",
                "George Orwell",
                300,
                "Penguin",
                5
        );

        books b3 = new books(
                "The Hobbit",
                "J.R.R. Tolkien",
                400,
                "HarperCollins",
                8
        );

        books[] bookList = {b1, b2, b3};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter book title: ");
        String title = sc.nextLine();

        System.out.print("Enter author: ");
        String author = sc.nextLine();

        boolean found = false;

        for (books b : bookList) {

            if (b.searchBook(title, author)) {

                found = true;

                System.out.println("\nBook is available!");
                b.display();

                System.out.print("Enter number of copies required: ");
                int copies = sc.nextInt();

                if (b.isAvailable(copies)) {
                    double totalCost = b.calculateCost(copies);
                    System.out.println("Total cost: " + totalCost);
                } else {
                    System.out.println("required copies not in stock");
                }

                break;
            }
        }

        if (!found) {
            System.out.println("Book is not available.");
        }

        sc.close();
    }
}
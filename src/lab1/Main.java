package lab1;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== LAB 1 =====");
            System.out.println("1. Hello World");
            System.out.println("2. Print 3 command line arguments");
            System.out.println("3. Sum 3 numeric command line arguments");
            System.out.println("4. Alphabetic order and length of string");
            System.out.println("5. Check palindrome");
            System.out.println("6. Count vowels");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Hello World");
                    break;

                case 2:
                    if (args.length >= 3) {
                        System.out.println("Argument 1: " + args[0]);
                        System.out.println("Argument 2: " + args[1]);
                        System.out.println("Argument 3: " + args[2]);
                    } else {
                        System.out.println("Please provide 3 command line arguments.");
                    }
                    break;

                case 3:
                    if (args.length >= 3) {
                        int a = Integer.parseInt(args[0]);
                        int b = Integer.parseInt(args[1]);
                        int c = Integer.parseInt(args[2]);

                        int sum = a + b + c;

                        System.out.println("Sum: " + sum);
                    } else {
                        System.out.println("Please provide 3 numeric command line arguments.");
                    }
                    break;

                case 4:
                    System.out.print("Enter a string: ");
                    String str = sc.nextLine();

                    char[] chars = str.toCharArray();
                    Arrays.sort(chars);

                    System.out.println("Alphabetic order: " + new String(chars));
                    System.out.println("Length: " + str.length());
                    break;

                case 5:
                    System.out.print("Enter a string: ");
                    String palindrome = sc.nextLine();

                    String reverse = "";

                    for (int i = palindrome.length() - 1; i >= 0; i--) {
                        reverse = reverse + palindrome.charAt(i);
                    }

                    if (palindrome.equalsIgnoreCase(reverse)) {
                        System.out.println("Palindrome");
                    } else {
                        System.out.println("Not a palindrome");
                    }
                    break;

                case 6:
                    System.out.print("Enter a string: ");
                    String input = sc.nextLine();

                    int count = 0;

                    for (int i = 0; i < input.length(); i++) {
                        char ch = Character.toLowerCase(input.charAt(i));

                        if (ch == 'a' || ch == 'e' || ch == 'i' ||
                                ch == 'o' || ch == 'u') {
                            count++;
                        }
                    }

                    System.out.println("Number of vowels: " + count);
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 7);

        sc.close();
    }

}

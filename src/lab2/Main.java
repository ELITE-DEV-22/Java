package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n===== LAB 2 =====");
            System.out.println("1. Find duplicate values in an array");
            System.out.println("2. Find kth smallest and largest element");
            System.out.println("3. Move positive numbers right and negative numbers left");
            System.out.println("4. Question with 3 attempts");
            System.out.println("5. Floyd's Triangle");
            System.out.println("6. EXIT");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter number of elements: ");
                    int n = sc.nextInt();
//                  will create a new array
                    int[] arr = new int[n];
                    System.out.println("Enter the elements: ");
                    for(int i = 0; i < n; i++){
                        arr[i] = sc.nextInt();
                    }
                    //logic for duplicate elements
                    for (int i = 0; i < n; i++){
                        for (int j = i+1; j < n; j++){
                            if (arr[i] == arr[j]){
                                System.out.println("Duplicate: " + arr[i]);
                            }
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter number of elements: ");
                    int n2 = sc.nextInt();

                    int[] arr2 = new int[n2];
                    System.out.println("Enter the elements: ");
                    for (int i = 0; i < n2; i++){
                        arr2[i] = sc.nextInt();
                    }
                    System.out.println("Enter k: ");
                    int k = sc.nextInt();
                    Arrays.sort(arr2);
                    if (k >= 1 && k <= n2) {
                        System.out.println("Kth smallest: " + arr2[k - 1]);
                        System.out.println("Kth largest: " + arr2[n2 - k]);
                    } else {
                        System.out.println("Invalid value of k.");
                    }
                    break;

                case 3:
                    System.out.print("Enter number of elements: ");
                    int n3 = sc.nextInt();

                    int[] arr3 = new int[n3];

                    System.out.println("Enter the elements:");
                    for (int i = 0; i < n3; i++) {
                        arr3[i] = sc.nextInt();
                    }

                    for (int i = 0; i < n3 - 1; i++) {
                        for (int j = i + 1; j < n3; j++) {

                            if (arr3[i] >= 0 && arr3[j] < 0) {
                                int temp = arr3[i];
                                arr3[i] = arr3[j];
                                arr3[j] = temp;
                            }
                        }
                    }

                    System.out.println("Array after rearranging:");

                    for (int i = 0; i < n3; i++) {
                        System.out.print(arr3[i] + " ");
                    }

                    System.out.println();
                    break;

                case 4:
                    String correctAnswer = "Java";
                    boolean correct = false;

                    for (int attempt = 1; attempt <= 3; attempt++) {

                        System.out.print("What programming language are we learning? ");
                        String answer = sc.next();

                        if (answer.equalsIgnoreCase(correctAnswer)) {
                            System.out.println("Correct!");
                            correct = true;
                            break;
                        } else {
                            System.out.println("Wrong answer.");
                        }
                    }

                    if (!correct) {
                        System.out.println("You have used all 3 attempts.");
                    }
                    break;

                case 5:
                    System.out.println(" Enter number of rows: ");
                    int rows = sc.nextInt();
                    int number =1;
                    for(int i = 1; i <= rows; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(number + " ");
                            number++;
                        }
                        System.out.println();
                    }
                    // Binary Floyd's Triangle
                    System.out.println("\nBinary Floyd's Triangle:");

                    for (int i1 = 1; i1 <= rows; i1++) {
                        for (int j = 1; j <= i1; j++) {
                            System.out.print((i1 + j) % 2 + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 6:
                    System.out.println("Byeee");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        }while(choice != 6);
        sc.close();
    }
}

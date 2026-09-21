package lab6;

import java.io.*;
import java.util.Scanner;

public class SIS {

    private static BufferedReader br = null;
    private static Scanner sc = new Scanner(System.in);

    private static final String LOGIN_FILE =
            "/Users/elita/Downloads/OneDrive_1_15-9-2026/COLLEGE STUFF/cloud applications with JAVA/Java-lab/src/lab6/login.txt";

    private static final String STUDENT_FILE =
            "/Users/elita/Downloads/OneDrive_1_15-9-2026/COLLEGE STUFF/cloud applications with JAVA/Java-lab/src/lab6/student_record.txt";


    public static void initStream() {

        try {
            br = new BufferedReader(new FileReader(LOGIN_FILE));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public static boolean authenticate() {

        for (int attempt = 1; attempt <= 3; attempt++) {

            System.out.println("Enter username");
            String user = sc.next();

            System.out.println("Enter password");
            String password = sc.next();

            try {

                br = new BufferedReader(new FileReader(LOGIN_FILE));

                String credentials = br.readLine();

                while (credentials != null) {

                    String[] profile = credentials.split(" ");

                    String storedUsername = profile[0];
                    String storedPassword = profile[1];

                    if (user.equals(storedUsername) &&
                            password.equals(storedPassword)) {

                        br.close();
                        return true;
                    }

                    credentials = br.readLine();
                }

                br.close();

            } catch (IOException e) {
                System.out.println(e);
            }

            System.out.println("Invalid username or password.");

            if (attempt < 3) {
                System.out.println("Attempts remaining: " + (3 - attempt));
            }
        }

        return false;
    }


    public static void insertRecord() {

        System.out.println("Enter reg number");
        String regno = sc.next();

        System.out.println("Enter name");
        String name = sc.next();

        System.out.println("Enter place");
        String place = sc.next();

        String insertRecord = regno + " " + name + " " + place;

        try {

            BufferedWriter bw = new BufferedWriter(
                    new FileWriter(STUDENT_FILE, true)
            );

            bw.write(insertRecord);
            bw.newLine();

            bw.close();

            System.out.println("Student record inserted successfully.");

        } catch (IOException e) {
            System.out.println(e);
        }
    }


    public static void deleteRecord() {

        System.out.println("Enter roll number to delete");
        String roll = sc.next();

        try {

            BufferedReader br = new BufferedReader(
                    new FileReader(STUDENT_FILE)
            );

            StringBuilder records = new StringBuilder();

            String record;
            boolean found = false;

            while ((record = br.readLine()) != null) {

                String[] data = record.split(" ");

                if (data[0].equals(roll)) {

                    found = true;
                    continue;
                }

                records.append(record);
                records.append(System.lineSeparator());
            }

            br.close();

            if (found) {

                BufferedWriter bw = new BufferedWriter(
                        new FileWriter(STUDENT_FILE)
                );

                bw.write(records.toString());

                bw.close();

                System.out.println("Student record deleted successfully.");

            } else {

                System.out.println("Student record not found.");
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }


    public static void displayRecord() {

        try {

            BufferedReader br = new BufferedReader(
                    new FileReader(STUDENT_FILE)
            );

            String record;

            System.out.println("\n===== STUDENT RECORDS =====");

            while ((record = br.readLine()) != null) {

                System.out.println(record);
            }

            br.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }


    public static void closeStream() {

        try {

            if (br != null) {
                br.close();
            }

            sc.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }


    public static void main(String[] args) {

        int choice = 0;

        initStream();

        if (authenticate()) {

            System.out.println("\nValid user");

            do {

                System.out.println("\n===== STUDENT INFORMATION SYSTEM =====");
                System.out.println("1. Insert Student Record");
                System.out.println("2. Delete Student Record");
                System.out.println("3. Display Student Records");
                System.out.println("4. Exit");

                System.out.println("Enter your choice");
                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        insertRecord();
                        break;

                    case 2:
                        deleteRecord();
                        break;

                    case 3:
                        displayRecord();
                        break;

                    case 4:
                        System.out.println("Byeee");
                        break;

                    default:
                        System.out.println("Invalid choice");
                }

            } while (choice != 4);

        } else {

            System.out.println("Invalid user");
            System.out.println("Three attempts exhausted.");
        }

        System.out.println("****CLOSE APP*****");

        closeStream();
    }
}
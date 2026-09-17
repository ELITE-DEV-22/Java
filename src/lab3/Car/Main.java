package lab3.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        car c1 = new car("Brezza", "VX", "02/10/2017", "White", 650500.00);
        car c2 = new car("Venue", "SX", "20/9/2018", "White", 750000.00);
        car c3 = new car("Ciaz", "VX", "15/12/2015", "White", 600000.00);
        car c4 = new car("Ecosport", "LX", "21/6/2018", "Blue", 500500.00);
        car c5 = new car("Nexon", "SX", "15/10/2019", "Green", 850500.00);

        List<car> cars = new ArrayList<>();
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);
        cars.add(c5);

        System.out.println("===== AVAILABLE CARS =====");
        for (car c : cars) {
            System.out.println(c);
        }

        System.out.print("\nEnter car name to book: ");
        String name = sc.nextLine();

        car bookedCar = null;

        for (car c : cars) {
            if (c.getName().equalsIgnoreCase(name)) {
                bookedCar = c;
                break;
            }
        }

        if (bookedCar != null) {
            System.out.println("\nCar booked successfully!");
            System.out.println(bookedCar);
            cars.remove(bookedCar);
        } else {
            System.out.println("Car is not available.");
        }

        sc.close();
    }

}


import java.util.Scanner;

public class ScannerExample {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Enter list Price");
        double price = scanner.nextDouble();
        System.out.println("you price is " + price);
    }
}

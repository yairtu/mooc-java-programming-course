
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.print("First: " + first + "/100" + "\n" +
                    "Second: " + second + "/100" + "\n");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if(command.equalsIgnoreCase("add")) {
                System.out.println(" ");
                if (amount < 0) {
                    continue;
                }
                first += amount;
                if(first > 100) {
                    first = 100;
                }
            }

            if(command.equalsIgnoreCase("move")) {
                System.out.println(" ");
                if(amount < 0) {
                    continue;
                }
                if(first - amount < 0) {
                    second += first;
                    first = 0;
                } else {
                    first -= amount;
                    second += amount;
                }
                if(first < 0) {
                    first = 0;
                }
                if(second > 100) {
                    second = 100;
                }
            }

            if(command.equalsIgnoreCase("remove")) {
                System.out.println(" ");
                if(amount < 0) {
                    continue;
                }
                second -= amount;
                if(second < 0) {
                    second = 0;
                }
            }

        }
    }

}

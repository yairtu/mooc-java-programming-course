
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if(command.equalsIgnoreCase("add")) {
                first.add(amount);
            }

            if(command.equalsIgnoreCase("remove")) {
                second.remove(amount);
            }

            if(command.equalsIgnoreCase("move")) {
                if(amount < 0) {
                    continue;
                }
                if(first.contains() - amount < 0) {
                    second.add(first.contains());
                    first.remove(amount);
                } else {
                    first.remove(amount);
                    second.add(amount);
                }
            }

        }
    }

}

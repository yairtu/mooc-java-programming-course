
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if(command.equals("add")) {
                first.add(amount);
            }
            
            if(command.equals("move")) {
                if(amount > first.contains()) {
                    second.add(first.contains());
                    first.remove(amount);
                    continue;
                }
                first.remove(amount);
                second.add(amount);
            }
            
            if(command.equals("remove")) {
                second.remove(amount);
            }
            System.out.println("");
        }
    }

}

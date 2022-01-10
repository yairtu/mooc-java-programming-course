
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> strings = new ArrayList<>();

        while (true) {
            String in = scanner.nextLine();

            if (in.isEmpty()) {
                break;
            }

            strings.add(in);
        }
        
        strings.stream().forEach(string -> System.out.println(string));
    }
}

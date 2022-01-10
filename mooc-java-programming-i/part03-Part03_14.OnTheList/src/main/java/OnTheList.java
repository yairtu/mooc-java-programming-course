
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.println("Search for?");
        String in = scanner.nextLine();
        if(list.contains(in)) {
            System.out.println(in + " was found!");
        } else {
            System.out.println(in + " was not found!");
        }
    }
}

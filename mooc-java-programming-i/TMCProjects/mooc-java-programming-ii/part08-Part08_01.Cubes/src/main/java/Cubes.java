
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String in = scanner.nextLine();

            if(in.equalsIgnoreCase("end")) {
                break;
            }
            int a = Integer.valueOf(in);
            System.out.println(a*a*a);
        }

    }
}

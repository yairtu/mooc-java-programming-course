
import java.util.Scanner;
import java.util.ArrayList;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);

        ArrayList<Bird> birds = new ArrayList<>();

        while (true) {
            System.out.print("? ");
            String in = scan.nextLine();

            if (in.equalsIgnoreCase("Quit")) {
                break;
            }

            if (in.equalsIgnoreCase("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();

                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();

                birds.add(new Bird(name, latinName));
            }

            if (in.equalsIgnoreCase("Observation")) {
                System.out.print("Bird");
                String bird = scan.nextLine();
                for (int i = 0; i < birds.size(); i++) {
                    if (birds.get(i).getName().equals(bird)) {
                        birds.get(i).increaseObservation();
                    }
                }
            }

            if (in.equalsIgnoreCase("All")) {
                if (birds.isEmpty()) {
                    continue;
                }
                for (int i = 0; i < birds.size(); i++) {
                    System.out.println(birds.get(i));
                }
            }

            if (in.equalsIgnoreCase("One")) {
                System.out.print("Bird? ");
                String bird = scan.nextLine();

                for (int i = 0; i < birds.size(); i++) {
                    if (birds.get(i).getName().equals(bird)) {
                        System.out.println(birds.get(i));
                        break;
                    }
                }
            }
        }

    }

}

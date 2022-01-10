/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yairt
 */
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.scanner = scanner;
        this.jokeManager = jokeManager;
    }

    public void start() {

        while (true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke\n"
                    + "2 - draw a joke\n"
                    + "3 - list jokes\n"
                    + "X - stop");

            String in = scanner.nextLine();
            if (in.equals("X")) {
                break;
            }
            if (Integer.valueOf(in) == 1) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();

                this.jokeManager.addJoke(joke);
            }

            if (Integer.valueOf(in) == 2) {
                System.out.println("Drawing a joke.");
                System.out.println(this.jokeManager.drawJoke());
            }

            if (Integer.valueOf(in) == 3) {
                System.out.println("Printing the jokes.");
                this.jokeManager.printJokes();
            }

        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yairt
 */
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                break;
            }
            processCommand(command);
            System.out.println("");
        }
        System.out.println("Bye bye!");
    }

    public void processCommand(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("search")) {
            search();
        } else {
            System.out.println("Unknown command");
        }
    }

    public void add() {
        System.out.print("Word: ");
        String word = this.scanner.nextLine();
        System.out.println("");
        System.out.print("Translation: ");
        String translation = this.scanner.nextLine();
        this.simpleDictionary.add(word, translation);
    }

    public void search() {
        System.out.print("To be translated: ");
        String toBeTranslated = scanner.nextLine();
        if (this.simpleDictionary.translate(toBeTranslated) == null) {
            System.out.println("Word " + toBeTranslated + " was not found");
        } else {
            System.out.println("Translation: " + this.simpleDictionary.translate(toBeTranslated));
        }
    }
}

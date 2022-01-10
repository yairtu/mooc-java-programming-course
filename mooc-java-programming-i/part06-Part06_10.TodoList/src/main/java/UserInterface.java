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

public class UserInterface {

    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            
            if (command.equals("add")) {
                System.out.println("To add: ");
                String add = scanner.nextLine();
                this.list.add(add);
            } else if (command.equals("list")) {
                this.list.print();
            } else if (command.equals("remove")) {
                System.out.println("Which one is removed? ");
                int remove = Integer.valueOf(scanner.nextLine());
                this.list.remove(remove);
            }
        }
    }

}

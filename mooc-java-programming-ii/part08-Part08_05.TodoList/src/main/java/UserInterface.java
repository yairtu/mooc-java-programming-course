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

    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("stop")) {
                break;
            } else if (command.equalsIgnoreCase("add")) {
                System.out.print("To add: ");
                String in = scanner.nextLine();
                this.todoList.add(in);
            } else if (command.equalsIgnoreCase("list")) {
                this.todoList.print();
            } else if (command.equals("remove")) {
                System.out.print("Which one is removed?");
                int in = Integer.valueOf(scanner.nextLine());
                this.todoList.remove(in);
            }
        }
    }

}

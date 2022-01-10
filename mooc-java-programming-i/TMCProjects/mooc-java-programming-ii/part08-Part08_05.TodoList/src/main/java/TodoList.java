import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> TodoList;

    public TodoList() {
        this.TodoList = new ArrayList<>();
    }

    public void add(String task) {
        this.TodoList.add(task);
    }

    public void print() {
        int i = 0;
        while(i < this.TodoList.size()) {
            System.out.println((i+1) + ": " + this.TodoList.get(i));
            i++;
        }
    }

    public void remove(int number) {
        this.TodoList.remove(number);
    }

}
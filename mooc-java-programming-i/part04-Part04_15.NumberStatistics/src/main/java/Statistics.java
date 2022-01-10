
public class Statistics {

    private int count;
    private int sum;

    public Statistics() {
        count = 0;
        sum = 0;
    }
    
    public void addNumber(int number) {
        count++;
        sum += number;
    }
    
    public int getCount() {
        return count;
    }
    
    public int sum() {
        return sum;
    }
    
    public double average() {
        if(getCount() == 0) {
            return 0;
        }
        return (double)sum()/getCount();
    }
}

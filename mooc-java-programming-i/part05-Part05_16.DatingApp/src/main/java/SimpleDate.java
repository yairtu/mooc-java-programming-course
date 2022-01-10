
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void advance() {
        this.day++;
        if (this.day == 31) {
            this.day = 1;
            this.month++;
            if (this.month == 13) {
                this.month = 1;
                this.year++;
            }
        }
    }

    public void advance(int howManyDays) {
        int i = 0;
        while(i < howManyDays) {
            this.advance();
            i++;
        }
    }
    
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate date = new SimpleDate(this.day, this.month, this.year);
        
        int i = 0;
        while(i < days) {
            date.advance();
            i++;
        }
        return date;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

}

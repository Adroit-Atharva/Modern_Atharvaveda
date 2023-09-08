public class MyDate {
    private int dd; // Day
    private int mm; // Month
    private int yy; // Year

    // Default constructor
    public MyDate() {
        this.dd = 1;   // Default day
        this.mm = 1;   // Default month
        this.yy = 2000; // Default year
    }

    // Parameterized constructor
    public MyDate(int dd, int mm, int yy) {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }

    // Display the date in dd-mm-yy format
    public void displayDate() {
        System.out.printf("%02d-%02d-%02d%n", dd, mm, yy);
    }

    public static void main(String[] args) {
        // Create objects of MyDate class using default and parameterized constructors
        MyDate defaultDate = new MyDate(); // Default constructor
        MyDate customDate = new MyDate(25, 12, 2022); // Parameterized constructor

        // Display dates
        System.out.println("Default Date:");
        defaultDate.displayDate();

        System.out.println("Custom Date:");
        customDate.displayDate();
    }
}

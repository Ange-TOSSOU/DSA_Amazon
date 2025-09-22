package Declaring_Arrays_Challenge;

public class Main {

    public static void main(String[] args) {

        int[] daysInMonth = new int[12];

        // Fill in the number of days for each month from January (index 0) to December (index 11).
        // Let's consider it's a non-leap year.
        for (int i = 0; i < daysInMonth.length; i++) {
            if (i == 1) {
                daysInMonth[i] = 28;
            } else if (i < 7) {
                daysInMonth[i] = 30 + (i+1) % 2;
            } else {
                daysInMonth[i] = 30 + i % 2;
            }
        }

        String[] monthNames = {
                "Jan",
                "Feb",
                "Mar",
                "Apr",
                "May",
                "Jun",
                "Jul",
                "Aug",
                "Sep",
                "Oct",
                "Nov",
                "Dec"
        };

        // Print out the number of days in each month.
        for (int i = 0; i < daysInMonth.length; i++) {
            if (i > 0) {
                System.out.print("\t");
            }
            System.out.println(monthNames[i] + ": " + daysInMonth[i] + " days");
        }
    }

}

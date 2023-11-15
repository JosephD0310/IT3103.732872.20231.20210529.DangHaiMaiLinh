import java.util.Scanner;

public class NumberofDayofMonth {
	// Check if the month input is valid
    private static boolean isValidMonth(String month) {
        return month.matches("^(january|jan\\.|jan|1|"
        		+ "february|feb\\.|feb|2|"
        		+ "march|mar\\.|mar|3|"
        		+ "april|apr\\.|apr|4|"
        		+ "may|5|"
        		+ "june|jun\\.|jun|6|"
        		+ "july|jul\\.|jul|7|"
        		+ "august|aug\\.|aug|8|"
        		+ "september|sep\\.|sep|9|"
        		+ "october|oct\\.|oct|10|"
        		+ "november|nov\\.|nov|11|"
        		+ "december|dec\\.|dec|12)$");
    }

    // Check if the year input is valid
    private static boolean isValidYear(String yearStr) {
        return yearStr.matches("^\\d{4}$");
    }

    // Get the number of days in a month, considering leap years
    private static int getDaysInMonth(String month, int year) {
        int days = 0;
        switch (month) {
            case "january":
            case "jan":
            case "1":
            case "march":
            case "mar":
            case "3":
            case "may":
            case "july":
            case "august":
            case "aug":
            case "8":
            case "october":
            case "oct":
            case "10":
            case "december":
            case "dec":
            case "12":
                days = 31;
                break;
            case "april":
            case "apr":
            case "4":
            case "june":
            case "jun":
            case "6":
            case "september":
            case "sep":
            case "9":
            case "november":
            case "nov":
            case "11":
                days = 30;
                break;
            case "february":
            case "feb":
            case "2":
                days = isLeapYear(year) ? 29 : 28;
                break;
        }
        return days;
    }

    // Check if a year is a leap year
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    //Main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        String month;
        int daysInMonth;
        //Input month
        while (true) {
            System.out.print("Enter a month (full name, abbreviation, 3 letters, or number): ");
            month = scanner.nextLine().toLowerCase();
            //Check the month is valid or not
            if (isValidMonth(month)) {
                break;
            } else {
                System.out.println("Invalid month input. Please try again.");
            }
        }
        //Input year
        while (true) {
            System.out.print("Enter a year (4 digits): ");
            String yearStr = scanner.nextLine();
            //Check the year is valid or not
            if (isValidYear(yearStr)) {
                year = Integer.parseInt(yearStr);
                break;
            } else {
                System.out.println("Invalid year input. Please enter a 4-digit year.");
            }
        }
        daysInMonth = getDaysInMonth(month, year);
        System.out.println("The number of days in " + month + " " + year + " is: " + daysInMonth);
        scanner.close();
    }
}
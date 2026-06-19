package TaskSheet121;
public class DateTask {
 // instance variables
 private byte day; // 4. In DateTask.java make the instance variables day, month, year to private.
 private byte month; // 4. In DateTask.java make the instance variables day, month, year to private.
 private short year;  // 4. In DateTask.java make the instance variables day, month, year to private.

// Constructors:

// The no-args constructor
public DateTask() {
    this(1, 1, 1); // 5. Add "this(1,1,1);" statement to the no-args constructor DateTask().
}
// Constructor that takes 3 arguments
public DateTask(int m, int d, int y) {
    setDate(m, d, y);
}
// Methods
public String toString() {
    return month + "/" + day + "/" + year; // 6. Set toString() method to display "12/12/2012" date format.
}

public String toStringNameString() {
    return setMonthName() + " " + day + ", " + year; // 6. Set toString() method to display "12/12/2012" date format.
}
public void setDate(int m, int d, int y) {
    if (valid(d, m, y)) {
        day = (byte) d;
        year = (short) y;
        month = (byte) m;
    }
    else{
        day = (byte) 0;
        year = (short) 0;
        month = (byte) 0;
    }
}
public static void leapYears() {
    for (int i = 1950; i <= 1984; i = i + 1) {
        if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0))
            System.out.println("The year " + i + " is a leap year");
    }
}

public static void leapYears(int y1, int y2) {
    for (int i = y1; i <= y2; i = i++) {
        if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0))
            System.out.println("The year " + i + " is a leap year");
    }
}

public int getDay() {
    return day; // 7. The getDay() methods set to return day.
}
public void setDay(int day) {
    if (valid(day, month, year)) {
        this.day = (byte) day;
    }
    else {
        this.day = 0; // 8. The setDay() methods set to return 0 if condition is false.
    }
}
public int getMonth() {
   return month;   // 9. The getMonth() method set to return month.
}
public void setMonth(int month) {
    if (valid(day, month, year)) {
        this.month = (byte) month;
    }
    else{
        this.month = (byte) 0;  // 10. The setMonth() method set to return 0 if condition is false.
    }
}

public String setMonthName() {
    String name;
    switch (month) {
        case 1:
            name = "January ";
            break;
        case 2:
            name = "February";
            break;
        case 3:
            name = "March";
            break;
        case 4:
            name = "April";
            break;
        case 5:
            name = "May";
            break;
        case 6:
            name = "June";
            break;
        case 7:
            name = "July";
            break;
        case 8:
            name = "August";
            break;
        case 9:
            name = "September";
            break;
        case 10:
            name = "October";
            break;
        case 11:
            name = "November";
            break;
        case 12:
            name = "December";
            break;
        default:
            name = "";
            break;
    }
    return name;
}
public int getYear() {
    return year;    // 11. The getYear() method set to return year.
}
public void setYear(int year) {
    if (valid(day, month, year)) {
        this.year = (short) year;
    }
    else{
        this.year = (short) 0;  // 12. The setYear() method set to return 0 if condition is false.
    }
}
private boolean valid(int day, int month, int year) {
    if (day > 31 || day < 1 || month > 12 || month < 1 || year < 1)  {
        System.out.println("Attempting to create a non-valid date " +month + "/" + day + "/" + year);
        return false;
    }
    switch (month) {
        case 4:
        case 6:
        case 9:
        case 11:
            return (day <= 30);
        case 2:
            return day <= 28 || (day == 29 && year % 4 == 0);
    }
    return true;
}
}
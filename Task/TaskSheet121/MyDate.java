package TaskSheet121;
public class MyDate {
    public static void main(String[] args) {
        DateTask date1 = new DateTask();
        DateTask date2 = new DateTask();

        date1.setDate(1, 1, 1950);
        date2.setDate(9, 21, 1984);

        System.out.println(date1.toStringNameString());
        System.out.println(date2.toStringNameString());
    
        // display leapyears
       DateTask.leapYears();

    }
}
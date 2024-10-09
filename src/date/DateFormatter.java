package date;

import java.text.DateFormat;
import java.util.Locale;

public class DateFormatter {

    /**
     * Main method of the class for the following question:
     *     Date Formater in Java.
     * */
    public static void main(String[] args) {
        // Date Default Format
        System.out.println("Today's date is " + new java.util.Date());

        // Simple Date Format
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Today's date is " + simpleDateFormat.format(new java.util.Date()));

        // Simple Date Format with time
        java.text.SimpleDateFormat simpleDateFormatWithTime = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Today's date is " + simpleDateFormatWithTime.format(new java.util.Date()));

        // Simple Date Format with Locale
        java.text.SimpleDateFormat simpleDateFormatWithLocale = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.FRENCH);
        System.out.println("Today's date is " + simpleDateFormatWithLocale.format(new java.util.Date()));

        // deprecated Date Format
        Locale locale = new Locale("fr", "FR");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);
        System.out.println("Today's date is " + dateFormat.format(new java.util.Date()));

        // Simple Date Format with Timezone
        java.text.SimpleDateFormat simpleDateFormatWithTimezone = new java.text.SimpleDateFormat("dd MMMM yyyy zzzz");
        System.out.println("Today's date is " + simpleDateFormatWithTimezone.format(new java.util.Date()));


        System.out.println("Date: " + new java.text.SimpleDateFormat("EEEE, dd MMMM yyyy hh:mm:ss zzzz").format(new java.util.Date()));
    }
}
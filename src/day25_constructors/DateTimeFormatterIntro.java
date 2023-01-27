package day25_constructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {

    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("y/MMM/dd EEE");

        LocalDate today = LocalDate.now();
        System.out.println(today.format(df));

        LocalDate date1 = LocalDate.of(2022,7,1);
        System.out.println(date1.format(df));

        DateTimeFormatter tf= DateTimeFormatter.ofPattern("hh:mm a");

        LocalTime time1 = LocalTime.of(7,5);
        System.out.println(time1.format(tf));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/y hh:mm a");

        LocalDateTime fullDateTime = LocalDateTime.now();
        System.out.println(fullDateTime.format(dtf));


    }
}

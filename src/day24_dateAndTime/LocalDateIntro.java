package day24_dateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate birthday = LocalDate.of(1990,5,22);
        System.out.println(birthday);

        //LocalDate birthday2 = LocalDate.of(-1990,5,22); // it should be exception
        //System.out.println(birthday2);
        //System.out.println(birthday2.getYear());

        //LocalDate birthday3 = LocalDate.of(1990,05,-22); // exception
        //System.out.println(birthday3);

        System.out.println("-------------------------------------------------------------");

        System.out.println(today.getYear());
        System.out.println(today.getMonth()); // NOVEMBER
        System.out.println(today.getMonthValue()); // 11
        System.out.println(today.getDayOfWeek()); // THURSDAY

        System.out.println(birthday.getDayOfWeek());

        System.out.println(today.getDayOfMonth()); //17
        System.out.println(today.getDayOfYear()); //321

        System.out.println("----------------------------------------------------------");

        today = today.plusYears(1);
        System.out.println(today); // 2023-11-17

        System.out.println("----------------------------------------------------------");

        LocalDate graduationDate = LocalDate.of(2015, 6, 4);

        graduationDate = graduationDate.plusYears(2);
        System.out.println(graduationDate); // 2017-06-04

        graduationDate = graduationDate.plusMonths(7);
        System.out.println(graduationDate); // 2018-01-04

        graduationDate = graduationDate.plusDays(8);
        System.out.println(graduationDate); // 2018-01-12

        System.out.println("--------------------------------------------");

        LocalDate yourBirthDay = LocalDate.of(2005, 4, 1);

        LocalDate yourBrotherBirthDay = yourBirthDay.minusYears(2).minusMonths(3);
        System.out.println(yourBrotherBirthDay); // 2003-01-01

        System.out.println("--------------------------------------------");

        LocalDate birthday1 = LocalDate.of(1994, 7, 7);
        LocalDate birthday2 = LocalDate.of(1994, 7, 7);

        boolean r1 = birthday1.isEqual(birthday2);

        System.out.println(r1); // true

        System.out.println("--------------------------------------------");

        LocalDate grad_date = LocalDate.of(2023, 1, 1);

        System.out.println(grad_date.isAfter(LocalDate.of(2022, 12, 31))); // true
        System.out.println(grad_date.isBefore(LocalDate.of(2022, 12, 31))); // false

        System.out.println("--------------------------------------------");

        System.out.println(LocalDate.of(2020,11,17).isLeapYear());
        System.out.println(LocalDate.now().isLeapYear());










    }
}

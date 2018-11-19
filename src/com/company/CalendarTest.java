package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main (String [] args){
        Date aDate = null;
        try {
            aDate = new SimpleDateFormat("yyyy-mm-dd").parse("2012-01-15");
            Calendar aCalender = Calendar.getInstance();
            aCalender.setTime(aDate);
            System.out.println(aCalender.get(aCalender.DAY_OF_MONTH)+","+aCalender.get(aCalender.MONTH));

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate bDate = LocalDate.parse("2012-01-15",formatter);
            System.out.println(" " + bDate.getDayOfMonth() + " " + bDate.getMonthValue());
        }
        catch(ParseException ex){System.out.println("parse exception ex ");}
        catch(DateTimeParseException ex){System.out.println("parse exception ex ");}

    }
}

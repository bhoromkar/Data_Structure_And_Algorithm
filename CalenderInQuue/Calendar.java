package com.bridgelabz.CalenderInQuue;

import java.util.*;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.LinkedList;
import java.util.Queue;

public class Calendar {

        // Create a queue of weeks to store the calendar
        Queue<Week> calendar = new LinkedList<>();
        // Get the first day of the month
    public void getWeekDays(int month,int year){
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(year, month - 1, 1);
        int firstDayOfWeek = cal.get(java.util.Calendar.DAY_OF_WEEK);
        int daysInMonth = cal.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);

        // Create the first week with empty days before the first day of the month
        Week currentWeek = new Week();
        for (int i = 1; i < firstDayOfWeek; i++) {
            currentWeek.addDay(new WeekDay("", i));
        }

        // Add the days of the month to the weeks
        for (int dayOfMonth = 1; dayOfMonth <= daysInMonth; dayOfMonth++) {
            int dayOfWeek = (firstDayOfWeek + dayOfMonth - 2) % 7 + 1;
            currentWeek.addDay(new WeekDay(Integer.toString(dayOfMonth), dayOfWeek)); //for adding the name of days
            if (dayOfWeek == 7 || dayOfMonth == daysInMonth) {

                calendar.add(currentWeek);
                currentWeek = new Week();
            }
        }

        // Print the calendar
        System.out.printf("%10s%10s%10s%10s%10s%10s%10s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
        for (Week week : calendar) {
            for (WeekDay day : week.getDays()) {
                System.out.printf("%10s", day.getDate());
            }
            System.out.println();
        }
    }
}

class Week {
    private List<WeekDay> days = new LinkedList<>();

    public void addDay(WeekDay day) {
        days.add(day);
    }

    public List<WeekDay> getDays() {
        return days;
    }
}

class WeekDay {
    private String date;
    private int dayOfWeek;

    public WeekDay(String date, int dayOfWeek) {
        this.date = date;
        this.dayOfWeek = dayOfWeek;
    }

    public String getDate() {
        return date;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }
}

package com.bridgelabz.CalenderInQuue;

import java.util.Scanner;

public class CalenderMain {
    public static void main(String[] args) {
 Calendar calendar = new Calendar();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        calendar.getWeekDays(month,year);
    }
}


package com.bridgelabz.datastructure.unorderedlist;

import java.util.Scanner;

    public class Calendar {

        public static void printCalendar(int month, int year) {
            String[] months = {"January", "February", "March", "April", "May", "June", "July",
                    "August", "September", "October", "November", "December"};

            int[][] calendar = new int[6][7];

            // Get the first day of the month
            java.util.Calendar cal = java.util.Calendar.getInstance();
            cal.set(year, month - 1, 1);
            int firstDayOfMonth = cal.get(java.util.Calendar.DAY_OF_WEEK);

            // Fill in the calendar with the days of the month
            int dayOfMonth = 1;
            for (int i = 0; i < 6; i++) {  // for no of weeks
                for (int j = 0; j < 7; j++) { //for no of days
                    if (i == 0 && j < firstDayOfMonth - 1) {
                        // Fill in the days before the first day of the month with zeros
                        calendar[i][j] = 0;
                    } else if (dayOfMonth > getDaysInMonth(month, year)) {
                        // Fill in the days after the last day of the month with zeros
                        calendar[i][j] = 0;
                    } else {
                        // Fill in the days of the month
                        calendar[i][j] = dayOfMonth;
                        dayOfMonth++;
                    }
                }
            }

            // Print the calendar
            System.out.println(months[month-1] + " " + year);
            System.out.println("Su Mo Tu We Th Fr Sa");

            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 7; j++) {
                    if (calendar[i][j] == 0) {
                        System.out.print("   ");
                    } else {
                        System.out.printf("%2d ", calendar[i][j]);
                    }
                }
                System.out.println();
            }
        }

        public static int getDaysInMonth(int month, int year) {
            int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            if (month == 2 && isLeapYear(year)) {
                return 29;
            } else {
                return daysInMonth[month - 1];
            }
        }

        public static boolean isLeapYear(int year) {
            if (year % 4 == 0 ) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter month (1-12): ");
            int month = sc.nextInt();
            System.out.print("Enter year: ");
            int year = sc.nextInt();

            printCalendar(month, year);

            sc.close();
        }
    }




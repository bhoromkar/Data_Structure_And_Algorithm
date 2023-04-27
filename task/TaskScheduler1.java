package com.bridgelabz.task;

import java.util.*;

    public class TaskScheduler1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // read the number of tasks
            int t = sc.nextInt();

            while(t-- > 0) {
                // read the deadline and minutes required for each task
                int d = sc.nextInt(); //time required
                int m = sc.nextInt(); //time given

                // calculate the maximum overshoot
                int overshoot = getMaximumOvershoot(d, m);

                // print the result
                System.out.println(overshoot + "overshoot");
            }

            sc.close();
        }

        // function to calculate the maximum overshoot for a task
        private static int getMaximumOvershoot(int d, int m) {
            // if the time required is less than or equal to the deadline,
            // there will be no overshoot
            if(m <= d) {
                return 0;
            }

            // calculate the minimum number of parts the task needs to be divided into
            int parts = m/d;
            if(m % d != 0) {
                parts++;
            }

            // calculate the maximum overshoot
            int overshoot = (parts * m) - (d * parts * (parts - 1))/2 - m;

            return overshoot;
        }
    }



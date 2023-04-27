package com.bridgelabz.task;


import java.util.*;

    public class TaskScheduler {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int t = input.nextInt(); // number of test cases
            for (int i = 0; i < t; i++) {
                int n = input.nextInt(); // number of tasks
                Task[] tasks = new Task[n];
                for (int j = 0; j < n; j++) {
                    int d = input.nextInt(); // deadline
                    int m = input.nextInt(); // minutes required
                    tasks[j] = new Task(d, m);
                }
                Arrays.sort(tasks); // sort tasks by deadline
                int maxOvershoot = 0;
                int timeRemaining = 0;
                for (Task task : tasks) {
                    timeRemaining =timeRemaining + task.minutes;
                    maxOvershoot = Math.max(maxOvershoot, timeRemaining - task.deadline);
                }
                System.out.println(maxOvershoot);
            }
            input.close();
        }

        static class Task implements Comparable<Task> {
            int deadline;
            int minutes;
            Task(int d, int m) {
                deadline = d;
                minutes = m;
            }

            @Override
            public int compareTo(Task other) {
                return deadline - other.deadline;
            }
        }
    }
package com.bridgelabz.datastructure.unorderedlist;

    import java.util.*;

    public class AnagramPrimeNumbers {

        public static boolean isPrime(int num) {
            if (num < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public static boolean areAnagrams(int num1, int num2) {
            int[] count = new int[10];
            while (num1 > 0) {
                count[num1 % 10]++;
                num1 /= 10;
            }
            while (num2 > 0) {
                count[num2 % 10]--;
                num2 /= 10;
            }
            for (int i = 0; i < 10; i++) {
                if (count[i] != 0) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            LinkedList<Integer> stack = new LinkedList<Integer>();
            for (int i = 2; i <= 1000; i++) {
                if (isPrime(i)) {
                    for (int j = i + 1; j <= 1000; j++) {
                        if (isPrime(j) && areAnagrams(i, j)) {
                            stack.push(i);
                            stack.push(j);
                        }
                    }
                }
            }
            while (!stack.isEmpty()) {
                System.out.println(stack.pop());
            }
        }
    }



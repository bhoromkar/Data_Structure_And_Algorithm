package com.bridgelabz.datastructure.unorderedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
    public class PrimeFinder {
        private static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public void findPrimes() {
            int[][] primes = new int[10][];
            int index = 0;
            for (int i = 0; i < 1000; i += 100) {
                List<Integer> primeList = new ArrayList<>();
                for (int j = i; j < i + 100; j++) {
                    if (isPrime(j)) {
                        primeList.add(j);
                    }
                }
                primes[index++] = primeList.stream().mapToInt(Integer::intValue).toArray();
            }
            for (int i = 0; i < 10; i++) {
                System.out.println("Primes in range " + (i * 100) + "-" + ((i + 1) * 100 - 1) + ": " + Arrays.toString(primes[i]));
            }
        }

        public static void main(String[] args) {
            PrimeFinder primeFinder = new PrimeFinder();
            primeFinder.findPrimes();
        }
    }



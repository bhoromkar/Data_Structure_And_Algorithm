package com.bridgelabz.datastructure.unorderedlist;
import java.util.*;

    // Map to store the slot numbers and their corresponding chain
    public class HashTable {
        private Map<Integer, LinkedList<Integer>> slots;

        public HashTable() {
            slots = new HashMap<>();
            for (int i = 0; i < 10; i++) {
                slots.put(i, new LinkedList<Integer>());
            }
        }

        public void insert(int num) {
            int slotNum = num % 11;
            LinkedList<Integer> chain = slots.get(slotNum);
            if (!chain.contains(num)) {
                chain.add(num);
            }
        }

        public void search(int num) {
            int slotNum = num % 11;
            LinkedList<Integer> chain = slots.get(slotNum);
            if (chain.contains(num)) {
                chain.remove(Integer.valueOf(num));
                System.out.println(num + " found and removed.");
            } else {
                chain.add(num);
                System.out.println(num + " not found and added.");
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            HashTable table = new HashTable();
            System.out.println("Enter a set of numbers (separated by spaces):");
            String[] nums = scanner.nextLine().split(" ");
            for (String num : nums) {
                table.insert(Integer.parseInt(num));
            }
//            System.out.println("Enter a number to search:");
//            int searchNum = scanner.nextInt();
//            table.search(searchNum);
            System.out.println(table.slots);
        }
    }


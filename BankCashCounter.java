package com.bridgelabz;//package com.bridgelabz;
//
//    import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//
//    public class BankingCashCounter {
//        private static Scanner scanner = new Scanner(System.in);
//
//        public static void main(String[] args) {
//            Queue<Customer> queue = new LinkedList<>();
//            int balance = 0;
//
//            System.out.println("Welcome to the banking cash counter.");
//
//            while (true) {
//                System.out.println("Enter 1 to add a customer, 2 to serve a customer, or 3 to exit.");
//                int choice = scanner.nextInt();
//
//                if (choice == 1) {
//                    System.out.println("Enter 1 to deposit or 2 to withdraw:");
//                    int transactionType = scanner.nextInt();
//
//                    System.out.println("Enter the amount:");
//                    int amount = scanner.nextInt();
//
//                    Customer customer = new Customer(transactionType, amount);
//                    queue.add(customer);
//                } else if (choice == 2) {
//                    if (queue.isEmpty()) {
//                        System.out.println("No customers in queue.");
//                        continue;
//                    }
//
//                    Customer customer = queue.remove();
//                    int transactionType = customer.getTransactionType();
//                    int amount = customer.getAmount();
//
//                    if (transactionType == 1) {
//                        balance += amount;
//                        System.out.println("Deposited " + amount + " dollars. Current balance is " + balance + " dollars.");
//                    } else if (transactionType == 2) {
//                        if (amount > balance) {
//                            System.out.println("Cannot withdraw " + amount + " Rupees . Insufficient balance.");
//                        } else {
//                            balance -= amount;
//                            System.out.println("Withdrew " + amount + " dollars. Current balance is " + balance + " dollars.");
//                        }
//                    }
//                } else if (choice == 3) {
//                    System.out.println("Exiting the program.");
//                    break;
//                } else {
//                    System.out.println("Invalid choice.");
//                }
//            }
//            System.out.println(queue);
//        }
//
//
//        static class Customer {
//            private int transactionType; // 1 for deposit, 2 for withdraw
//            private int amount;
//
//            public Customer(int transactionType, int amount) {
//                this.transactionType = transactionType;
//                this.amount = amount;
//            }
//
//            public int getTransactionType() {
//                return transactionType;
//            }
//
//            public int getAmount() {
//                return amount;
//            }
//        }
//    }
//
//
//
//
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BankCashCounter {
    public static void main(String[] args) {
        Queue<Customer> queue = new LinkedList<>();
        int cashBalance = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter customer name:");
            String name = scanner.next();

            System.out.println("Enter deposit or withdrawal amount:");
            int amount = scanner.nextInt();

            System.out.println("Enter D for deposit or W for withdrawal:");
            String choice = scanner.next();

            boolean isDeposit = false;
            if (choice.equalsIgnoreCase("D")) {
                isDeposit = true;
            }

            Customer customer = new Customer(name, amount, isDeposit);
            queue.add(customer);

            System.out.println("Press E to exit or any other key to continue:");
            String exitChoice = scanner.next();
            if (exitChoice.equalsIgnoreCase("E")) {
                break;
            }
        }

        while (!queue.isEmpty()) {
            Customer customer = queue.remove();
            int amount = customer.getAmount();

            if (customer.isDeposit()) {
                cashBalance += amount;
                System.out.println(customer.name + " has deposited $" + amount + ". Current cash balance: $" + cashBalance);
            } else {
                if (amount > cashBalance) {
                    System.out.println(customer.name + " does not have enough balance to withdraw $" + amount);
                } else {
                    cashBalance -= amount;
                    System.out.println(customer.name + " has withdrawn $" + amount + ". Current cash balance: $" + cashBalance);
                }
            }
        }

        scanner.close();
    }
    static class Customer {
        String name;
        int amount;
        boolean isDeposit;

        public Customer(String name, int amount, boolean isDeposit) {
            this.name = name;
            this.amount = amount;
            this.isDeposit = isDeposit;
        }

        public int getAmount() {
            return amount;
        }

        public boolean isDeposit() {
            return isDeposit;
        }
    }

}

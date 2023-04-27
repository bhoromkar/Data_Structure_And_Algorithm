package com.bridgelabz.datastructure.unorderedlist;

import com.bridgelabz.linkedlist.SortedLinkList;

import java.util.Scanner;

public class ProblemTwo<T extends Comparable> {

    static SortedLinkList<Integer> myListOne = new SortedLinkList<>();


    public void checkElement(SortedLinkList<Integer> myListOne, int findNum) {
        boolean number = true;
        int size = myListOne.size();
        for (int i = 0; size < i; i++) {

            int number1 = myListOne.getNumberAtPosition(i);
            System.out.println(number1);
            if (number1 == findNum) {
                System.out.println("number found");
                number = false;
                break;
            }
        }
        if (number != false) {
            System.out.println("number not found in list ");
            myListOne.append(findNum);
            if(number==false){
           myListOne.delete(findNum);
         }
        }
        myListOne.display();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProblemTwo obj = new ProblemTwo();
        System.out.println("Enter the number in linked list");
        int num = sc.nextInt();
        myListOne.append(num);
        int num1 = sc.nextInt();
        myListOne.append(num1);
        int num2 = sc.nextInt();
        myListOne.append(num2);
        int num3 = sc.nextInt();
        myListOne.append(num3);
        int num4 = sc.nextInt();
        myListOne.append(num4);
        int num5 = sc.nextInt();
        myListOne.append(num5);
        int num6 = sc.nextInt();
        myListOne.append(num6);
        int num7 = sc.nextInt();
        myListOne.append(num7);
        int num8 = sc.nextInt();
        myListOne.append(num8);
        int num9 = sc.nextInt();
        myListOne.append(num9);

        System.out.println("Enter the number which you to have to find");
        int findNum = sc.nextInt();
        obj.checkElement(myListOne,findNum);



    }
}
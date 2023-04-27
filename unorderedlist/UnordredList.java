package com.bridgelabz.datastructure.unorderedlist;

import com.bridgelabz.linkedlist.Node;
import com.bridgelabz.linkedlist.SortedLinkList;

import java.util.LinkedList;
import java.util.Scanner;

public class UnordredList {
    LinkedList<String> mylinked = new LinkedList<>();

    public void unsortedlist(String str ,String searchword) {
        String[] arrOfStr = str.split(" ");
        for (String a : arrOfStr)
            mylinked.add(a);
         boolean word = true;
         for (int i = 0; i < mylinked.size(); i++) {
             String data = mylinked.get(i);
             if(data.equals(searchword)){
                 System.out.println("The word is foundd in list" );

                 word= false;
                 break;
             }
         }
         if(word != false ){
             mylinked.add(searchword);
         }
        System.out.println(mylinked);

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String str = sc.nextLine();
        System.out.println("Enter word find");
        String searchword=sc.next();
        System.out.println(str);
        UnordredList un = new UnordredList();
        un.unsortedlist(str , searchword);
    }

}
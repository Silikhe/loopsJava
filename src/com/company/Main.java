package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        String[] names = new  String[5];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a number");

        int count = 0;
        int x = scanner.nextInt();
       while ( x !=10){
           x = scanner.nextInt();
           count ++;
       }
	// write your code here
        System.out.println("You have tried " + count + " times");

    }
}

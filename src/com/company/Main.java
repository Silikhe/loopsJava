package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        String[] names = new  String[5];
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i< names.length; i++){
            System.out.println("Enter 5 names");
            String input =scanner.nextLine();
            names[i] = input;
        }
        for (String name:names){
            if ( name.equals("Wanjala")){
//                System.out.println(name);
                 break;
            }
            System.out.println(name);
        }
	// write your code here

    }
}

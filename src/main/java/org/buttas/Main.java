package org.buttas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Website");
        String website = sc.nextLine();

        if(website.endsWith(".com")){
            System.out.println("Its a Commercial Website");
        }
        else if(website.endsWith(".gov")){
            System.out.println("Its a govt website");
        }

    }
}
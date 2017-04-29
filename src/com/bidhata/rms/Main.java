/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bidhata.rms;

import com.bidhata.util.Cover;
import com.bidhata.util.Menu;
import java.util.Scanner;

/**
 *
 * @author Bidhata
 */
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\t\t\t\t\t**************************************");
        System.out.println("\t\t\t\t\t\tRESULT MANAGEMENT SYSTEM (RMS)");
        System.out.println("\t\t\t\t\t**************************************");
        System.out.printf("\n\n\n\n");
        System.out.println("\t\t\t\t\t\t Welcome to ABC School");

        Menu menu = new Menu();

        while (true) {
            Cover cover = new Cover();
            System.out.println();

            System.out.println("OPTIONS AVAILABLE");

            menu.menu();

            while (true) {

                System.out.println("################################################################");

                cover.result();
                System.out.println("#################################################################");
                System.out.println("\n\n");

                System.out.println("Do you want to continue?[Y/N]");
                String choice = input.next();
                if (choice.equalsIgnoreCase("y")) {
                    menu.menu();
                } else {
                    System.out.println("thank you for using RMS");
                    break;
                }
            }
            System.out.println("######################################");
            System.out.println("Do you want to UPDATE RMS??[y/N]");
            String choice = input.next();
            if (choice.equalsIgnoreCase("y")) {
                menu.menu();
            } else {
                break;
            }
        }
    }

}

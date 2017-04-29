/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bidhata.util;

import java.util.Scanner;

/**
 *
 * @author Bidhata
 */
public class calculate {

    Scanner input = new Scanner(System.in);
    String[] name = {"bidhata", "anita", "sunita"};
    String[] subjects = {"Math", "Computer"};
    double marks[][] = new double[name.length][subjects.length];
    double total[] = new double[name.length];
    double percent[] = new double[name.length];
    boolean fail[] = new boolean[name.length];
    int passmark = 32;

    public void getdata() {
        System.out.println("enter the marks of students");
        for (int i = 0; i < name.length; i++) {
            System.out.println("MARKS OF " + name[i]);
            System.out.println("|||||||||||||||||||||||");
            for (int j = 0; j < subjects.length; j++) {
                System.out.printf(subjects[j] + "=");
                do {
                    marks[i][j] = input.nextDouble();
                    if (marks[i][j] > 100) {
                        System.out.println("out of range");
                        System.out.println("please again enter the marks in " + subjects[j]);
                    }
                } while (marks[i][j] > 100);

            }
        }
    }

    public double[] total() {
        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < subjects.length; j++) {
                total[i] += marks[i][j];
            }
        }
        return total;
    }

    public double[] percentage() {
        for (int i = 0; i < name.length; i++) {
            percent[i] = total[i] / subjects.length;
        }
        return percent;
    }

    public void showTotal() {
        total();
        System.out.println("***********************TOTAL*********************");
        System.out.printf("%15s %15s %15s", "S.N", "Name", "Total");
        System.out.println();

        for (int i = 0; i < name.length; i++) {
            {
                System.out.printf("%15s %15s %15s", (i + 1), name[i], total[i]);
            }
            System.out.println();
        }
    }

    public void showResult() {
        percentage();
        isFail();
        System.out.println("**************************RESULT******************************");

        System.out.printf("%15s %15s %15s %15s", "S.N", "Name", "Total", "Percentage");
        System.out.println();

        for (int i = 0; i < name.length; i++) {
            if (fail[i]) {
                System.out.printf("%15s %15s %15s %15s", (i + 1), name[i], total[i], "-");
            } else {
                System.out.printf("%15s %15s %15s %15s", (i + 1), name[i], total[i], percent[i]);
            }
            System.out.println();
        }

    }

    public boolean[] isFail() {
        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < subjects.length; j++) {

                if (marks[i][j] < passmark) {
                    fail[i] = true;
                }
            }
        }
        return fail;
    }

    public void failStudents() {
        isFail();
        System.out.println("*******list of Failed Students and their Marks is*****");
        System.out.printf("%15s %15s %15s", "S.N", "Name", "Total");
        System.out.println();
        int j = 1;
        for (int i = 0; i < name.length; i++) {
            if (fail[i]) {
                System.out.printf("%15s %15s %15s", j, name[i], total[i]);
                System.out.println();
            }
        }
    }
}

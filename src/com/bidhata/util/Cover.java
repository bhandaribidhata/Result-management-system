/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bidhata.util;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Cover {

    Scanner input = new Scanner(System.in);
    calculate calc = new calculate();

    int j = 0;

    int ch;

    public void result() {

        do {
            System.out.println("Enter your choice");
            ch = input.nextInt();
            if (j == 0 && ch > 1) {
                System.out.println("you must first enter the marks");
            }
        } while (j == 0 && ch > 1);

        switch (ch) {

            case 1:
                calc.getdata();
                break;

            case 2:
                calc.showTotal();
                break;

            case 3:
                calc.showResult();
                break;

            case 4:
                calc.failStudents();
                break;
            case 5:
                break;

            default:
                System.out.println("you entered wrong choice");
                break;
        }

        j++;
    }

}

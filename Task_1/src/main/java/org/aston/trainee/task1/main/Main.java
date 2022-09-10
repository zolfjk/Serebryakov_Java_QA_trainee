package org.aston.trainee.task1.main;

import org.aston.trainee.task1.services.CalculateService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        CalculateService calculateService = new CalculateService();
        System.out.println("Input a number: ");
        int inputNum = in.nextInt();
        String message = calculateService.calculate(inputNum);
        if (!(message == null)) {
            System.out.print(message);
        }
        in.close();
    }
}
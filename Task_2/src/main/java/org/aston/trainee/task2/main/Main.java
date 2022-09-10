package org.aston.trainee.task2.main;

import org.aston.trainee.task2.services.NameCheckService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nameToCheck = "Вячеслав";
        Scanner in = new Scanner(System.in);
        NameCheckService nameCheck = new NameCheckService();
        System.out.println("Enter a name: ");
        String name = in.next();
        String message = nameCheck.check(name, nameToCheck);
        System.out.print(message);
        in.close();

    }
}
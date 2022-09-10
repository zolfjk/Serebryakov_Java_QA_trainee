package org.aston.trainee.task3.main;

import org.aston.trainee.task3.services.MultiplicityOfNumbersService;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int multiplesNumber = 3;
        Scanner in = new Scanner(System.in);
        MultiplicityOfNumbersService multiplivity = new MultiplicityOfNumbersService();
        System.out.println("Enter the number of digits: ");
        int massiveSize = in.nextInt();
        int[] massiveoOfNumbers = new int[massiveSize];
        System.out.println("Enter your digits: ");
        for (int i = 0; i < massiveSize; i++) {
            massiveoOfNumbers[i] = in.nextInt();
        }

        int[] answerMassive = multiplivity.multiplicityOfNumbers(massiveoOfNumbers, massiveSize, multiplesNumber);

        System.out.print("The numbers are multiples of three: " + Arrays.toString(answerMassive));
        in.close();
    }

}
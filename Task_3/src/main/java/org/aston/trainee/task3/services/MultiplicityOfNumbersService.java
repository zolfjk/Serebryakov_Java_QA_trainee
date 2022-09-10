package org.aston.trainee.task3.services;

public class MultiplicityOfNumbersService {
    public int[] multiplicityOfNumbers(int[] inputMassive, int massiveSize, int multiplesNumber) {

        int numbersToAnswerSize = 0;
        for (int i = 0; i < massiveSize; i++) {
            if (inputMassive[i] % multiplesNumber == 0) {
                numbersToAnswerSize += 1;
            }
        }
        int[] numbersToAnswer = new int[numbersToAnswerSize];
        int t = 0;
        for (int i = 0; i < massiveSize; i++) {
            if (inputMassive[i] % multiplesNumber == 0) {
                numbersToAnswer[t] = inputMassive[i];
                t += 1;
            }
        }
        return numbersToAnswer;
    }
}
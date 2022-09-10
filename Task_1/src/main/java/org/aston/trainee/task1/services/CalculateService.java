package org.aston.trainee.task1.services;

public class CalculateService{
    public String calculate(int num){
        String message = null;
        if (num > 7){
            message = "Привет";
        }
        return message;
    }
}


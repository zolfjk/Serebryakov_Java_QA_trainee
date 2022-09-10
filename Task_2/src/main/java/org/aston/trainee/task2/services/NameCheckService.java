package org.aston.trainee.task2.services;

public class NameCheckService {
    public String check(String name, String nameToCheck) {
        String message = null;
        if (name.equals(nameToCheck)) {
            message = "Привет, " + name;
        }
        else {
            message = "Нет такого имени";
        }
        return message;
    }
}

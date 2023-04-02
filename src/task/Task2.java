package task;

import java.util.ArrayDeque;
import java.util.Scanner;

//Принимает от пользователя и “запоминает” строки.
//        Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//        Если введено revert, удаляет предыдущую введенную строку из памяти.
public class Task2 {
    private static ArrayDeque<String> dataBase = new ArrayDeque<>();

    public static void main(String[] args) {
        while (true) {
            write();
        }
    }

    private static String getUserInput() {
        System.out.println("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    private static void saveToDB(String input) {
        dataBase.push(input);
    }

    private static void write() {
        String userInput = getUserInput();
        if (userInput.equalsIgnoreCase("print")) {
            System.out.println(dataBase);
        } else if (userInput.equalsIgnoreCase("revert")) {
            dataBase.pop();
            System.out.println(dataBase);
        } else saveToDB(userInput);
    }



}

package ru.ibs.finalprogram3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int flag = 0, count = 0, max = 0, numberString = 0;
        System.out.println("Введите количество строк n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] str = new String[n];
        System.out.println("Введите строки");
        for (int i = 0; i < n; i++) {
            System.out.println("Строка " + (i+1) + ":");
            str[i] = input.next();
            char[] strChar = str[i].toCharArray(); // Преобразуем строку в массив символов
            for (int j = 0; j < strChar.length - 2; j++) {
                for (int k = 0; k < strChar.length - 1; k++) {
                    if (strChar[j] == strChar[k] && j != k) { // Если символ повторяется flag = 1
                        flag = 1;
                    }
                }
                if (flag == 0) { //Если символ не повторяется счетчик увеличивается на 1
                    count++;
                } else {
                    flag = 0;
                }
            }
            if (max < count) { //Максимальное кол-во неповторяемых символов
                max = count;
                numberString = i; // Номер строки
            }
            count = 0;
        }
        System.out.println("Ответ: "+str[numberString]);
    }
}

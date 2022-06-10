package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger warningLogger = new WarningLogger();
        Logger consoleLogger = new ConsoleLogger();
        Logger errorLogger = new ErrorLogger();


        errorLogger.setNextLogger(warningLogger);
        warningLogger.setNextLogger(consoleLogger);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :\n1: Console Logger\n2: Warning Logger\n3:Error Logger\n4:Show all");
        int a = sc.nextInt();
        if(a == 1) {
            consoleLogger.Message("1 This is a normal logger.");
            System.out.println();
        }


        else if(a == 2){
            warningLogger.Message("2 This is an warning level logger");
            System.out.println();
        }


        else if(a == 3){
            errorLogger.Message("3 This is an error level logger.");
        }


        else if(a == 4){
            consoleLogger.Message("4 This is a normal logger.");
            System.out.println();
            warningLogger.Message("4 This is an warning level logger");
            System.out.println();
            errorLogger.Message("4 This is an error level logger.");
        }
    }
}

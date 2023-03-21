package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.Math;
import java.util.Scanner;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public static int fact(int num){
        if(num == 0){
            return 1;
        }
        return fact(num-1) * num;
    }

    public static double calculate(int op, float num1, float num2){
        switch (op) {
            case 1 : {
                if(num1 < 0){
                    logger.error("Invalid input. Input must be greater than or equal to 0");
                    return -1;
                }
                return Math.sqrt(num1);
            }
            case 2 : {
                if(num1 < 0){
                    logger.error("Invalid input. Input must be a positive integer");
                    return -1;
                }
                return fact((int) num1);
            }
            case 3 : {
                if(num1 <= 0){
                    logger.error("Invalid input. Input must greater than 0");
                }
                return Math.log(num1);
            }
            case 4 : {
                return Math.pow(num1, num2);
            }
        }

        return -1;
    }

    public static double calculate(int op, float num1){
        return calculate(op, num1, 0);
    }

    private static void printMenu(){
        System.out.println("Operations:");
        System.out.println("0: exit");
        System.out.println("1: square root");
        System.out.println("2: factorial");
        System.out.println("3: natural logarithm");
        System.out.println("4: power");
        System.out.printf("Enter operation: ");

    }
    public static void main(String[] args)
    {
        printMenu();

        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        float num= 0, num2 = 0;
        while(operation != 0){
            if(operation < 0 || operation > 4){
                System.out.printf("Invalid ");
                continue;
            }
            logger.info("Operation: " + operation);
            System.out.printf("Enter Number: ");
            num = sc.nextFloat();
            logger.info("Input 1: " + num);
            if(operation == 4){
                System.out.printf("Enter Number: ");
                num2 = sc.nextFloat();
                logger.info("Input 2: " + num2);
            }
            double res = calculate(operation, num, num2);
            if(res == -1){
                System.out.println("Invalid Input");
            }
            else{
                logger.info("Result: " + res);
                System.out.println("Result: " + res);
            }
            printMenu();
            operation = sc.nextInt();
        }
        sc.close();
    }
}

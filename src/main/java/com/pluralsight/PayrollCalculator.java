package com.pluralsight;

import java.util.*;

public class PayrollCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] arg) {
        System.out.print("What is your name? ");
        scanner.nextLine();

        float hours = promptforFloat("How many hours did you work last week? ");
        float payRate = promptforFloat("What is your pay rate? ");

        if(hours > 40) {
            System.out.printf("Your gross income is: %.2f" , overtime(hours, payRate));
        }else{
            System.out.printf("Your gross income is: %.2f", grossPay(hours, payRate));
        }

    }

    public static float promptforFloat(String prompt) {
        System.out.print(prompt);
        float num = scanner.nextFloat();
        scanner.nextLine();
        return num;
    }

    public static float grossPay(float hours, float pay_rate){
        float total_pay = hours * pay_rate;
        return total_pay;
    }
    public static float overtime(float hours, float pay_rate){
        float overtime_hours = hours - 40;
        float overtime_payrate = pay_rate * 1.5f;
        float overtime_pay = overtime_hours * overtime_payrate;
        return grossPay(40,pay_rate)+ overtime_pay;
    }
}

/**
 Калькулятор для расчета +,-,*,/. Из особенностей: числа могут
 без не целочисленные(разделенные запятой) и деление на ноль не допускается
 */
package calculator;

import java.util.Scanner;

public class soft_calculator {
    public static void main(String[] args) {
        Scanner scan_name = new Scanner(System.in);
        float one, two, result = 0;
        char operation;
        System.out.println("Введите первое значение: ");
        one = scan_name.nextFloat();
        System.out.println("Введите второе значение: ");
        two = scan_name.nextFloat();
        System.out.println("Какую операцию выполняем? (+, -, *, /) ");
        operation = scan_name.next().charAt(0);
        switch (operation){
            case '+': result = one + two;
                break;
            case '-': result = one - two;
                break;
            case '*': result = one * two;
                break;
            case '/':
                if (two == 0) {
                    System.out.println("На ноль делить нельзя, я это знаю");}
                else
                    result = one / two;
                break;
            default:
                System.out.println("Я еще не достаточно умный для такого");
                return;
        }
        System.out.println("Итого: " + one + " " + operation + " " + two + " = " + result);
        }

    }





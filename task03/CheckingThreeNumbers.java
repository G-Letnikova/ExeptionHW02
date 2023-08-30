package task03;

import java.util.Scanner;

public class CheckingThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();

        try {
            if (num1 > 100 ) {
                throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
                } 
            if (num2 < 0) {
                throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
                }
            if (num1 + num2 < 10) {
                throw new NumberSumException("Сумма первого и второго чисел слишком мала");
            }
            if (num3 == 0) {
                throw new DivisionByZeroException("Деление на 0 недопустимо");
                }
            System.out.println("Ппроверка пройдена успешно");
        } catch (NumberOutOfRangeException e) {
            System.out.println(e.getMessage());
        } catch (NumberSumException e) {
            System.out.println(e.getMessage());
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
    
    
}

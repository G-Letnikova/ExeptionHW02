package task03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();
        Checker checker = new Checker();

        try {
            System.out.println(checker.check3Num(num1,num2,num3));
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

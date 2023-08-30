//package task01;
import java.util.Scanner;

public class CheckingNumberForPositive  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите положительное число: ");
        int num = scanner.nextInt();

        try {
            if (num <= 0 ) {
                throw new InvalidNumberException("Некорректное число");
                }
            System.out.println("Число корректно");
            
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
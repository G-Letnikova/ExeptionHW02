package task03;

public class Checker {
    public String check3Num (int num1, int num2, int num3) throws NumberOutOfRangeException, NumberSumException, DivisionByZeroException {
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
        
        return "Проверка пройдена успешно";
        
    }
    
}

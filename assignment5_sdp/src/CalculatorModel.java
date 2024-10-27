public class CalculatorModel {
    // Метод сложения двух чисел
    public double add(double a, double b) {
        return a + b;
    }

    // Метод вычитания двух чисел
    public double subtract(double a, double b) {
        return a - b;
    }

    // Метод умножения двух чисел
    public double multiply(double a, double b) {
        return a * b;
    }

    // Метод деления двух чисел
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль"); // Исключение при делении на ноль
        }
        return a / b;
    }
}

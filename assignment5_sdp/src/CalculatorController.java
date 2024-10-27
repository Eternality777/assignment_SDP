import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private final CalculatorModel model; // Модель для выполнения расчетов
    private final CalculatorView view;   // Представление для отображения интерфейса

    // Конструктор, инициализирующий модель, представление и добавляющий слушателя
    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
        this.view.addOperationListener(new OperationListener()); // Добавляем слушателя кнопок
    }

    // Вложенный класс для обработки событий кнопок
    class OperationListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                // Получаем числа из представления
                double firstNum = view.getFirstNumber();
                double secondNum = view.getSecondNumber();
                double result = 0; // Переменная для хранения результата

                // Выполняем соответствующую операцию, основываясь на кнопке
                switch (e.getActionCommand()) {
                    case "+":
                        result = model.add(firstNum, secondNum);
                        break;
                    case "-":
                        result = model.subtract(firstNum, secondNum);
                        break;
                    case "*":
                        result = model.multiply(firstNum, secondNum);
                        break;
                    case "/":
                        result = model.divide(firstNum, secondNum);
                        break;
                }
                view.setResult(String.valueOf(result)); // Отображаем результат

            } catch (ArithmeticException ex) {
                view.setResult("Ошибка: деление на ноль"); // Сообщение об ошибке деления на ноль
            } catch (NumberFormatException ex) {
                view.setResult("Ошибка: некорректный ввод"); // Сообщение об ошибке некорректного ввода
            }
        }
    }
}

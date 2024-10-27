import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {
    // Поля ввода для первого и второго чисел, а также для результата
    private final JTextField firstNumberField = new JTextField(10);
    private final JTextField secondNumberField = new JTextField(10);
    private final JTextField resultField = new JTextField(15);

    // Кнопки для операций
    private final JButton addButton = new JButton("+");
    private final JButton subtractButton = new JButton("-");
    private final JButton multiplyButton = new JButton("*");
    private final JButton divideButton = new JButton("/");

    // Конструктор для настройки интерфейса
    public CalculatorView() {
        setTitle("Калькулятор"); // Заголовок окна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Завершение программы при закрытии окна
        setSize(300, 200); // Размер окна
        setLayout(new GridLayout(4, 2)); // Макет сетки с 4 строками и 2 столбцами

        // Добавляем метки и поля для чисел и результата
        add(new JLabel("Число 1:"));
        add(firstNumberField);
        add(new JLabel("Число 2:"));
        add(secondNumberField);
        add(new JLabel("Результат:"));

        resultField.setEditable(false); // Поле для результата только для чтения
        add(resultField);

        // Панель для кнопок операций
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(divideButton);
        add(buttonPanel);

        setVisible(true); // Отображаем окно
    }

    // Метод для получения первого числа из поля ввода
    public double getFirstNumber() throws NumberFormatException {
        return Double.parseDouble(firstNumberField.getText());
    }

    // Метод для получения второго числа из поля ввода
    public double getSecondNumber() throws NumberFormatException {
        return Double.parseDouble(secondNumberField.getText());
    }

    // Метод для установки результата в поле вывода
    public void setResult(String result) {
        resultField.setText(result);
    }

    // Метод для обработки событий кнопок операций
    public void addOperationListener(ActionListener listener) {
        addButton.addActionListener(listener);
        subtractButton.addActionListener(listener);
        multiplyButton.addActionListener(listener);
        divideButton.addActionListener(listener);
    }
}

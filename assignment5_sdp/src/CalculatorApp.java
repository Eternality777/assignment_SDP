public class CalculatorApp {
    public static void main(String[] args) {
        // Создаём экземпляры модели, представления и контроллера
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(model, view);

        // Выводим окно калькулятора
        view.setVisible(true);
    }
}

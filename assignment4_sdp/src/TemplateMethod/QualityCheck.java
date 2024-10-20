package TemplateMethod;

// Абстрактный класс проверки качества продукта
public abstract class QualityCheck {
    // Шаблонный метод, определяющий процесс проверки
    public final void check() {
        checkAppearance();
        checkSpecificCharacteristics();
        generateReport();
    }

    // Проверка внешнего вида (одинакова для всех)
    private void checkAppearance() {
        System.out.println("Проверка внешнего вида продукта...");
    }

    // Специфическая проверка характеристик (разная для каждого продукта)
    protected abstract void checkSpecificCharacteristics();

    // Заключительный отчёт (одинаково для всех)
    private void generateReport() {
        System.out.println("Генерация отчёта...");
    }
}

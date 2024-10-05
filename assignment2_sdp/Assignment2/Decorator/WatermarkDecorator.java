package Assignment2.Decorator;

import Assignment2.Document;

// Декоратор для добавления водяного знака к документу
public class WatermarkDecorator extends DocumentDecorator {
    
    // Конструктор, принимающий декорируемый документ
    public WatermarkDecorator(Document decoratedDocument) {
        super(decoratedDocument);
    }

    // Переопределение метода display для отображения документа с водяным знаком
    @Override
    public void display() {
        decoratedDocument.display(); 
        addWatermark(); 
    }

    // Метод для добавления водяного знака
    private void addWatermark() {
        System.out.println("Добавление водяного знака к документу."); 
    }

    // Метод getContent не реализован, вызывает исключение
    @Override
    public String getContent() {
        throw new UnsupportedOperationException("Метод 'getContent' не реализован"); 
    }
}

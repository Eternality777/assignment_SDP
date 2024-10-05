package Assignment2.Decorator;

import Assignment2.Document;

// Абстрактный декоратор для добавления функциональности документам
public abstract class DocumentDecorator implements Document {
    protected Document decoratedDocument;

    // Конструктор, принимающий документ для декорирования
    public DocumentDecorator(Document decoratedDocument) {
        this.decoratedDocument = decoratedDocument;
    }

    // Метод для отображения декорируемого документа
    @Override
    public void display() {
        decoratedDocument.display(); 
    }
}

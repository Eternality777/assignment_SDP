package Assignment2.Proxy;

import Assignment2.Document;
import Assignment2.RealDocument;

// Прокси-класс для управления доступом к реальному документу
public class ProxyDocument implements Document {
    private RealDocument realDocument;
    private String title; 
    public ProxyDocument(String title) {
        this.title = title;
    }

    // Метод для отображения документа
    @Override
    public void display() {
        if (realDocument == null) {
            realDocument = new RealDocument(title); 
        }
        realDocument.display(); 
    }

    // Метод для получения содержимого документа (не реализован)
    @Override
    public String getContent() {
        throw new UnsupportedOperationException("Метод 'getContent' не реализован");
    }
}

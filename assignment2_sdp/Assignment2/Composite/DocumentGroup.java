package Assignment2.Composite;

import Assignment2.Document;

import java.util.ArrayList;
import java.util.List;

// Класс, представляющий группу документов
public class DocumentGroup implements Document {
    private List<Document> documents = new ArrayList<>();

    // Метод для добавления документа в группу
    public void addDocument(Document document) {
        documents.add(document); 
    }

    // Метод для удаления документа из группы
    public void removeDocument(Document document) {
        documents.remove(document);
    }

    // Метод для отображения всех документов в группе
    @Override
    public void display() {
        for (Document document : documents) {
            document.display(); 
        }
    }

    // Метод для получения содержимого документа (не реализован)
    @Override
    public String getContent() {
        throw new UnsupportedOperationException("Метод 'getContent' не реализован"); 
    }
}

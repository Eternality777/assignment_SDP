package Assignment2.Flyweight;

import Assignment2.Document;
import Assignment2.RealDocument;

import java.util.HashMap;
import java.util.Map;

// Фабрика для создания и управления документами
public class DocumentFactory {
    private static final Map<String, Document> documentMap = new HashMap<>();

    // Метод для получения документа по заголовку
    public static Document getDocument(String title) {
        Document document = documentMap.get(title);
        if (document == null) { 
            document = new RealDocument(title); 
            documentMap.put(title, document); 
        }
        return document; 
    }
}

import Assignment2.Facade.DocumentFacade;
import Assignment2.Composite.DocumentGroup;
import Assignment2.Flyweight.DocumentFactory;
import Assignment2.Adapter.PDFDocumentAdapter;
import Assignment2.Document;
import Assignment2.Bridge.RenderEngine;
import Assignment2.Bridge.SimpleRenderEngine;
import Assignment2.Bridge.BasicDocumentRenderer;
import Assignment2.Bridge.HighlightRenderEngine;

public class Main {
    public static void main(String[] args) {
        // Создаем фасад для работы с документами
        DocumentFacade facade = new DocumentFacade();

        // 1. Использование Proxy для ленивой загрузки
        System.out.println("1. Ленивая загрузка документов:");
        facade.displayDocument("Отчет"); // Вызываем метод для отображения документа с ленивой загрузкой

        // 2. Использование декоратора для добавления водяного знака
        System.out.println("\n2. Добавление водяного знака:");
        facade.displayDocumentWithWatermark("Отчет"); // Вызываем метод для отображения документа с водяным знаком

        // 3. Использование Flyweight для повторного использования документа
        System.out.println("\n3. Повторное использование документа:");
        facade.displayDocument("Отчет"); // Повторно отображаем тот же документ

        // 4. Использование Composite для работы с группой документов
        System.out.println("\n4. Работа с группами документов:");
        DocumentGroup group = new DocumentGroup(); // Создаем группу документов
        group.addDocument(DocumentFactory.getDocument("Отчет")); // Добавляем отчет в группу
        group.addDocument(DocumentFactory.getDocument("Презентация")); // Добавляем презентацию в группу
        group.display(); // Отображаем все документы в группе

        // 5. Использование Adapter для работы с PDF
        System.out.println("\n5. Работа с PDF документами через Adapter:");
        Document pdfDocument = new PDFDocumentAdapter("document.pdf"); // Создаем адаптер для PDF-документа
        pdfDocument.display(); // Отображаем PDF-документ

        // 6. Использование Bridge для рендеринга
        System.out.println("\n6. Рендеринг документа через движок:");
        RenderEngine simpleEngine = new SimpleRenderEngine(); // Создаем простой движок рендеринга
        BasicDocumentRenderer basicRenderer = new BasicDocumentRenderer(simpleEngine); // Создаем рендерер на основе простого движка
        basicRenderer.renderContent("Содержимое отчета"); // Рендерим содержимое документа с помощью нового рендерера

        RenderEngine highlightEngine = new HighlightRenderEngine(); // Создаем движок с выделением
        facade.renderDocument("Отчет", highlightEngine); // Рендерим документ с выделением
    }
}

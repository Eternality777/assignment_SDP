package Assignment2.Adapter;

import Assignment2.Document;

// Адаптер для работы с PDF-документами
public class PDFDocumentAdapter implements Document {
    private PDFDocument pdfDocument; 

    // Конструктор адаптера, принимающий имя файла PDF
    public PDFDocumentAdapter(String fileName) {
        this.pdfDocument = new PDFDocument(fileName); 
    }

    @Override
    // Метод для отображения PDF-документа
    public void display() {
        pdfDocument.openPDF(); 
        pdfDocument.showPDF(); 
    }

    @Override
    // Метод для получения содержимого документа (не реализован)
    public String getContent() {
        throw new UnsupportedOperationException("Метод 'getContent' не реализован");
    }
}

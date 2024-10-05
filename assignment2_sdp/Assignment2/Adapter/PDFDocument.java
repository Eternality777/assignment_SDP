package Assignment2.Adapter;

// Представляет сторонний формат PDF документа
public class PDFDocument {
    private String fileName;

    public PDFDocument(String fileName) {
        this.fileName = fileName;
    }

    public void openPDF() {
        System.out.println("Открытие ПДФ файла: " + fileName);
    }

    public void showPDF() {
        System.out.println("Отображение содержимого ПДФ файла: " + fileName);
    }
}

package Assignment2;

// Реальный документ, который требует загрузки
public class RealDocument implements Document {
    private String title;
    private String content; 

    public RealDocument(String title) {
        this.title = title;
        loadFromDisk();
    }

    private void loadFromDisk() {
        this.content = "Содержимое документа: " + title; 
        System.out.println("Документ загружен: " + title);
    }

    @Override
    public void display() {
        System.out.println("Отображение документа: " + title);
    }

    @Override
    public String getContent() {
        return content; 
    }
}

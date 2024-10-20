package Visitor;

// Класс TextFile, представляющий текстовый файл
public class TextFile implements File {
    private String name; // Имя текстового файла

    // Конструктор для создания текстового файла с указанным именем
    public TextFile(String name) {
        this.name = name;
    }

    // Реализация метода accept для обработки текстового файла посетителем
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // Передаём текущий объект в метод visit посетителя
    }

    // Метод для получения имени файла
    public String getName() {
        return name;
    }
}

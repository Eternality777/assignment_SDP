package Visitor;

// Класс ExecutableFile, представляющий исполняемый файл
public class ExecutableFile implements File {
    private String name; // Имя исполняемого файла

    // Конструктор для создания исполняемого файла с указанным именем
    public ExecutableFile(String name) {
        this.name = name;
    }

    // Реализация метода accept для обработки исполняемого файла посетителем
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // Передаём текущий объект в метод visit посетителя
    }

    // Метод для получения имени файла
    public String getName() {
        return name;
    }
}

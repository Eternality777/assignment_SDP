package Visitor;

// Интерфейс Visitor, определяет методы для взаимодействия с различными типами файлов
public interface Visitor {
    void visit(TextFile textFile); // Метод для обработки текстового файла
    void visit(ExecutableFile executableFile); // Метод для обработки исполняемого файла
}

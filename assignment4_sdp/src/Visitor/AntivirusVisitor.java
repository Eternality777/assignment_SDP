package Visitor;

// Класс AntivirusVisitor, реализующий интерфейс Visitor для проверки файлов на вирусы
public class AntivirusVisitor implements Visitor {
    // Обработка текстового файла
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Проверка текстового файла " + textFile.getName() + " на наличие запрещённых слов.");
    }

    // Обработка исполняемого файла
    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Проверка исполняемого файла " + executableFile.getName() + " на наличие вредоносного кода.");
    }
}

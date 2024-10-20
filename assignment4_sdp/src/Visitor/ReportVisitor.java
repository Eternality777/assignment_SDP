package Visitor;

// Класс ReportVisitor, реализующий интерфейс Visitor для генерации отчётов о проверках
public class ReportVisitor implements Visitor {
    // Генерация отчёта для текстового файла
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Генерация отчёта для текстового файла " + textFile.getName());
    }

    // Генерация отчёта для исполняемого файла
    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Генерация отчёта для исполняемого файла " + executableFile.getName());
    }
}

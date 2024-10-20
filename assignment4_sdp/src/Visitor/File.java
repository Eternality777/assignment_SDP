package Visitor;

// Интерфейс File, определяет метод для принятия посетителя
public interface File {
    void accept(Visitor visitor); // Метод для принятия посетителя
}

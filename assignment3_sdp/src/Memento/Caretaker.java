package Memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<TextMemento> mementos = new ArrayList<>();

    public void addMemento(TextMemento memento) {
        mementos.add(memento);
    }

    public TextMemento getMemento(int index) {
        return mementos.get(index);
    }
}

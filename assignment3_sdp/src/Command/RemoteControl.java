package Command;

public class RemoteControl {
    private Command[] commands;

    public RemoteControl() {
        commands = new Command[7]; // 7 кнопок
    }

    public void setCommand(int slot, Command command) {
        commands[slot] = command;
    }

    public void pressButton(int slot) {
        if (commands[slot] != null) {
            commands[slot].execute();
        } else {
            System.out.println("Для этой кнопки не назначена команда.");
        }
    }
}

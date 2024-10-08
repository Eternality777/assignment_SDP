package Command;

public class VolumeDownCommand implements Command {
    private Television tv;

    public VolumeDownCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.volumeDown();
    }
}

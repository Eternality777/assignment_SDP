package State;

// Состояние "Остановлено"
public class StoppedState implements PlayerState {
    private Player player;

    public StoppedState(Player player) {
        this.player = player;
    }

    @Override
    public void play() {
        System.out.println("Начало воспроизведения с начала.");
        player.setState(new PlayingState(player));
    }

    @Override
    public void pause() {
        System.out.println("Нельзя поставить на паузу, плеер остановлен.");
    }

    @Override
    public void stop() {
        System.out.println("Уже остановлено.");
    }
}

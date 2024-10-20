package State;

// Состояние "Пауза"
public class PausedState implements PlayerState {
    private Player player;

    public PausedState(Player player) {
        this.player = player;
    }

    @Override
    public void play() {
        System.out.println("Возобновление воспроизведения.");
        player.setState(new PlayingState(player));
    }

    @Override
    public void pause() {
        System.out.println("Уже на паузе.");
    }

    @Override
    public void stop() {
        System.out.println("Остановка воспроизведения.");
        player.setState(new StoppedState(player));
    }
}

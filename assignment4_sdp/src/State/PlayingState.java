package State;

// Состояние "Играет"
public class PlayingState implements PlayerState {
    private Player player;

    public PlayingState(Player player) {
        this.player = player;
    }

    @Override
    public void play() {
        System.out.println("Уже воспроизводится.");
    }

    @Override
    public void pause() {
        System.out.println("Пауза.");
        player.setState(new PausedState(player));
    }

    @Override
    public void stop() {
        System.out.println("Остановка воспроизведения.");
        player.setState(new StoppedState(player));
    }
}

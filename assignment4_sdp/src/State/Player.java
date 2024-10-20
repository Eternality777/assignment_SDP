package State;

// Класс плеера, который изменяет состояния
public class Player {
    private PlayerState state;

    public Player() {
        this.state = new StoppedState(this);
    }

    public void setState(PlayerState state) {
        this.state = state;
    }

    public void play() {
        state.play();
    }

    public void pause() {
        state.pause();
    }

    public void stop() {
        state.stop();
    }
}

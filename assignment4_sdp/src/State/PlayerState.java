package State;

// Интерфейс для состояний плеера
public interface PlayerState {
    void play();
    void pause();
    void stop();
}

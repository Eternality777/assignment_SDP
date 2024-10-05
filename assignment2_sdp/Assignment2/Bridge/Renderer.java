package Assignment2.Bridge;

// Абстрактный класс для рендереров документов
public abstract class Renderer {
    protected RenderEngine renderEngine; // Движок рендеринга

    public Renderer(RenderEngine renderEngine) {
        this.renderEngine = renderEngine; // Инициализация движка рендеринга
    }

    public abstract void renderContent(String data); // Абстрактный метод для рендеринга содержимого
}

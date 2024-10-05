package Assignment2.Bridge;

// Реализация рендеринга документов
public class BasicDocumentRenderer extends Renderer {
    public BasicDocumentRenderer(RenderEngine renderEngine) {
        super(renderEngine); 
    }

    @Override
    public void renderContent(String data) {
        renderEngine.render(data); // Рендеринг содержимого с помощью назначенного движка
    }
}

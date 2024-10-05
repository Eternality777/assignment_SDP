package Assignment2.Bridge;

// Реализация рендеринга документа с выделением текста
public class HighlightRenderEngine implements RenderEngine {
    @Override
    public void render(String content) {
        System.out.println("Рендеринг документа с выделенным текстом: " + content);
    }
}

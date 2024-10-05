package Assignment2.Bridge;

// Реализация простого рендеринга документа
public class SimpleRenderEngine implements RenderEngine {
    @Override
    public void render(String content) {
        System.out.println("Рендеринг документа в простом режиме: " + content); 
    }
}

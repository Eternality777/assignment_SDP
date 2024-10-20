package TemplateMethod;

// Проверка качества для продуктов питания
public class FoodQualityCheck extends QualityCheck {
    @Override
    protected void checkSpecificCharacteristics() {
        System.out.println("Проверка срока годности и состава продукта...");
    }
}

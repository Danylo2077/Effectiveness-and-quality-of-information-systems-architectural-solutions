// Сторінка товару
public class ProductPage extends Page {
    protected Product product;

    public ProductPage(Renderer renderer, Product product) { super(renderer); }
    @Override public String view() { return ""; }
}
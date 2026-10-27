// Базова сторінка
public abstract class Page {
    protected Renderer renderer; // Міст з рендером

    public Page(Renderer renderer) {}
    public abstract String view();
}
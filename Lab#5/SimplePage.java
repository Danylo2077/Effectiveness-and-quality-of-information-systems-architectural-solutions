// Проста сторінка
public class SimplePage extends Page {
    protected String title;
    protected String content;

    public SimplePage(Renderer renderer, String title, String content) { super(renderer); }
    @Override public String view() { return ""; }
}
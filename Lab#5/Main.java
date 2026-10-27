// Клієнтський код
public class Main {
    public static void main(String[] args) {
        Product phone = new Product("1", "Телефон", "Опис", "img.jpg");

        // Рендер сторінки в HTML
        Page simpleHtml = new SimplePage(new HTMLRenderer(), "Головна", "Текст");
        simpleHtml.view();

        // Рендер сторінки товару в JSON
        Page productJson = new ProductPage(new JsonRenderer(), phone);
        productJson.view();

        // Рендер сторінки товару в XML
        Page productXml = new ProductPage(new XmlRenderer(), phone);
        productXml.view();

    }
}
// Клієнтський код
public class Main {
    public static void main(String[] args) {
        // Створення замісника, який обгортає оригінальний завантажувач
        Downloader downloader = new CachingDownloaderProxy(new SimpleDownloader());

        String fileUrl = "https://example.com/data.pdf";

        // Перший виклик файл завантажується з мережі та зберігається в кеш
        downloader.download(fileUrl);

        // Другий виклик файл миттєво віддається з кешу
        downloader.download(fileUrl);

    }
}
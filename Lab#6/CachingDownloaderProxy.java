import java.util.Map;

// Клас-замісник з механізмом кешування
public class CachingDownloaderProxy implements Downloader {
    private Downloader simpleDownloader;
    private Map<String, byte[]> cache;

    public CachingDownloaderProxy(Downloader simpleDownloader) {}

    @Override
    public byte[] download(String url) { 
        return new byte[0]; 
    }
}
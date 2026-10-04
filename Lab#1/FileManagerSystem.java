public class FileManagerSystem {
    private static FileManagerSystem instance;

    //  Приватний конструктор 
    private FileManagerSystem() {}

    // Метод отримання єдиного екземпляра 
    public static synchronized FileManagerSystem getInstance() {
        if (instance == null) {
            instance = new FileManagerSystem();
        }
        return instance;
    }

    
    // Встановлює сховище для користувача
    public void setUserStorage(User user, StorageType storageType) {}
    
    // Повертає поточне сховище користувача
    public FileStorage getUserStorage(User user) { return null; }
    
    // Завантажує файл в обране сховище користувача
    public void uploadUserFile(User user, String fileName, byte[] fileData) {}
}
public class Main {
    public static void main(String[] args) {
        // Отримуємо єдиний екземпляр системи
        FileManagerSystem system = FileManagerSystem.getInstance();
        
        // Створюємо порожнього користувача
        User user = new User();
        
        // Викликаємо методи-заглушки
        system.setUserStorage(user, StorageType.AMAZON_S3);
        system.uploadUserFile(user, "test.txt", new byte[0]);
        
       
        System.out.println("Програму запущено. Патерн Одинак створено");
    }
}
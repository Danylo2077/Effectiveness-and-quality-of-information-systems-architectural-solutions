public abstract class SocialNetworkCreator {
    
    // Фабричний метод, який створює об'єкт соцмережі
    public abstract SocialNetwork createSocialNetwork();

    // Бізнес-логіка, яка використовує створений продукт
    public void post(String credential1, String credential2, String message) {
        SocialNetwork network = createSocialNetwork();
        network.connect(credential1, credential2);
        network.publishMessage(message);
    }
}
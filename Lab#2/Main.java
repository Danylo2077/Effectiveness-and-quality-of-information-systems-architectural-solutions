public class Main {
    public static void main(String[] args) {
        System.out.println("Публікація у Facebook");
        // Використовуємо фабрику для Facebook 
        SocialNetworkCreator facebookCreator = new FacebookCreator();
        facebookCreator.post("my_login", "my_password", "Привіт, Facebook");

        System.out.println("Публікація в LinkedIn");
        // Використовуємо фабрику для LinkedIn
        SocialNetworkCreator linkedInCreator = new LinkedInCreator();
        linkedInCreator.post("user@example.com", "secure_password", "Привіт, LinkedIn");
        
    }
}
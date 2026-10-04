public class LinkedInNetwork implements SocialNetwork {
    @Override
    public boolean connect(String email, String password) {
        // Логіка підключення для LinkedIn
        return true;
    }

    @Override
    public void publishMessage(String message) {}
}
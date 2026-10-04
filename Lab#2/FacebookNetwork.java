public class FacebookNetwork implements SocialNetwork {
    @Override
    public boolean connect(String login, String password) {
        // Логіка підключення для Facebook
        return true;
    }

    @Override
    public void publishMessage(String message) {}
}
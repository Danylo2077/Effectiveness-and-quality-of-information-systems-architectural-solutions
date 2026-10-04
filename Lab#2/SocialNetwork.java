public interface SocialNetwork {
    boolean connect(String credential1, String credential2);
    void publishMessage(String message);
}
public class FacebookCreator extends SocialNetworkCreator {
    @Override
    public SocialNetwork createSocialNetwork() {
        return new FacebookNetwork();
    }
}
public class LinkedInCreator extends SocialNetworkCreator {
    @Override
    public SocialNetwork createSocialNetwork() {
        return new LinkedInNetwork();
    }
}
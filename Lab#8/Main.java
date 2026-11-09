public class Main {
    public static void main(String[] args) {
        BaseUpdater productUpdater = new ProductUpdater();
        productUpdater.updateEntity(new Object());

        BaseUpdater userUpdater = new UserUpdater();
        userUpdater.updateEntity(new Object());

        BaseUpdater orderUpdater = new OrderUpdater();
        orderUpdater.updateEntity(new Object());

    }
}
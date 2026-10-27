// Клієнтський код
public class Main {
    public static void main(String[] args) {
        DeliveryContext context = new DeliveryContext();
        double orderTotal = 850.50;

        // Користувач обирає самовивіз
        context.setDeliveryStrategy(new SelfPickupStrategy());
        context.calculateFinalCost(orderTotal);

        // Користувач змінює рішення на власну доставку закладу
        context.setDeliveryStrategy(new InternalDeliveryStrategy());
        context.calculateFinalCost(orderTotal);

        // Користувач обирає доставку кур'єром
        context.setDeliveryStrategy(new ExternalDeliveryStrategy());
        context.calculateFinalCost(orderTotal);

    }
}
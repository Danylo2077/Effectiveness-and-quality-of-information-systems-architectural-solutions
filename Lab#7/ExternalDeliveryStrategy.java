// Стратегія 3 Доставка зовнішньою службою
public class ExternalDeliveryStrategy implements DeliveryCostStrategy {
    @Override
    public double calculateCost(double orderAmount) {
        return 0.0;
    }
}
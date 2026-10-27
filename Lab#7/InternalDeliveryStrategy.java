// Стратегія 2 Доставка власною службою
public class InternalDeliveryStrategy implements DeliveryCostStrategy {
    @Override
    public double calculateCost(double orderAmount) {
        return 0.0;
    }
}
// Стратегія 1 Самовивіз
public class SelfPickupStrategy implements DeliveryCostStrategy {
    @Override
    public double calculateCost(double orderAmount) {
        return 0.0;
    }
}
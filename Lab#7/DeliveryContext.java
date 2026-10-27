// Контекст який використовує обрану стратегію
public class DeliveryContext {
    private DeliveryCostStrategy strategy;

    // Метод для динамічної зміни стратегії
    public void setDeliveryStrategy(DeliveryCostStrategy strategy) {}

    // Метод для делегування розрахунку обраній стратегії
    public double calculateFinalCost(double orderAmount) {
        return 0.0;
    }
}
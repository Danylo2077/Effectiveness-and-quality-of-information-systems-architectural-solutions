// Інтерфейс посередника для координації компонентів
public interface OrderFormMediator {
    void notify(FormComponent sender, String event);
}
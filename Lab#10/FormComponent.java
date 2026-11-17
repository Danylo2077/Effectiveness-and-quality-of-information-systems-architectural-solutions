// Абстрактний клас для всіх UI елементів форми
public abstract class FormComponent {
    protected OrderFormMediator mediator;

    public FormComponent(OrderFormMediator mediator) {}
    public void setEnabled(boolean enabled) {}
    public void setVisible(boolean visible) {}
}
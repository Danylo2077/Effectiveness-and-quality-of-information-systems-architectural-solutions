import java.time.LocalDate;

public class DatePicker extends FormComponent {
    public DatePicker(OrderFormMediator mediator) { super(mediator); }
    public void selectDate(LocalDate date) {}
    public LocalDate getSelectedDate() { return null; }
}
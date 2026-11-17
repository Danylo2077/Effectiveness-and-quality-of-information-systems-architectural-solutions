import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FlowerOrderDialog mediator = new FlowerOrderDialog();

        DatePicker datePicker = new DatePicker(mediator);
        TimeSlotSelector timeSlotSelector = new TimeSlotSelector(mediator);
        OtherRecipientCheckbox otherRecipient = new OtherRecipientCheckbox(mediator);
        TextInput nameInput = new TextInput(mediator);
        TextInput phoneInput = new TextInput(mediator);
        SelfPickupCheckbox selfPickup = new SelfPickupCheckbox(mediator);

        mediator.setComponents(datePicker, timeSlotSelector, otherRecipient, nameInput, phoneInput, selfPickup);

        datePicker.selectDate(LocalDate.now().plusDays(1));
        otherRecipient.setChecked(true);
        selfPickup.setChecked(true);

    }
}
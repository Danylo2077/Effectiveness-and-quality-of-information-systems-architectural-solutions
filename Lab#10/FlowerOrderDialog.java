// посередник
public class FlowerOrderDialog implements OrderFormMediator {
    private DatePicker datePicker;
    private TimeSlotSelector timeSlotSelector;
    private OtherRecipientCheckbox otherRecipientCheckbox;
    private TextInput recipientNameInput;
    private TextInput recipientPhoneInput;
    private SelfPickupCheckbox selfPickupCheckbox;

    public void setComponents(
        DatePicker datePicker,
        TimeSlotSelector timeSlotSelector,
        OtherRecipientCheckbox otherRecipientCheckbox,
        TextInput recipientNameInput,
        TextInput recipientPhoneInput,
        SelfPickupCheckbox selfPickupCheckbox
    ) {}

    @Override
    public void notify(FormComponent sender, String event) {
       
    }
}
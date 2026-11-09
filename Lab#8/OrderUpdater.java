// Реалізація для Замовлення
public class OrderUpdater extends BaseUpdater {

    @Override
    protected Object fetchEntity(Object inputData) { return new Order(); }

    @Override
    protected boolean validateData(Object entity, Object inputData) { return true; }

    @Override
    protected void saveEntity(Object entity) {}

    @Override
    protected Object buildResponse(Object entity) { 
        // Повернення відповіді з JSON-поданням замовлення
        return null; 
    }
}
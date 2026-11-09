// Реалізація для Користувача
public class UserUpdater extends BaseUpdater {

    @Override
    protected Object fetchEntity(Object inputData) { return new User(); }

    @Override
    protected boolean validateData(Object entity, Object inputData) {
        // Логіка заборони зміни email попри загальну валідацію
        return true; 
    }

    @Override
    protected void saveEntity(Object entity) {}

    @Override
    protected Object buildResponse(Object entity) { return null; }
}
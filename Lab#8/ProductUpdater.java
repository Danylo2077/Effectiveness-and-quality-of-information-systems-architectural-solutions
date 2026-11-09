// Реалізація для Товару
public class ProductUpdater extends BaseUpdater {

    @Override
    protected Object fetchEntity(Object inputData) { return new Product(); }

    @Override
    protected boolean validateData(Object entity, Object inputData) {
        // У разі невдалої валідації відправляється сповіщення адміністратору в месенджер
        return true; 
    }

    @Override
    protected void saveEntity(Object entity) {}

    @Override
    protected Object buildResponse(Object entity) { return null; }
}
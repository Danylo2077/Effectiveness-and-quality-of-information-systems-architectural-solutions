// Абстрактний клас, що визначає скелет алгоритму
public abstract class BaseUpdater {

    // Шаблонний метод
    public final Object updateEntity(Object inputData) {
        Object entity = fetchEntity(inputData);
        validateData(entity, inputData);
        
        beforeSaveHook(entity); // Хук перед збереженням
        
        saveEntity(entity);
        
        afterSaveHook(entity);  // Хук після збереження
        
        return buildResponse(entity);
    }

    // Основні етапи алгоритму
    protected abstract Object fetchEntity(Object inputData);
    protected abstract boolean validateData(Object entity, Object inputData);
    protected abstract void saveEntity(Object entity);
    protected abstract Object buildResponse(Object entity);

    // Хуки
    protected void beforeSaveHook(Object entity) {}
    protected void afterSaveHook(Object entity) {}
}
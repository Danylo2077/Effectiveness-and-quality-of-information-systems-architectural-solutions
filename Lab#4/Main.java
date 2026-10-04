public class Main {
    public static void main(String[] args) {
        // Відправка Email
        Notification email = new EmailNotification("admin@example.com");
        email.send("Системна помилка", "Сервер не відповідає.");

        // Відправка у Slack через Адаптер
        Notification slack = new SlackNotificationAdapter("mySlackLogin", "api-key-12345", "dev-chat-id");
        slack.send("Оновлення статусу", "Білдинг пройшов успішно.");

        // Відправка SMS через Адаптер
        Notification sms = new SmsNotificationAdapter("+380991234567", "SystemAlert");
        sms.send("Критичний збій", "Перевірте базу даних.");
        
        System.out.println("Програму успішно запущено. Патерн Адаптер працює!");
    }
}
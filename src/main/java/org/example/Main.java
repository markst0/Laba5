package org.example;

/**
 * Главный класс для запуска приложения.
 * Демонстрирует использование {@link Injector} для автоматического внедрения зависимостей
 */
public class Main {
    public static void main(String[] args) {
        try {
            Injector injector = new Injector("src/main/resources/config.properties");
            OrderService orderService = injector.inject(new OrderService());
            orderService.placeOrder(500.0, "Payment successful for your order!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

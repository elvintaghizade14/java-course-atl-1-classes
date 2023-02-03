package az.atlacademy.module01.lesson12.enumuration;

public class Order {

    private String trackId;
    private OrderStatus status;

    enum OrderStatus {
        ACCEPTED, PREPARING, COMPLETED, REJECTED
    }

}

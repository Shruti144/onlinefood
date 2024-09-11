package delivery;


public class Order {
	private String orderId;
    private Customer customer;
    private Map<FoodItem, Integer> items;
    private String status;
    private DeliveryPerson deliveryPerson;
    private String deliveryAddress;

    public Order(Customer customer, Map<FoodItem, Integer> items) {
        this.orderId = UUID.randomUUID().toString();
        this.customer = customer;
        this.items = items;
        this.status = "Pending";
    }

    public void setDeliveryPerson(DeliveryPerson deliveryPerson) {
        this.deliveryPerson = deliveryPerson;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Getters and additional methods
}

}

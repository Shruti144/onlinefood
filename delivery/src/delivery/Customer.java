package delivery;



public class Customer {
	private Cart cart;
    private List<Order> orders;

    public Customer(String userId, String username, String contactNo) {
        super(userId, username, contactNo);
        this.cart = new Cart();
        this.orders = new ArrayList<>();
    }

    public void addToCart(FoodItem item, int quantity) {
        cart.addItem(item, quantity);
    }

    public void placeOrder() {
        Order order = new Order(this, cart.getItems());
        orders.add(order);
        cart.clearCart();
    }

    // Getters and additional methods
}



}

package delivery;


public class DeliveryPerson {
	 private String deliveryPersonId;
	    private String name;
	    private String contactNo;

	    public DeliveryPerson(String deliveryPersonId, String name, String contactNo) {
	        this.deliveryPersonId = deliveryPersonId;
	        this.name = name;
	        this.contactNo = contactNo;
	    }

	    public void deliverOrder(Order order) {
	        order.setStatus("Delivered");
	    }
	}

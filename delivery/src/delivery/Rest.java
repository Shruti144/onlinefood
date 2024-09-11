package delivery;



public class Rest {
	private String id;
    private String name;
    private List<FoodItem> menu;

    public Restaurant(String id, String name) {
        this.id = id;
        this.name = name;
        this.menu = new ArrayList<>();
    }

    public void addFoodItem(FoodItem item) {
        menu.add(item);
    }

    public List<FoodItem> getMenu() {
        return menu;
    }
}




package delivery;

import miniproject.FoodItem;
import miniproject.HashMap;
import miniproject.Map;

public class Cart {private Map<FoodItem, Integer> items;

public Cart() {
    this.items = new HashMap<>();
}

public void addItem(FoodItem item, int quantity) {
    items.put(item, items.getOrDefault(item, 0) + quantity);
}

public Map<FoodItem, Integer> getItems() {
    return items;
}

public void clearCart() {
    items.clear();
}
}

}

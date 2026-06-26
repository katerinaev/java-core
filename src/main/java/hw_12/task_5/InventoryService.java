package hw_12.task_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class InventoryService {
    private final Map<String, List<Product>> inventory = new ConcurrentHashMap<>();

    private boolean isInventoryOpen = true;

    public boolean isInventoryOpen() {
        return isInventoryOpen;
    }

    public void setInventoryOpen(boolean inventoryOpen) {
        this.isInventoryOpen = inventoryOpen;
    }

    public synchronized void addProduct(Product product) {
        if (!isInventoryOpen) return;

        inventory.computeIfAbsent(product.getCategory(),
                k -> new ArrayList<>()).add(product);
    }

    public List<Product> getProductsByCategory(String category) {
        return new ArrayList<>(inventory.getOrDefault(category, List.of()));
    }

    public synchronized Product getProductByCategory(String category) {
        List<Product> products = inventory.get(category);
        if (products == null || products.isEmpty()) {
            throw new OutOfStockException("There are no products in \"" + category + "\" category");
        }
        return products.removeFirst();
    }

    public List<Product> filteredByPrice(double maxPrice) {
        return inventory.values()
                .stream()
                .flatMap(List::stream)
                .filter(p -> p.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }
}

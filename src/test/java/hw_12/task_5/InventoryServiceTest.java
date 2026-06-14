package hw_12.task_5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class InventoryServiceTest {
    private InventoryService service;

    private Product iphone;
    private Product tv;
    private Product bread;

    @BeforeEach
    void setup() {
        service = new InventoryService();
        iphone = new Product("IPhone", 1250.5, "Electronics");
        tv = new Product("TV", 770, "Electronics");
        bread = new Product("Bread", 2.5, "Food");
    }

    @Test
    public void testAddProduct() {
        service.addProduct(iphone);
        List<Product> electronics = service.getProductsByCategory("Electronics");

        assertEquals(1, electronics.size());
        assertTrue(electronics.contains(iphone));
    }

    @Test
    public void teatNotAddProductIfInventoryClosed() {
        service.setInventoryOpen(false);
        service.addProduct(iphone);
        List<Product> electronics = service.getProductsByCategory("Electronics");

        assertTrue(electronics.isEmpty());
        assertThrows(OutOfStockException.class, () -> service.getProductByCategory("Electronics"));
    }

    @Test
    public void testGetProductByCategory() {
        service.addProduct(iphone);
        Product product = service.getProductByCategory("Electronics");

        assertEquals("IPhone", product.getName());
    }

    @Test
    public void testProductIsRemovedAfterExtraction() {
        service.addProduct(bread);
        Product product = service.getProductByCategory("Food");

        assertThrows(OutOfStockException.class, () -> service.getProductByCategory("Food"));
    }

    @Test
    public void testFilterByPrice() {
        service.addProduct(iphone);
        service.addProduct(tv);
        service.addProduct(bread);

        List<Product> filtered = service.filteredByPrice(1000);

        assertEquals(2, filtered.size());
        assertEquals("TV", filtered.get(0).getName());
        assertEquals("Bread", filtered.get(1).getName());
    }
}

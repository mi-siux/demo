package pl.srzu.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.srzu.demo.domain.InventoryService;
import pl.srzu.demo.domain.ProductService;

@Configuration
public class ServiceConfiguration {

    @Bean(name = "magazyn")
    public InventoryService inventoryService() {
        return new InventoryService();
    }

    @Bean(name = "produkt")
    public ProductService productService() {
        return new ProductService(inventoryService());
    }
}

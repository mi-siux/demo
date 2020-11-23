package pl.srzu.demo.domain;

import org.springframework.context.annotation.PropertySource;

public class InventoryService {
    private String inventoryName;

    public void setInventoryName(String inventoryName) {
        this.inventoryName = inventoryName;
    }

    @Override
    public String toString() {
        return "InventoryService{" +
                "inventoryName='" + inventoryName + '\'' +
                '}';
    }
}

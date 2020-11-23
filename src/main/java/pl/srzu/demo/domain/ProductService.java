package pl.srzu.demo.domain;

public class ProductService {

    private String productName;
    private InventoryService inventoryService;

    public ProductService(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public InventoryService getInventoryService() {
        return inventoryService;
    }

    @Override
    public String toString() {
        return "ProductService{" +
                "productName='" + productName + '\'' +
                ", inventoryService=" + inventoryService +
                '}';
    }
}

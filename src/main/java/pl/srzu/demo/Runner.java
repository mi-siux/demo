package pl.srzu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.srzu.demo.domain.Castle;
import pl.srzu.demo.domain.Knigh;
import pl.srzu.demo.domain.ProductService;

import java.util.List;


@Component
public class Runner implements CommandLineRunner {

    private List<Castle> castles;
    private ProductService productService;

    @Autowired
    public void setCastles(List<Castle> castles) {
        this.castles = castles;
    }

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Castles from runner: " +  castles);
        if(!castles.isEmpty()) {
            castles.get(0).setName("Rudno");
            castles.get(0).getKnigh().setName("Zawisza Czarny");
        }
        System.out.println(castles);

        Castle wawel = new Castle();
        wawel.setName("Wawel");
        wawel.setKnigh(new Knigh("Mikołaj Trąba"));

        castles.add(wawel);

        System.out.println("Castles from runner: " + castles);

        productService.setProductName("product_one");
        productService.getInventoryService().setInventoryName("inventory_one");
        System.out.println(productService);
    }
}

package pl.srzu.demo.domain;

import org.springframework.stereotype.Component;

@Component
public class Knigh {
    private String name;

    public Knigh() {
    }

    public Knigh(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Knigh{" +
                "name='" + name + '\'' +
                '}';
    }
}

package pl.srzu.demo.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Castle {

    private String name;

    private Knigh knigh;

    public void setName(String name) {
        this.name = name;
    }

    @Autowired
    public void setKnigh(Knigh knigh) {
        this.knigh = knigh;
    }

    public Knigh getKnigh() {
        return knigh;
    }

    @Override
    public String toString() {
        return "Castle{" +
                "name='" + name + '\'' +
                '}' +
                "zamieszkały przez: " + knigh;
    }
}
package Serialization;

import java.io.Serializable;

public class Car implements Serializable{
    
    private String name;
    private String color;


    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}

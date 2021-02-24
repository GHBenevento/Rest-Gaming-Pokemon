package unittesting.Classes.data1;

import unittesting.Classes.data2.IActions;
import unittesting.Classes.data2.Status;
import unittesting.Classes.data3.IRender;

public abstract class LifeBeing implements IRender, IActions {
    private String name;
    private Double height;
    private Double weight;
    private Gender gender;
    public Status status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = new Status();
    }
}

package unittesting.Classes.data1;

import Classes.data2.IActions;
import Classes.data2.Status;
import Classes.data3.IRender;

public abstract class LifeBeing implements IActions, IRender {
    private String name;
    private Double height;
    private Double weight;
    private Gender gender;
    private Integer level;
    private Status stats;

    public String getName() { return name; }

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

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Status getStats() {return stats; }

    public void setStats(Status stats) { this.stats = stats; }

}

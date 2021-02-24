package unittesting.classes.poke_data;

import unittesting.classes.actions.IActions;
import unittesting.classes.render.IRender;
import unittesting.classes.render.RenderType;

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

    @Override
    public String doRender(String renderType) {

        RenderType ourRender = RenderType.valueOf(renderType);

        return switch (ourRender) {
            case HTML -> "";
            case JSON -> "";
            default -> "";
        };

    }
}

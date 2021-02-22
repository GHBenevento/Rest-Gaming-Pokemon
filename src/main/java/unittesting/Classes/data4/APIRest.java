package unittesting.Classes.data4;

import unittesting.Classes.data1.PokeType;
import unittesting.Classes.data3.RenderType;

public class APIRest {

    public String doRender(String renderType) {

        RenderType ourRender = RenderType.valueOf(renderType);

        switch (ourRender) {
            case HTML:
                return "";
            case JSON:
                return "";
            default:
                return "";
        }
    }
}

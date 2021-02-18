package unittesting.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import unittesting.Classes.data1.Pokemon;
import unittesting.Classes.data2.IActions;

import java.util.LinkedList;
import java.util.List;

@RestController
public class RestPokemonController {


    @GetMapping("/rest/do/{action}")
    public Pokemon doAction(@RequestParam(value = "name", defaultValue = "Charmander") String name) {
        return "JSON";
    }
    @GetMapping("/rest/getCurrentStatus}")
    public Pokemon getStatus(@RequestParam(value = "name", defaultValue = "Charmander") String name) {
        return new Pokemon();
    }
    @GetMapping("/rest/getStats")
    public Pokemon getStats(@RequestParam(value = "name", defaultValue = "Charmander") String name) {
        return new Pokemon();
    }
    @GetMapping("/rest/render/{mode}")
    public Pokemon doRender(@RequestParam(value = "name", defaultValue = "Charmander") String name) {
        return new Pokemon();
    }
    @GetMapping("/rest/new")
    public Pokemon reset(@RequestParam(value = "name", defaultValue = "Charmander") String name) {
        return new Pokemon();
    }
    @GetMapping("/rest/getActions")
    public List<IActions> getActions(@RequestParam(value = "name", defaultValue = "Charmander") String name) {
        List iActions = new LinkedList();
        return iActions;
    }

}

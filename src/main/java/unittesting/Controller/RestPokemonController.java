package unittesting.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import unittesting.Classes.data1.Pokemon;

@RestController
public class RestPokemonController {


    @GetMapping("/getPokemon")
    public Pokemon getPokemon(@RequestParam(value = "name", defaultValue = "Charmander") String name) {
        return new Pokemon();
    }
}

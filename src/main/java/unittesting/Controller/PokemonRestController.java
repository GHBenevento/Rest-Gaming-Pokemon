package unittesting.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import unittesting.Classes.data1.Pokemon;

@RestController
@RequestMapping("/rest")
public class PokemonRestController {

    @GetMapping("/render/{mode}")
    public String doRender(@RequestParam(value = "Render", defaultValue = "HTML")String renderType) {
        return doRender(renderType);
    }

    @GetMapping("/new")
    public Pokemon newPokemon(@RequestParam(value = "Name", defaultValue = "Bulbasaur")String name,
                              @RequestParam(value = "Pokedex Number", defaultValue = "1")Integer pokeNum,
                              @RequestParam(value = "Type", defaultValue = "GRASS")String pokeType,
                              @RequestParam(value = "Gender", defaultValue = "FEMALE")String gender,
                              @RequestParam(value = "Height", defaultValue = "71")Double height,
                              @RequestParam(value = "Weight", defaultValue = "6.9")Double weight) {
        return ;
    }
}

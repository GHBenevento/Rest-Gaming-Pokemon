package unittesting.controller;

import org.springframework.web.bind.annotation.*;
import unittesting.classes.actions.Action;
import unittesting.classes.data.Status;
import unittesting.classes.poke_data.Pokemon;
import unittesting.classes.service.GameService;

import java.util.Map;

@RestController
@RequestMapping("/rest")
public class PokemonRestController {

    GameService gameService;

    public PokemonRestController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/new")
    public Pokemon newPokemon(@RequestParam(value = "Name", defaultValue = "Bulbasaur") String name,
                              @RequestParam(value = "Pokedex Number", defaultValue = "001") Integer pokeNum,
                              @RequestParam(value = "Type", defaultValue = "GRASS") String pokeType,
                              @RequestParam(value = "Gender", defaultValue = "FEMALE") String gender,
                              @RequestParam(value = "Height", defaultValue = "71") Double height,
                              @RequestParam(value = "Weight", defaultValue = "6.9") Double weight) {

        return gameService.newPokemon(name, pokeNum, pokeType, gender, height, weight);
    }

    @GetMapping("/render/{mode}")
    public String doRender(@RequestParam(value = "Render", defaultValue = "HTML") String renderType) {
        return doRender(renderType);
    }

    @GetMapping("/getCurrentStatus")
    public Status getStatus() {
        return gameService.getCurrentLifeBeing().status;
    }

}

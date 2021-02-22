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
        return new Pokemon(name, pokeNum, pokeType, gender, height, weight);
    }



  /*

  @GetMapping("/do/{action}")
  static String doAction() {
        return "JSON";
    }

    @GetMapping("/getStats")
    static List<UserAction> getStats() {
        List actionList = new LinkedList();
        UserAction userAction = new UserAction();
        actionList.add(userAction);
        return actionList;
    }


    @GetMapping("/new")
        Pokemon Poke = new Pokemon("Charmander",7, "FIRE", "MALE", 0.88, 20.5);
        return Poke;
    }

    @GetMapping("/getCurrentStatus}")
    static Status getCurrentStatus() {
        Status status = new Status();
        return status;
    }
*/
}

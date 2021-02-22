package unittesting.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class PokemonRestController {

    @GetMapping("/render/{mode}")
    static String doRender(@RequestParam(value = "Render", defaultValue = "HTML")String renderType) {
        return doRender(renderType);
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

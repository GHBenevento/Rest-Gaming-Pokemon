package unittesting;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import unittesting.classes.poke_data.PokeType;
import unittesting.classes.poke_data.Pokemon;

@SpringBootTest
public class PokemonTests {

    @Test
    void constructorTest() {
        Pokemon poke = new Pokemon("Charmander", 4, "FIRE", "MALE", 0.6, 8.5);
        Assert.isTrue(!poke.isLegendary(), "Wrong answer");
        Assert.isTrue(poke.getWeakness().equals(PokeType.WATER), "Wrong weakness");
    }

    @Test
    void eatingTest() {
        Pokemon poke = new Pokemon("Charmander", 4, "FIRE", "MALE", 0.6, 8.5);
        poke.status.setHunger(20);
        poke.eat();
        Assert.isTrue(poke.status.getHunger() == 0, "wrong");
    }

    @Test
    void noEatingTest() {
        Pokemon poke = new Pokemon("Charmander", 4, "FIRE", "MALE", 0.6, 8.5);
        poke.status.setEnergy(0);
        poke.status.setHunger(20);
        poke.eat();
        Assert.isTrue(poke.status.getHunger() == 20, "Wrong");
    }

    @Test
    void trainingTest() {
        Pokemon poke = new Pokemon("Charmander", 4, "FIRE", "MALE", 0.6, 8.5);
        poke.train();
        Assert.isTrue(poke.status.getXp() == 50, "wrong");
    }

    @Test
    void noTrainingTest() {
        Pokemon poke = new Pokemon("Charmander", 4, "FIRE", "MALE", 0.6, 8.5);
        poke.status.setEnergy(0);
        poke.train();
        Assert.isTrue(poke.status.getXp() == 0, "Wrong");
    }

    @Test
    void sleepTest() {
        Pokemon poke = new Pokemon("Charmander", 4, "FIRE", "MALE", 0.6, 8.5);
        poke.status.setEnergy(0);
        poke.sleep();
        Assert.isTrue(poke.status.getEnergy() == 100, "Wrong");
        Assert.isTrue(poke.status.getHunger() == 15, "Wrong");
    }
}

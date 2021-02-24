package unittesting;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import unittesting.classes.data.Status;

@SpringBootTest
public class StatusTests {

    @Test
    void levelUp(){
        Status status = new Status();
        status.setXp(150);
        Assert.isTrue(status.getLvl() == 2, "Didn't level up");
        Assert.isTrue(status.getXp() == 0, "Wrong xp");
    }

}

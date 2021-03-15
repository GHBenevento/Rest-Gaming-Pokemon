package unittesting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import unittesting.classes.data.Status;
import unittesting.classes.service.GameService;

@SpringBootTest
public class StatusTests {

    public Status status;

    @BeforeEach
    void initialize() {
        this.status = new Status();
    }

    @Test
    void levelUp() {
        status.setXp(150);
        Assert.isTrue(status.getLvl() == 2, "Didn't level up");
        Assert.isTrue(status.getXp() == 0, "Wrong xp");
        Assert.isTrue(GameService.maxPoints == 2, "Didn't work");
    }

}

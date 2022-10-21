package flower.store;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class RoseTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 300;
    private final int price = 150;
    private final int anotherPrice = 200;
    private Rose rose;

    @BeforeEach
    public void init() {
        rose = new Rose();
    }

    @Test
    public void testDefault() {
        Assertions.assertEquals("#FF0000", rose.getColor());
        Assertions.assertEquals(rose.getBasePrice(), rose.getPrice());
        Assertions.assertEquals(rose.getBaseSepalLength(),
                rose.getSepalLength());
        Assertions.assertEquals(FlowerType.ROSE, rose.getFlowerType());
    }

    @Test
    public void testConstructor() {
        Rose changedRose = new Rose(price);
        Assertions.assertEquals(price, changedRose.getPrice());
        Assertions.assertEquals(changedRose.getSepalLength(), changedRose.getSepalLength());
        Assertions.assertEquals("#FF0000", rose.getColor());
        changedRose.setPrice(anotherPrice);
        Assertions.assertEquals(anotherPrice, changedRose.getPrice());
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        rose.setPrice(price);
        Assertions.assertEquals(price, rose.getPrice());
    }

    @Test
    public void testColor() {
        rose.setColor(FlowerColor.RED);
        Assertions.assertEquals("#FF0000", rose.getColor());
    }
}

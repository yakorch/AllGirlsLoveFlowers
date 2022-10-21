package flower.store;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class ChamomileTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 300;
    private Chamomile chamomile;

    @BeforeEach
    public void init() {
        chamomile = new Chamomile();
    }

    @Test
    public void testDefault() {
        Assertions.assertEquals("#7f00ff", chamomile.getColor());
        Assertions.assertEquals(chamomile.basePrice, chamomile.getPrice());
        Assertions.assertEquals(chamomile.baseSepalLength, chamomile.getSepalLength());
        Assertions.assertEquals(FlowerType.CHAMOMILE, chamomile.getFlowerType());
    }

    @Test
    public void testConstructor() {
        int price = 100;
        Chamomile changedChamomile = new Chamomile(price);
        Assertions.assertEquals(price, changedChamomile.getPrice());
        Assertions.assertEquals(changedChamomile.baseSepalLength, changedChamomile.getSepalLength());
        Assertions.assertEquals("#7f00ff", changedChamomile.getColor());
        int anotherPrice = 40;
        changedChamomile.setPrice(anotherPrice);
        Assertions.assertEquals(anotherPrice, changedChamomile.getPrice());
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        chamomile.setPrice(price);
        Assertions.assertEquals(price, chamomile.getPrice());
    }

    @Test
    public void testColor() {
        chamomile.setColor(FlowerColor.RED);
        Assertions.assertEquals("#FF0000", chamomile.getColor());
    }
}

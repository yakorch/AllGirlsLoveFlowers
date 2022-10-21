package flower.store;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class ChamomileTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 300;
    private final int price = 100;
    private final int anotherPrice = 40;
    private Chamomile chamomile;

    @BeforeEach
    public void init() {
        chamomile = new Chamomile();
    }

    @Test
    public void testDefault() {
        Assertions.assertEquals("#7f00ff", chamomile.getColor());
        Assertions.assertEquals(chamomile.getBasePrice(), chamomile.getPrice());
        Assertions.assertEquals(chamomile.getBaseSepalLength(),
                chamomile.getSepalLength());
        Assertions.assertEquals(FlowerType.CHAMOMILE,
                chamomile.getFlowerType());
    }

    @Test
    public void testConstructor() {
        Chamomile changedChamomile = new Chamomile(price);
        Assertions.assertEquals(price, changedChamomile.getPrice());
        Assertions.assertEquals(changedChamomile.getBaseSepalLength(),
                changedChamomile.getSepalLength());
        Assertions.assertEquals("#7f00ff", changedChamomile.getColor());
        changedChamomile.setPrice(anotherPrice);
        Assertions.assertEquals(anotherPrice, changedChamomile.getPrice());
    }

    @Test
    public void testPrice() {
        int priceNew = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        chamomile.setPrice(priceNew);
        Assertions.assertEquals(priceNew, chamomile.getPrice());
    }

    @Test
    public void testColor() {
        chamomile.setColor(FlowerColor.RED);
        Assertions.assertEquals("#FF0000", chamomile.getColor());
    }
}

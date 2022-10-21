package flower.store;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class TulipTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 300;
    private final int price = 250;
    private final int anotherPrice = 200;
    private Tulip tulip;

    @BeforeEach
    public void init() {
        tulip = new Tulip();
    }

    @Test
    public void testDefault() {
        Assertions.assertEquals("#0000FF", tulip.getColor());
        Assertions.assertEquals(tulip.getBasePrice(), tulip.getPrice());
        Assertions.assertEquals(tulip.getBaseSepalLength(),
                tulip.getSepalLength());
        Assertions.assertEquals(FlowerType.TULIP, tulip.getFlowerType());
    }

    @Test
    public void testConstructor() {
        Tulip changedTulip = new Tulip(price);
        Assertions.assertEquals(price, changedTulip.getPrice());
        Assertions.assertEquals(changedTulip.getSepalLength(),
                changedTulip.getSepalLength());
        Assertions.assertEquals("#0000FF", changedTulip.getColor());
        changedTulip.setPrice(anotherPrice);
        Assertions.assertEquals(anotherPrice, changedTulip.getPrice());
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        tulip.setPrice(price);
        Assertions.assertEquals(price, tulip.getPrice());
    }

    @Test
    public void testColor() {
        tulip.setColor(FlowerColor.RED);
        Assertions.assertEquals("#FF0000", tulip.getColor());
    }
}

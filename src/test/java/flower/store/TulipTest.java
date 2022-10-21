package flower.store;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class TulipTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 300;
    private Tulip tulip;

    @BeforeEach
    public void init() {
        tulip = new Tulip();
    }

    @Test
    public void testDefault(){
        Assertions.assertEquals("#0000FF", tulip.getColor());
        Assertions.assertEquals(55, tulip.getPrice());
        Assertions.assertEquals(3, tulip.getSepalLength());
        Assertions.assertEquals(FlowerType.TULIP, tulip.getFlowerType());
    }

    @Test
    public void testConstructor(){
        Tulip new_tulip = new Tulip(250);
        Assertions.assertEquals(250, new_tulip.getPrice());
        Assertions.assertEquals(3, new_tulip.getSepalLength());
        Assertions.assertEquals("#0000FF", new_tulip.getColor());
        new_tulip.setPrice(200);
        Assertions.assertEquals(200, new_tulip.getPrice());
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

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
    public void testDefault(){
        Assertions.assertEquals("#7f00ff", chamomile.getColor());
        Assertions.assertEquals(39, chamomile.getPrice());
        Assertions.assertEquals(5, chamomile.getSepalLength());
        Assertions.assertEquals(FlowerType.CHAMOMILE, chamomile.getFlowerType());
    }

    @Test
    public void testConstructor(){
        Chamomile new_chamomile = new Chamomile(100);
        Assertions.assertEquals(100, new_chamomile.getPrice());
        Assertions.assertEquals(5, new_chamomile.getSepalLength());
        Assertions.assertEquals("#7f00ff", new_chamomile.getColor());
        new_chamomile.setPrice(40);
        Assertions.assertEquals(40, new_chamomile.getPrice());
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

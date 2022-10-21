package flower.store;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class FlowerPackTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 40;
    private static final int MAX_PRICE = 1000;

    @Test
    public void packTest() {
        for (int i = 0; i < MAX_QUANTITY; i++) {
            int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
            Flower flower = new Flower();
            int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
            flower.setPrice(price);
            FlowerPack pack = new FlowerPack(flower, quantity);
            Assertions.assertEquals(quantity * price, pack.getPrice());
        }
    }
}

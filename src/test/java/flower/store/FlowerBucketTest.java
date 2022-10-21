package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Random;

public class FlowerBucketTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;

    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        flowerBucket = new FlowerBucket();
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flower = new Rose();
        flower.setPrice(price);
        FlowerPack flowerPack = new FlowerPack(flower, quantity);
        flowerBucket.add(flowerPack);
        Assertions.assertEquals(price * quantity, flowerBucket.getPrice());
    }

    @Test
    public void testMore() {
        flowerBucket = new FlowerBucket();
        int quan1 = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quan2 = RANDOM_GENERATOR.nextInt(MAX_PRICE);

        Rose rose = new Rose();
        Tulip tulip = new Tulip();

        FlowerPack flowerPack1 = new FlowerPack(rose, quan1);
        FlowerPack flowerPack2 = new FlowerPack(tulip, quan2);

        flowerBucket.add(flowerPack1);
        flowerBucket.add(flowerPack2);

        Assertions.assertEquals(quan1 * rose.getPrice() + quan2 * tulip.getPrice(), flowerBucket.getPrice());
    }
}

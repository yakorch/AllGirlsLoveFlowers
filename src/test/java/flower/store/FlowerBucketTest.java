package flower.store;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class FlowerBucketTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 100;
    private static final int MAX_PRICE = 1000;

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
        int quanRose = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quanTulip = RANDOM_GENERATOR.nextInt(MAX_PRICE);

        Rose rose = new Rose();
        Tulip tulip = new Tulip();

        FlowerPack flowerPackRose = new FlowerPack(rose, quanRose);
        FlowerPack flowerPackTulip = new FlowerPack(tulip, quanTulip);

        flowerBucket.add(flowerPackRose);
        flowerBucket.add(flowerPackTulip);

        Assertions.assertEquals(quanRose * rose.getPrice() +
                quanTulip * tulip.getPrice(), flowerBucket.getPrice());
    }
}

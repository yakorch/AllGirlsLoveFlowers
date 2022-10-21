package flower.store;

public class Tulip extends Flower {
    public final int basePrice = 55;
    public final int baseSepalLength = 3;

    public Tulip() {
        this.setFlowerType(FlowerType.TULIP);
        this.setSepalLength(baseSepalLength);
        this.setColor(FlowerColor.BLUE);
        this.setPrice(basePrice);
    }

    public Tulip(double price) {
        this.setFlowerType(FlowerType.TULIP);
        this.setSepalLength(3);
        this.setColor(FlowerColor.BLUE);
        this.setPrice(price);
    }
}

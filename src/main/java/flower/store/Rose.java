package flower.store;


public class Rose extends Flower {

    public final int basePrice = 99;
    public final int baseSepalLength = 4;

    public Rose() {
        this.setFlowerType(FlowerType.ROSE);
        this.setSepalLength(baseSepalLength);
        this.setPrice(basePrice);
        this.setColor(FlowerColor.RED);
    }

    public Rose(double price) {
//      constructor with price
        this.setFlowerType(FlowerType.ROSE);
        this.setSepalLength(4);
        this.setPrice(price);
        this.setColor(FlowerColor.RED);
    }
}

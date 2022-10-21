package flower.store;

public class Tulip extends Flower {
    public Tulip() {
        this.setFlowerType(FlowerType.TULIP);
        this.setSepalLength(3);
        this.setColor(FlowerColor.BLUE);
        this.setPrice(55);
    }

    public Tulip(double price) {
        this.setFlowerType(FlowerType.TULIP);
        this.setSepalLength(3);
        this.setColor(FlowerColor.BLUE);
        this.setPrice(price);
    }
}

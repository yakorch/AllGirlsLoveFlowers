package flower.store;


public class Rose extends Flower {
    public Rose() {
        this.setFlowerType(FlowerType.ROSE);
        this.setSepalLength(4);
        this.setPrice(99);
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

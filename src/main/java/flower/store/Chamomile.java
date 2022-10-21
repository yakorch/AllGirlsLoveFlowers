package flower.store;

public class Chamomile extends Flower {
    public final int basePrice = 39;
    public final int baseSepalLength = 5;

    public Chamomile() {
        this.setFlowerType(FlowerType.CHAMOMILE);
        this.setSepalLength(baseSepalLength);
        this.setColor(FlowerColor.VIOLET);
        this.setPrice(basePrice);
    }

    public Chamomile(double price) {
        this.setFlowerType(FlowerType.CHAMOMILE);
        this.setSepalLength(5);
        this.setColor(FlowerColor.VIOLET);
        this.setPrice(price);
    }
}

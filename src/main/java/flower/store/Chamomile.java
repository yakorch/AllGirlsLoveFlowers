package flower.store;

public class Chamomile extends Flower {
    public Chamomile() {
        this.setFlowerType(FlowerType.CHAMOMILE);
        this.setSepalLength(5);
        this.setColor(FlowerColor.VIOLET);
        this.setPrice(39);
    }

    public Chamomile(double price) {
        this.setFlowerType(FlowerType.CHAMOMILE);
        this.setSepalLength(5);
        this.setColor(FlowerColor.VIOLET);
        this.setPrice(price);
    }
}

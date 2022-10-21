package flower.store;

import lombok.Getter;

import java.util.ArrayList;

public class FlowerBucket {

    @Getter
    private final ArrayList<FlowerPack> allFlowerPacks = new ArrayList<>();

    public void add(FlowerPack pack) {
        allFlowerPacks.add(pack);
    }

    public double getPrice() {
        double res = 0;
        for (FlowerPack pack : allFlowerPacks) {
            res += pack.getPrice();
        }
        return res;
    }
}

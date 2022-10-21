package flower.store;

import java.util.ArrayList;
import java.util.Arrays;

public class FlowerBucket {

    private ArrayList<FlowerPack> all_flower_packs = new ArrayList<FlowerPack>();

    public void add(FlowerPack pack) {
        all_flower_packs.add(pack);
    }

    public double getPrice() {
        double res = 0;
        for (FlowerPack pack : all_flower_packs) {
            res += pack.getPrice();
        }
        return res;
    }
}

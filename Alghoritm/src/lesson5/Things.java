package lesson5;

import java.util.Random;

public class Things {
    private Thing[] arr;
    public Things(int count, int maxWeight, int maxCost){
        arr = new Thing[count];
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            arr[i] = new Thing(rand.nextInt(maxCost), rand.nextInt(maxWeight));
        }
    }

    public Thing[] getArr() {
        return arr;
    }
}

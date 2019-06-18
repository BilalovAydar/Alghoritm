package lesson5;

public class LetsFull {
    public static void main(String[] args) {
        Bag bag = new Bag(100, 50);
        Things things = new Things(20, 15, 20);
            weightRec(things, bag);
        
    }

    private static int weightRec(Things things, Bag bag) {
        int maxWeight = bag.getWeight();
        Thing[] arr = things.getArr();
        int maxW = 0, k = 0;
        int maxC = arr[0].getCost();
        if (maxWeight == 0)
            return 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].getWeight() <= maxWeight && maxC < arr[i].getCost()){
                maxC = arr[i].getCost();
                maxW = arr[i].getWeight();
                k = i;
            }
        }
        if (maxW == 0) {
            bag.setWeight(0);
            return 0;
        }
        things.setArrCost(k);
        maxWeight = maxWeight - maxW;
        System.out.println("наиб стоимость " + maxC + " вес " + maxW + " осталось веса " + maxWeight);
        bag.setWeight(maxWeight);
        return weightRec(things, bag);

    }
}

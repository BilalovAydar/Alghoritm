package lesson5;

public class LetsFull {
    public static void main(String[] args) {
        Bag bag = new Bag(100, 50);
        Things things = new Things(20, 15, 20);
        Thing[] thing = things.getArr();
        int sumCost1 = 0, sumCost2 = 0;
        int sumWeight1 = 0, sumWeight2 = 0;
        int i = 0;
            while(sumWeight1 <= bag.getMaxWeight()){
            sumCost1 = sumCost1 + thing[i].getCost();
            sumWeight1 = sumWeight1 + thing[i].getWeight();
            i++;
            }
            //weightRec();
        
    }

    private static int weightRec(Thing[] arr, int maxWeight) {
        //if (maxWeight - arr[i].getWeight() > )
    }
}

package lesson5;

public class Bag {
    private int maxCost;
    private int maxWeight;
    private int weight;
    public Bag(int maxCost, int maxWeight){
        this.maxWeight = maxWeight;
        this.maxCost = maxCost;
        this.weight = maxWeight;
    }

    public int getMaxCost() {
        return maxCost;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}

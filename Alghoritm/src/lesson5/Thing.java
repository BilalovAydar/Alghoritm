package lesson5;

public class Thing {
    private int cost;
    private int weight;
    public Thing(int cost, int weight){
        this.cost = cost;
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public int getWeight() {
        return weight;
    }
}

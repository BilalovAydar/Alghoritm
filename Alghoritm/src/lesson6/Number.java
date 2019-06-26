package lesson6;

import java.util.Random;

public class Number {
    public int id;
    public int num;

    public Number(){}
    public Number(int id){
        Random rand = new Random();
        this.id = id;
        this.num = (int)(-100 + rand.nextInt(11) * 0.2 * 100);
    }
}

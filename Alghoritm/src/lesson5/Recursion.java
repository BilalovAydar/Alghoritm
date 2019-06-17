package lesson5;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(powRec(3 , 3));
    }
    public static int powRec(int n, int k){
        if (k == 0)
            return 1;
        return n * powRec(n, k - 1);
    }
}

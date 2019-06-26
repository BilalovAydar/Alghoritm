package lesson7;

public class Graph {
    private final int MAX_COUNT = 10;
    private Point[] points;
    private int[][] margin;
    private int size;
    private Stack stack;

    public Graph() {
        stack = new Stack(MAX_COUNT);
        points = new Point[MAX_COUNT];
        margin = new int[MAX_COUNT][MAX_COUNT];
        size = 0;
        for (int i = 0; i < MAX_COUNT; i++) {
            for (int j = 0; j < MAX_COUNT; j++) {
                margin[i][j] = 0;
            }
        }
        for (int i = 0; i < MAX_COUNT; i++) {
            points[i] = new Point((char)(i + 65));
            size++;
        }
    }
    public void addPoints(int ch,int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                margin[ch][arr[i] - 65] = 1;
                System.out.println(margin[ch][arr[i] - 65] + " " + arr[i]);
                margin[arr[i] - 65][ch] = 1;
            }
        }

    }

    public int getUnvisitedPoint(int key){
        for (int i = 0; i < size; i++) {
            if(margin[i][key] == 1 && !points[i].visited){
                return i;
            }
        }
        return -1;
    }
    public void displayMargin(){
        for (int i = -1; i < MAX_COUNT; i++) {
            System.out.print((char)(i + 65) + " ");
            for (int j = 0; j < MAX_COUNT; j++) {
                if (i==-1) System.out.print((char)(j + 65) + " ");
                else System.out.print(margin[i][j] + " ");
            }

            System.out.println();
        }
    }
    public void addEdge(int start, int end){
        margin[start][end] = 1;
        margin[end][start] = 1;
    }
    public void deleteEdge(int start, int end){
        margin[start][end] = 0;
        margin[end][start] = 0;
    }
    public void displayPoint(int key){
        System.out.println(points[key].label);
    }
    public void dfs(){
        points[0].visited = true;
        displayPoint(0);
        stack.push(0);
        while (!stack.isEmpty()) {
            int v = getUnvisitedPoint(stack.peek());
            if (v == -1) stack.pop();
            else {
                points[v].visited = true;
                displayPoint(v);
                stack.push(v);
            }
        }
        for (int i = 0; i < size; i++) {
            points[i].visited = false;
        }
    }
    public boolean search(int start, int end){
        int s = 0, min = 0, k = 0;
        points[start].visited = true;
        displayPoint(start);
        stack.push(start);
        while (!stack.isEmpty()) {
            //if (margin[start][end] == 1) stack.push(end);
            int v = getUnvisitedPoint(stack.peek());
            if (v == -1) stack.pop();
            else {
                points[v].visited = true;
                displayPoint(v);
                stack.push(v);
            }
            if (v == end) {
                k = stack.display();
                if (k < min) min = k;
                s++;
            }
        }
        for (int i = 0; i < size; i++) {
            points[i].visited = false;
        }
        if (s > 0)  return true;
        else return false;
    }
}

package lesson7;

import java.util.Scanner;

public class LetsPoint   {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Graph graph = new Graph();

        for (int i = 0; i < 10; i++) {

            while(true) {
                int s = 0;
                System.out.println("Введите смежные вершины для " + (char)(i + 65));
                String ch = sc.next();
                int k = ch.length();
                if (k > 10)k = 10;
                int[] arr = new int[k];
                for (int j = 0; j < k; j++) {
                    if (ch.charAt(j) != (char) (i + 65) && ch.charAt(j) >= 65 && ch.charAt(j) <= 74) {
                        arr[j] = (int) ch.charAt(j);
                        s++;
                    }
                    else if (ch.charAt(j) != (char) (i + 97) && ch.charAt(j) >= 97 && ch.charAt(j) <= 106) {
                        arr[j] = (int) ch.charAt(j) - 32;
                        s++;
                    }
                    else arr[j] = 0;
                    System.out.print((char) arr[j] + " ");
                }
                System.out.println();
                graph.addPoints(i, arr);
                if (s > 0) break;
            }

        }

        graph.displayMargin();
        System.out.println(graph.getUnvisitedPoint(0));
        graph.dfs();
        System.out.println();
        graph.displayPoint(3);
        System.out.println();
        graph.search(0, 3);
    }
}

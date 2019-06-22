package lesson6;

public class LetsTree {
    public static void main(String[] args) {

        Tree[] trees = new Tree[20];
        for (int i = 0; i < 20; i++) {
            trees[i] = new Tree();
            for (int j = 0; j < 6; j++) {
                trees[i].insert(new Number(j));
               // trees[i].root.display();
            }
        }

        for (int i = 0; i < 20; i++) {

            //trees[i].balanceTree(trees[i].root);
            int k = trees[i].balanceTreeL(trees[i].root);
            if (k == 4){
                System.out.println("Сбалансированный k = " + k);}
            else{
                System.out.println("Несбалансированный");
            }
            //trees[i].max().display();
            //trees[i].min().display();
            System.out.println();
        }



    }
}

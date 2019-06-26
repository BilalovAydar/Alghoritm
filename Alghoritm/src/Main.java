import java.util.Random;

public class Main {
    public static Random rand = new Random();
    public static void main(String[] args) {
        int[] myArr;
        int indexSearch;
        myArr = initArr(1000000);
        printArr(myArr);
        System.out.println("init");
        myArr = deleteEl(myArr, 5000);
        printArr(myArr);
        System.out.println("del");
        myArr = addEl(myArr, 600);
        printArr(myArr);
        System.out.println("add");
        myArr = searchElement(myArr, 500000);
        printArr(myArr);
        System.out.println("search");
        myArr = bubleSort(myArr);
        myArr = selectSortMark(myArr);
        printArr(myArr);
        myArr = selctInsertSort(myArr);
    }

    private static int[] selctInsertSort(int[] myArr) {
        int in, out;
        for (out = 1; out < myArr.length; out++) {
            int temp = myArr[out];
            in = out;
            while (in > 0 && myArr[in - 1] >= temp) {
                myArr[in] =  myArr[in - 1];
                --in;
            }
            myArr[in] = temp;
        }
        return myArr;
    }

    private static int[] selectSortMark(int[] myArr) {
        int in, out, mark;
        for (in = 0; in < myArr.length; in++) {
            mark = in;
            for (out = in + 1; out < myArr.length; out++) {
                if (myArr[out] < myArr[mark]) {
                    mark = out;
                }
            }
            int tmp = myArr[mark];
            myArr[mark] = myArr[in];
            myArr[in] = tmp;
        }
        return myArr;
    }

    private static int[] bubleSort(int[] myArr) {
        int in, out;
        for (out = myArr.length; out >= 1; out--){
            for (in = 0; in < out; in++){
                if  (myArr[in] > myArr[in + 1]) {
                    int tmp = myArr[in];
                    myArr[in] = myArr[in + 1];
                    myArr[in + 1] = tmp;
                }
            }
        }
        return myArr;
    }

    private static void printArr(int[] myArr) {
        for (int i = 0; i < myArr.length; i++){
            System.out.print(myArr[i] + " ");
        }
        System.out.println();
    }

    private static int[] addEl(int[] myArr, int el) {
        int[] myArr1 = new int[myArr.length + 1];
        for (int i = 0; i < myArr.length; i++){
            myArr1[i] = myArr[i];
        }
        myArr1[myArr.length] = el;
        return myArr1;
    }

    private static int[] deleteEl(int[] myArr, int el) {
        int[] myArr1 = searchElement(myArr, el); //ваш метод модходит за один проход удалять лишь один элемент, а если таких много, то он бесполезен
        int len = myArr.length - myArr1.length + 1;
        int[] myArr2 = new int[len];
        len = 0;
        for (int i = 0; i < myArr.length; i++){
            if(myArr[i] != el){
                myArr2[len] = myArr[i];
                len++;
            }
            else {
                System.out.println("delete"); }
        }
        return myArr2;
    }

    private static int[] searchElement(int[] myArr, int el) {
        int[] myArr1 = initWorkArr(myArr.length);
        int k = 0;
        int s = 0;
        for (int i = 0; i < myArr.length; i++){
            if (myArr[i] == el){
                myArr1[k] = i;
                k++;
            }
        }
        s = k + 1;
        int[] myArr2 = new int[s];
        k = 0;
        while (k < s){
            myArr2[k] = myArr1[k];
            k++;
        }
        return myArr2;
    }

    private static int[] initArr(int count) {
        int[] myArr = new int[count];
        for (int i = 0;i < myArr.length;i++){
            myArr[i] = rand.nextInt(myArr.length);
        }
        return myArr;
    }
    private static int[] initWorkArr(int count) {
        int[] myArr = new int[count];
        for (int i = 0;i < myArr.length;i++){
            myArr[i] = -1;
        }
        return myArr;
    }

}

import java.util.ArrayList;
import java.util.Random;

// 從小排到大
public class quicksort {
    public static void main(String args[]) {

        ArrayList<Integer> arr = new ArrayList<Integer>();

        int index = (int)(Math.random() * 100) + 1;

        for (int i=0 ; i<index ; i++) {
            arr.add((int)(Math.random() * 100));
        }

        for (int i : Quicksort(arr)) {
            System.out.print(i + " ");
        }

    }

    public static ArrayList<Integer> Quicksort(ArrayList<Integer> arr) {

        if (arr.size() == 0) return null;

        if (arr.size() == 1) {
            return arr;
        } else {

            ArrayList<Integer> maxArr = new ArrayList<Integer>();
            ArrayList<Integer> minArr = new ArrayList<Integer>();

            int index = ((arr.size() / 2) - 1);
            int num = arr.get(index);

            for (int i=0 ; i<arr.size() ; i++) {

                if (i != index) {

                    if (arr.get(i) > num) {
                        maxArr.add(arr.get(i));
                    } else {
                        minArr.add(arr.get(i));
                    }

                }

            }

            if (maxArr.size() != 0 && minArr.size() != 0) {
                
                ArrayList<Integer> t = new ArrayList<Integer>();

                t.addAll(Quicksort(minArr));
                t.add(num);
                t.addAll(Quicksort(maxArr));

                return t;

            } else if (maxArr.size() != 0 && minArr.size() == 0) {

                ArrayList<Integer> t = new ArrayList<Integer>();

                t.add(num);
                t.addAll(Quicksort(maxArr));

                return t;
            } else {

                ArrayList<Integer> t = new ArrayList<Integer>();

                t.addAll(Quicksort(minArr));
                t.add(num);

                return t;
            }

        }

    }
}

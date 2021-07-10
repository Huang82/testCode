import java.util.ArrayList;
import java.util.List;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class margeSort {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();

        int index = (int)(Math.random() * 100) + 1;

        for (int i=0 ; i<index ; i++) {
            arr.add((int)(Math.random() * 100));
        }

        System.out.println(arr);

        System.out.println(MargeSort(arr));

    }   
    
    // 從小排到大
    public static ArrayList<Integer> MargeSort(ArrayList<Integer> arr) {

        if (arr.size() == 0) return null;

        if (arr.size() == 1) {
            return arr;
        } else {
            
            int index = (int)(arr.size() / 2);

            ArrayList<Integer> Tarr1 = new ArrayList<Integer>();
            ArrayList<Integer> Tarr2 = new ArrayList<Integer>();

            for (int n : arr.subList(0, index)) Tarr1.add(n);

            for (int n : arr.subList(index, arr.size())) Tarr2.add(n);


            if (Tarr1.size() == 1 && Tarr2.size() == 1) {

                ArrayList<Integer> SortAns = new ArrayList<Integer>();

                if (Tarr1.get(0) > Tarr2.get(0)) {

                    SortAns.add(Tarr2.get(0));
                    SortAns.add(Tarr1.get(0));

                    return SortAns;
                } else {

                    SortAns.add(Tarr1.get(0));
                    SortAns.add(Tarr2.get(0));

                    return SortAns;
                }

            } else {

                Tarr1 = MargeSort(Tarr1);
                Tarr2 = MargeSort(Tarr2);

                for (int i=0 ; i<Tarr2.size() ; i++) {
                    for (int j=0 ; j<Tarr1.size() ; j++) {

                        if (Tarr1.get(j) >= Tarr2.get(i)) {
                            Tarr1.add(j, Tarr2.get(i));
                            break;
                        }

                        if (j == (Tarr1.size() - 1)) {
                            Tarr1.add(Tarr2.get(i));
                            break;
                        }
                    }
                }

                return Tarr1;
            }

        }

    }
}

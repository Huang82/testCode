
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class findListNum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int list[] = new int[100];

        for (int i=0 ; i<100; i++) {
            list[i] = (int)(Math.random() * 1000);
        }

        Arrays.sort(list);

        int findNum = in.nextInt();
        
        System.out.println("你的位置： " + findListNumIndex(list, findNum));

    }

    private static int findListNumIndex(int[] list, int findNum) {

        int max = list.length - 1;
        int min = 0;
        int findIndex;
        int index = 1;

        while (min <= max) {

            System.out.println(index);

            findIndex = (int)((max + min) / 2); 

            if (list[findIndex] == findNum) {
                return findIndex;
            } else if (list[findIndex] > findNum) {
                max = findIndex - 1;
            } else if (list[findIndex] < findNum) {
                min = findIndex + 1;
            }

            index++;

        }

        return -1;
    }
}
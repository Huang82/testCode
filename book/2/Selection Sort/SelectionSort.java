

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = new int[]{5, 3, 6, 2, 10};

        arr = Sort_small(arr);

        for (int i : arr) {

            System.out.print(i + " ");

        }

    }

    private static int[] Sort_small(int[] arr) {

        int[] tempArr = new int[arr.length];

        int smallNum = 0;
        int removeIndex = 0;

        for (int i=0 ; i<tempArr.length ; i++) {

            smallNum = arr[0];

            for (int j=0 ; j<arr.length ; j++) {
                if (arr[j] <= smallNum) {

                    smallNum = arr[j];
                    removeIndex = j;

                }
            }

            tempArr[i] = smallNum;
            arr = removeArr(arr, removeIndex);
            
        }

        return tempArr;
    }

    private static int[] removeArr(int[] arr, int removeIndex) {

        int[] tempArr = new int[arr.length - 1];

        for (int i=0, j=0; i<arr.length ; i++) {

            if (i != removeIndex) {
                tempArr[j] = arr[i];
                j++;
            }

        }

        return tempArr;
    }
}
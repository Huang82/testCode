
public class sum {
    public static void main(String args[]) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 9};

        System.out.println(Sum(arr));

    }    

    private static int Sum (int[] arr) {

        if (arr.length == 1) 
        {
            return arr[0];
        } 
        else if (arr.length == 0)
        {
            return 0;
        }
        else
        {
            int[] t = new int[(arr.length - 1)];

            for (int i=0 ; i<t.length ; i++)
            {
                t[i] = arr[i];
            }

            return arr[(arr.length - 1)] + Sum(t);
        }

    }
}

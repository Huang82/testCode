

// 二元搜尋法
public class guessNum {

    public static void main(String args[]) {

        int range = 100000;                        // range

        int ans = (int)(Math.random() * range);   // 答案
        int index = 1;                          // 猜的次數
        int guess;                  // 猜的數字
        int max = range, min = 0;
        
        while(true) {

            guess = (int)((max + min) / 2);

            int action = checkAns(ans, guess);

            System.out.println("你猜了" + index + "次" + ans + "   " + guess);

            if (action == 0) {
                break;
            } else if (action == 1){
                min = guess;
            } else if(action == 2) {
                max = guess;
            }
            

            index++;

        }

        System.out.println("猜對了!!");
        

    }

    /**
     * 0 found the Answer
     * 1 up
     * 2 down
     */
    private static int checkAns(int ans, int guess) {

        if (ans == guess)
            return 0;
        
        if (ans > guess)
            return 1;

        if (ans < guess)
            return 2;

        // 不應該跑到這
        return 0;
    }

}
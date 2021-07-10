// 遞迴
public class factorial {
    public static void main(String[] args) {

        System.out.println(cal(10));

    }   
    
    private static int cal(int n) {
        
        if (n == 1) {
            return 1;
        } else {
            return n * cal(n - 1);
        }

    } 
}

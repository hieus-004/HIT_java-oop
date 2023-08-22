import java.util.Scanner;

public class Buoi2Bai2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        do {
            n = s.nextInt();
        } while (n < 0);
        
        // a
        float sum1 = 1;
        for (float i = 2; i <= n; i++){
            sum1 += 1/i;
        }
        System.out.println(sum1);

        // b 
        long res = 1;
        long sum2 = 1;
        for (long i = 2; i <= n; i++){
            sum2 *= i;
            res += sum2;
        }
        System.out.println(res);

        // memory leak wth
        s.close();
    }
}

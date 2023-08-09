import java.util.Scanner;

public class Buoi2Bai1 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++){
            if (i == 1 || i == n){
                int cnt = 0;
                while (cnt < n){
                    System.out.print("*");
                    cnt++;
                }
            }
            else {
                int cnt = 0;
                while (cnt < n){
                    if (cnt == 0 || cnt == n - 1){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                    cnt++;
                }
            }
            System.out.print("\n");
        }
        s.close();
    }

}
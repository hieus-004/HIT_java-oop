import java.util.Scanner;

public class Buoi2Bai3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if (n == 1){
            System.out.printf("1 khong phai so nguyen to \n");
            return;
        }

        for (int i = 2; i * i <= n; i++){
            if (n % i == 0){
                System.out.printf("%d khong phai so nguyen to \n", n);
                return;
            } 
        }
        System.out.printf("%d la so nguyen to \n", n);   
        
        s.close();
    }
}

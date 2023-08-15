package buoi3;

import java.util.Scanner;

public class test {
    Scanner s = new Scanner(System.in);
    void bai1(){
        System.out.printf("n = ");
        int n = s.nextInt();
        int[] a = new int[n + 1];

        System.out.printf("Nhap mang : ");
        for (int i = 0; i < n; i++){
            a[i] = s.nextInt();
        }

        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                if (a[i] > a[j]){
                    int tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                
                }
            }
        }

        for (int i = 0; i < n; i++){
            int cnt = 1;
            while (a[i] == a[i + 1]){
                i++;
                cnt++;
            }
            System.out.printf("So %d xuat hien %d lan", a[i], cnt);
        }
    }

    void bai2(){
        System.out.printf("n = ");
        int m = s.nextInt();
        int b[] = new int[m + 1];
        System.out.printf("Nhap mang ");
        for (int i = 0; i < m; i++){
            b[i] = s.nextInt();
        }
        
        them(b, m);
        xoa(b, m);
    }

    void them(int b[], int m){
        int x;
        do {
            System.out.printf("Vi tri them phan tu moi ");
            x = s.nextInt();
            if (x < 0 || x > m){
                System.out.printf("Vi tri khong hop le ");
            }
        } while (x < 0 || x > m);
        System.out.printf("Gia tri phan tu moi ");
        int k = s.nextInt();

        for (int i = m; i >= x; i--){
            b[i] = b[i - 1];
        }
        b[x - 1] = k;

        for (int i = 0; i <= m; i++){
            System.out.printf("%d ",b[i]);
        }
        System.out.printf("\n");
    }

    void xoa(int b[], int m){
        int x;
        do {
            System.out.printf("Vi tri xoa phan tu ");
            x = s.nextInt();
            if (x < 0 || x > m){
                System.out.printf("Vi tri khong hop le ");
            }
        } while (x < 0 || x > m);
        
        int c[] = new int[m];

        for (int i = 0; i < m; i++){
            if (i < x - 1){
                c[i] = b[i];
            }
            else{
                c[i] = b[i + 1];
            }
        }

        for (int i = 0; i < m; i++){
            System.out.printf("%d ", c[i]);
        }
        System.out.printf("\n");
    }

    void bai3(){
        System.out.printf("n = ");
        int n = s.nextInt();
        int[] a = new int[n + 1];

        System.out.printf("Nhap mang : ");
        for (int i = 0; i < n; i++){
            a[i] = s.nextInt();
        }

        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                if (a[i] > a[j]){
                    int tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                
                }
            }
        }
        System.out.printf("Mang sau khi sap xep ");
        for (int i = 0; i < n; i++){
            System.out.printf("%d ",a[i]);
        }
    }

    void bai4(){
        System.out.printf("Nhap chuoi ");
        String v = s.nextLine();
        int len = v.length();
        for (int i = (len / 2) - 1; i >= 0; i--){
            if (v.charAt(i) != v.charAt(len - i - 1)){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }

    void bai5(){
        System.out.printf("Nhap chuoi ");
        String x = s.nextLine();
        
        x.trim();
        String x2 = x.toLowerCase();
        String x3 = x.toUpperCase();
        
        int n = x.length();
        
        System.out.print(x3.charAt(0));
        for (int i = 1; i < n; i++){
            while(x.charAt(i) == ' ' && x.charAt(i + 1) == ' '){
                i++;
            }
            if (x.charAt(i) == ' ' && x.charAt(i - 1) != ' '){
                System.out.print(' ');
                i++;
            }
            if (x.charAt(i - 1) == ' ' || i == 0){
                System.out.print(x3.charAt(i));
            }
            else {
                System.out.print(x2.charAt(i));
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // test Bai1 = new test();
        // Bai1.bai1();

        // test Bai2 = new test();
        // Bai2.bai2();

        // test Bai3 = new test();
        // Bai3.bai3();

        // test Bai4 = new test();
        // Bai4.bai4();

        test Bai5 = new test();
        Bai5.bai5();
    }
}

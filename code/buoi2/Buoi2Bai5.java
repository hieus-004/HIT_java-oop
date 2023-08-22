import java.util.Scanner;

public class Buoi2Bai5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int res = a;

        int tmp;
        tmp = b / 2;
        if (res > tmp)
            res = tmp;
        
        tmp = c / 4;
        if (res > tmp)
            res = tmp;
        
        System.out.printf("so qua toi da la %d \n", res * 7);
    }
    
}

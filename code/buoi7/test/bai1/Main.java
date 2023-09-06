package buoi7.test.bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String x = s.nextLine();

        int res = 0;

        for (int i = 0; i < x.length(); i++){
            int l = 0, r = 0;
            if  (x.charAt(i) < 58 && x.charAt(i) > 47){
                l = i;
            }
            while (x.charAt(i) < 58 && x.charAt(i) > 47){    
                if (i != x.length() - 1){
                    i++;
                    break;
                }
                r = i;
            }
            if (l != 0)
                res += Integer.parseInt(x.substring(l, r));
        }

        System.out.println(res);
    }
}

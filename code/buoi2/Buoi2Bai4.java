import java.util.Scanner;

public class Buoi2Bai4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float a = s.nextFloat();
        float b = s.nextFloat();
        float c = s.nextFloat();

        double delta = (b * b) - (4 * a * c);

        if (delta >= 0){
            if (delta > 0){
                double x1 = (b * -1 - Math.sqrt(delta))/ (2 * a);
                double x2 = (b * -1 + Math.sqrt(delta))/ (2 * a);
                
                if(x1 < 0 && x2 < 0){
                    System.out.printf("cant bro\n");
                    return;
                }
                
                if (x1 < 0){
                    System.out.printf("x1 = %f \n", Math.sqrt(x2));
                    System.out.printf("x2 = %f \n", Math.sqrt(x2) * -1);
                    return;
                }
                if (x2 < 0){
                    System.out.printf("x1 = %f \n", Math.sqrt(x1));
                    System.out.printf("x2 = %f \n", Math.sqrt(x1) * -1);
                    return;
                }
                if (x1 == 0){
                    System.out.printf("x1 = 0\n");
                    if (x2 > 0){
                        System.out.printf("x2 = %f \n", Math.sqrt(x2));
                        System.out.printf("x3 = %f \n", Math.sqrt(x2) * -1);
                    }
                    return;
                }
                if (x2 == 0){
                    System.out.printf("x1 = 0\n");
                    if (x2 > 0){
                        System.out.printf("x2 = %f \n", Math.sqrt(x1));
                        System.out.printf("x3 = %f \n", Math.sqrt(x1) * -1);
                    }
                    return;
                }
                
                System.out.printf("x1 = %f \n", Math.sqrt(x1));
                System.out.printf("x2 = %f \n", Math.sqrt(x1) * -1);
                System.out.printf("x3 = %f \n", Math.sqrt(x2));
                System.out.printf("x4 = %f \n", Math.sqrt(x2) * -1);
                
            }
            else {
                double x = -b / (2 * a);
                if (x == 0){
                    System.out.printf("x1 = %f\n", x);
                }
                else {
                    if (x < 0){
                        System.out.printf("cant\n");
                    }
                    else {
                        System.out.printf("x1 = %f \n", Math.sqrt(x));
                        System.out.printf("x2 = %f \n", Math.sqrt(x) * -1);
                    }
                }
            }
        }
    }
}

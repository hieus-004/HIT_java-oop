package buoi4.btvn.bai2;

import java.util.Scanner;

public class Square {
    private float D;
    private float R;

    public Square(){

    }

    public Square(float D2, float R2){
        D = D2;
        R = R2;
    }
    
    public void nhap(){
        Scanner s = new Scanner(System.in);
        D = s.nextInt();
        R = s.nextInt();
    }

    public void veHCN(){
        for (int i = 0; i < R; i++){
            for (int j = 0; j < D; j++){
                if (i == 0 || i == R - 1 || j == 0 || j == D - 1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public float chuVi(){
        return (D + R) * 2;
    }

    public float dienTich(){
        return D * R;
    }
}

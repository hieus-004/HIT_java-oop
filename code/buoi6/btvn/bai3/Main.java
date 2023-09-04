package buoi6.btvn.bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        //Hang hoa dien tu
        ArrayList<HangHoaDienTu> dsDT = new ArrayList<HangHoaDienTu>();
        System.out.print("So luong hang hoa dien tu : ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++){
            HangHoaDienTu DT = new HangHoaDienTu();
            DT.input();
            dsDT.add(DT);
        }

        for (HangHoaDienTu DT : dsDT){
            DT.output();
        }

        //Hang hoa gia dung
        ArrayList<HangHoaGiaDung> dsGD = new ArrayList<HangHoaGiaDung>();
        System.out.print("So luong hang hoa gia dung : ");
        int m = s.nextInt();
        for (int i = 0; i < m; i++){
            HangHoaGiaDung GD = new HangHoaGiaDung();
            GD.input();
            dsGD.add(GD);
        }

        for (HangHoaGiaDung GD : dsGD){
            GD.output();
        }

        //close scanner
        s.close();
    }
}

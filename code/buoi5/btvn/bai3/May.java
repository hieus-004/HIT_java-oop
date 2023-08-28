package buoi5.btvn.bai3;

import java.util.Scanner;

public class May {
    private String MaMay;
    private String TenMay;
    private String TinhTrang;

    public May(){

    }

    public May(String MaMay, String TenMay, String TinhTrang){
        this.MaMay = MaMay;
        this.TenMay = TenMay;
        this.TinhTrang = TinhTrang;
    }

    public void Nhap(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ma may : ");
        MaMay = s.nextLine();
        System.out.print("Nhap ten may : ");
        TenMay = s.nextLine();
        System.out.print("Tinh trang : ");
        TinhTrang = s.nextLine();
    }

    public void Xuat(){
        System.out.println("Ma may : " + MaMay);
        System.out.println("Ten may : " + TenMay);
        System.out.println("Tinh trang : " + TinhTrang);
    }
}

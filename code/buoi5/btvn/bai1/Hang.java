package buoi5.btvn.bai1;

import java.util.Scanner;

public class Hang {
    private String MaHang;
    private String TenHang;
    private NSX x = new NSX();

    public Hang (){

    }

    public Hang (String MaHang, String TenHang, NSX x){
        this.MaHang = MaHang;
        this.TenHang = TenHang;
        this.x = x;
    }

    public void Nhap (){
        System.out.println("Input");
        Scanner s = new Scanner (System.in);
        System.out.print("Ma hang : ");
        MaHang = s.nextLine();
        System.out.print("Ten hang : ");
        TenHang = s.nextLine();
        x.Nhap();
    }

    public void Xuat (){
        System.out.println("\nOutput");
        System.out.println("Ma hang : " + MaHang);
        System.out.println("Ten hang : " + TenHang);
        x.Xuat();
    }
}

package buoi5.btvn.bai3;

import java.util.Scanner;

public class PhongMay {
    private String MaPhong;
    private String TenPhong;
    private double DienTich;
    private QuanLy x = new QuanLy();
    private May[] y;
    private int n; 

    public PhongMay (){

    }

    public PhongMay (String MaPhong, String TenPhong, double DienTich, QuanLy x, May[] y, int n){
        this.MaPhong = MaPhong;
        this.TenPhong = TenPhong;
        this.DienTich = DienTich;
        this.x = x;
        this.y = y;
        this.n = n;
    }

    public void Nhap (){
        System.out.println("Input");
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ma phong : ");
        MaPhong = s.nextLine();
        System.out.print("Nhap ten phong : ");
        TenPhong = s.nextLine();
        System.out.print("Nhap dien tich : ");
        DienTich = s.nextDouble();

        x.Nhap();
        System.out.print("Nhap tong so may : ");
        n = s.nextInt();
        y = new May[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap may thu " + (i + 1));
            y[i] = new May();
            y[i].Nhap();
        }
    }

    public void Xuat (){
        System.out.println("\nOutput");
        System.out.println("Ma phong : " + MaPhong);
        System.out.println("Ten phong : " + TenPhong);
        System.out.println("Dien tich : " + DienTich);
        x.Xuat();
        for (int i = 0; i < n; i++) {
            y[i].Xuat();
        }
    }
}

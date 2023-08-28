package buoi5.btvn.bai3;

import java.util.Scanner;

public class QuanLy {
    private String MaQL;
    private String HoTen;

    public QuanLy (){

    }

    public QuanLy (String MaQL, String HoTen){
        this.MaQL = MaQL;
        this.HoTen = HoTen;
    }

    public void Nhap(){
        Scanner s = new Scanner(System.in);

        System.out.print("Nhap ma quan ly : ");
        MaQL = s.nextLine();
        System.out.print("Nhap ho va ten : ");
        HoTen = s.nextLine();
    }

    public void Xuat(){
        System.out.println("Ma quan ly : " + MaQL);
        System.out.println("Ho va ten : " + HoTen);
    }

    public String getMaQL (){
        return MaQL;
    }

    public String getHoTen (){
        return HoTen;
    }

    public void setMaQL (String MaQL){
        this.MaQL = MaQL;
    }

    public void setHoTen (String HoTen){
        this.HoTen = HoTen;
    }
}

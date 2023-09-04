package buoi6.btvn.bai3;

import java.util.Scanner;

public class VatLieu {
    Scanner s = new Scanner (System.in);

    private String ten;
    private String mauSac;
    private int doCung;
    
    public VatLieu(String ten, String mauSac, int doCung) {
        this.ten = ten;
        this.mauSac = mauSac;
        this.doCung = doCung;
    }

    public VatLieu(){

    }
    
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public int getDoCung() {
        return doCung;
    }

    public void setDoCung(int doCung) {
        this.doCung = doCung;
    }

    public void nhap(){
        System.out.print("Ten ? ");
        ten = s.nextLine();
        System.out.print("Mau sac ? ");
        mauSac = s.nextLine();
        System.out.print("Do cung ? ");
        doCung = s.nextInt();
    }

    public void xuat(){
        System.out.println("Ten : " + ten);
        System.out.println("Mau sac : " + mauSac);
        System.out.println("Do cung : " + doCung);
    }
}

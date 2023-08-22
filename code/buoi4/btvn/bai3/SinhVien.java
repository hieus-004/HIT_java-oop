package buoi4.btvn.bai3;

import java.util.Scanner;

public class SinhVien {
    private String maSinhVien;
    private String hoTen;
    private float diemToan;
    private float diemLy;
    private float diemHoa;

    public SinhVien (){
        
    }

    public SinhVien (String maSinhVien2, String hoTen2, float diemToan2, float diemLy2, float diemHoa2){
        maSinhVien = maSinhVien2;
        hoTen = hoTen2;
        diemToan = diemToan2;
        diemLy = diemLy2;
        diemHoa = diemHoa2;
    }

    public void nhap(){

    }

    public void xuat(){
        System.out.format("%-10s", maSinhVien);
        System.out.format("%-30s", hoTen);
        System.out.format("%-20f", diemToan);
        System.out.format("%-20f", diemLy);
        System.out.format("%-20f", diemHoa);
        System.out.format("%-20f", diemTB());
        System.out.println();
    }

    public float diemTB(){
        return (diemHoa + diemLy + diemToan) / 3;
    }
}

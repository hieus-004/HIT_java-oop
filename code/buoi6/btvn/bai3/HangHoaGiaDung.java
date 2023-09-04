package buoi6.btvn.bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class HangHoaGiaDung extends HangHoa{
    Scanner s = new Scanner (System.in);
    
    private String chucNang;

    public HangHoaGiaDung(String maHang, String tenHang, float soLuong, float donGia, ArrayList<VatLieu> dsVL,
            String chucNang) {
        super(maHang, tenHang, soLuong, donGia, dsVL);
        this.chucNang = chucNang;
    }

    public HangHoaGiaDung() {
        
    }

    public String getChucNang() {
        return chucNang;
    }

    public void setChucNang(String chucNang) {
        this.chucNang = chucNang;
    }

    @Override
    public void input(){
        super.input();
        System.out.print("Chuc nang ? ");
        chucNang = s.nextLine();
    }

    @Override
    public void output(){
        super.output();
        System.out.println("Chuc nang : " + chucNang);
    }
}

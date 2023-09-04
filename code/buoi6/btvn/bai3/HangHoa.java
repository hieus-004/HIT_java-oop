package buoi6.btvn.bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class HangHoa {
    Scanner s = new Scanner(System.in);

    private String maHang;
    private String tenHang;
    private float soLuong;
    private float donGia;
    ArrayList<VatLieu> dsVL = new ArrayList<VatLieu>();
    
    public HangHoa(String maHang, String tenHang, float soLuong, float donGia, ArrayList<VatLieu> dsVL) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.dsVL = dsVL;
    }
    public HangHoa(){

    }
    
    public String getMaHang() {
        return maHang;
    }
    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }
    public String getTenHang() {
        return tenHang;
    }
    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }
    public float getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }
    public float getDonGia() {
        return donGia;
    }
    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }
    public ArrayList<VatLieu> getDsVL() {
        return dsVL;
    }
    public void setDsVL(ArrayList<VatLieu> dsVL) {
        this.dsVL = dsVL;
    }
    
    public void input(){
        System.out.print("Ma hang ? ");
        maHang = s.nextLine();
        System.out.print("Ten hang ? ");
        tenHang = s.nextLine();
        System.out.print("So luong ? ");
        soLuong = s.nextFloat();
        System.out.print("Don gia ? ");
        donGia = s.nextFloat();

        System.out.print("So luong vat lieu ? ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++){
            VatLieu vl = new VatLieu();
            vl.nhap();
            dsVL.add(vl);
        }
    }

    public void output(){
        System.out.println("Ma hang : " + maHang);
        System.out.println("Ten hang : " + tenHang);
        System.out.println("So luong : " + soLuong);
        System.out.println("Don gia : " + donGia);
        System.out.println("Tong tien : " + tongTien());

        for (VatLieu vl : dsVL){
            vl.xuat();
        }
    }

    public float tongTien(){
        return donGia * soLuong;
    }
}

package buoi6.btvn.bai3;

import java.util.Scanner;

public class HangHoaDienTu extends HangHoa{
    Scanner s = new Scanner(System.in);
    
    private int thoiGianBaoHanh;
    private int congSuat;
    
    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }
    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }
    public int getCongSuat() {
        return congSuat;
    }
    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public void input(){
        super.input();
        System.out.print("Thoi gian bao hanh ? ");
        thoiGianBaoHanh = s.nextInt();
        System.out.print("Cong suat ? ");
        congSuat = s.nextInt();
    }                          
    
    @Override
    public void output(){
        super.output();
        System.out.println("Thoi gian bao hanh : " + thoiGianBaoHanh);
        System.out.println("Cong suat : " + congSuat);
    }
}

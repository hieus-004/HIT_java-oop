package buoi4.btvn.bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SinhVien[] sinhViens = new SinhVien[5];

        for (int i = 0; i < 5; i++){
            Scanner s = new Scanner(System.in);
            System.out.print("Nhap msv: ");
            String maSinhVien = s.nextLine();
            System.out.print("Nhap ten: ");
            String hoTen = s.nextLine();
            System.out.print("Nhap diem toan: ");
            float diemToan = s.nextFloat();
            System.out.print("Nhap diem ly: ");
            float diemLy = s.nextFloat();
            System.out.print("Nhap diem hoa: ");
            float diemHoa = s.nextFloat();
            s.nextLine(); 

            sinhViens[i] = new SinhVien(maSinhVien, hoTen, diemToan, diemLy, diemHoa);
        }

        System.out.printf("%-10s%-30s%-20s%-20s%-20s%-20s\n", "MSV", "Ho va ten", "Diem toan", "Diem ly", "Diem hoa", "Diem TB");
        for (int i = 0; i < 5; i++){
            sinhViens[i].xuat();
        }
    }
}

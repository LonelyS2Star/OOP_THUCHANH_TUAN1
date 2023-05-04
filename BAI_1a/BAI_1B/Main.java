/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOPTUAN1.BAI_1a.BAI_1B;

/**
 *
 * @author Ngoc Nhi
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HangThucPham tp = new HangThucPham();
        boolean kt = true;
        boolean th = true;
        System.out.print("Nhập mã hàng : ");
        tp.setMaHang(scanner.nextInt());
        scanner.nextLine();
        do {
            System.out.print("Nhập tên hàng : ");
            tp.setTenHang(scanner.nextLine());
        } while (tp.kiemTraTenHang(kt));
        System.out.print("Nhập đơn giá : ");
      
        tp.setDonGia(scanner.nextDouble());
        do {
            System.out.print("Nhập năm,tháng,ngày sản xuất : ");
            tp.setNSX(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            System.out.print("nhập năm,tháng,ngày hết hạn : ");
            tp.setHSD(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        } while (tp.kiemTraNgay(th));
        System.out.println(tp);
        tp.kiemTraHSD();
    }
}
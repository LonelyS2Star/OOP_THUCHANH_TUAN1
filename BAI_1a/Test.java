/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOPTUAN1.BAI_1a;

/**
 *
 * @author Ngoc Nhi
 */
import java.util.Scanner;
public class Test {
static Scanner sc = new Scanner(System.in);
    static void nhapXe(Vehicle xe){          
            System.out.print("Nhap ten chu xe: ");
            xe.setChuXe(sc.nextLine());sc.nextLine();
            System.out.print("Nhap ten loai xe: ");
            xe.setLoaiXe(sc.nextLine());
            System.out.print("Nhap dung tich xe: ");
            xe.setDungTich(sc.nextInt());
            System.out.print("Nhap tri gia xe: ");
            xe.setTriGia(sc.nextDouble());sc.nextLine();
               }
    public static void main(String[] args) {
        Vehicle v[]= null;
        int a,n=0;
        boolean flag = true;
       
        do{
            System.out.println("Lua chon cong viec");
            System.out.println("1.Nhap thong tin va tao doi tuong xe1, xe2, xe3 \n"+
                    "2.Xuat ban ke khai tien thue truoc ba cua cac xe.\n"+
                    "Thoat");
            a =sc.nextInt();
            switch (a){
                case 1:
                    System.out.print("Nhap so luong xe ban muon khai bao thue: ");
                    n=sc.nextInt();
                    v= new Vehicle[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Xe thứ " + (i+1));
                        v[i] = new Vehicle();
                        nhapXe(v[i]);
                    }
                    break;
                case 2:
                    System.out.printf("%5s %5s %5s %10s %10s  \n","Ten chu xe","Loai xe","Dung tich","Trị giá","Thue phai nop");
                    for (int i = 0; i < n; i++) {
                        v[i].inThue();
                    }
                    break;
                default:
                    System.out.println("bye");
                    flag=false;
                    break;
            }
        }while (flag);
    }
}

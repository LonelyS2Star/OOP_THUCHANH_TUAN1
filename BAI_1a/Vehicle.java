/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOPTUAN1.BAI_1a;

/**
 *
 * @author Ngoc Nhi
 */
public class Vehicle {
    private String chuXe,loaiXe;
    private int dungTich;
    private double triGia;
      
    public Vehicle(int maXe, int dungTich, double triGia, String chuXe, String moTa) {
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
        this.chuXe = chuXe;
    }

    public Vehicle(){
    }

    public String getChuXe() {
        return chuXe;
    }

    public void setChuXe(String chuXe) {
        this.chuXe = chuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }
    
    public double tinhThue(){
        double thue;
        if(dungTich<100) thue=triGia*0.01;
        else if (dungTich >= 100 && dungTich<=200) thue = triGia * 0.03;
        else thue = triGia * 0.05;
        return thue;
    }
 
    @Override
    public String toString() {
        return chuXe + "-"+loaiXe + "-"+dungTich + "-"+triGia ;
}
  void inThue(){
        System.out.printf("%5d %5d %5d %10.2f %8.5f \n ",chuXe,loaiXe,dungTich,triGia,tinhThue());
    }
}

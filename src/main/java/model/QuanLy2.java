/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Quang Vinh
 */
public class QuanLy2 {
    private DuAn duan;
    private NhanVien nhanvien;
    private int ngay;

    public QuanLy2(DuAn duan, NhanVien nhanvien, int ngay) {
        this.duan = duan;
        this.nhanvien = nhanvien;
        this.ngay = ngay;
    }

    public DuAn getDuan() {
        return duan;
    }

    public void setDuan(DuAn duan) {
        this.duan = duan;
    }

    public NhanVien getNhanvien() {
        return nhanvien;
    }

    public void setNhanvien(NhanVien nhanvien) {
        this.nhanvien = nhanvien;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }
    public Object[] toObjects()
    {
        return new Object[]{duan.getId(), duan.getName(), nhanvien.getId(),nhanvien.getName(),ngay};
    }
}

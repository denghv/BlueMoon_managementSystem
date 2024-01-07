
package models;

import java.sql.Date;


public class HoKhau {
    String maHoKhau;
    String tenChuHo;
    String diaChiHoKhau;
    double dienTich;
    String chatLuongChungCu;
    Date ngayTao;
    Date ngaySua;

    public String getMaHoKhau() {
        return maHoKhau;
    }

    public void setMaHoKhau(String maHoKhau) {
        this.maHoKhau = maHoKhau;
    }

    public String getTenChuHo() {
        return tenChuHo;
    }

    public void setTenChuHo(String tenChuHo) {
        this.tenChuHo = tenChuHo;
    }

    public String getDiaChiHoKhau() {
        return diaChiHoKhau;
    }

    public void setDiaChiHoKhau(String diaChiHoKhau) {
        this.diaChiHoKhau = diaChiHoKhau;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public String getChatLuongChungCu() {
        return chatLuongChungCu;
    }

    public void setChatLuongChungCu(String chatLuongChungCu) {
        this.chatLuongChungCu = chatLuongChungCu;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgaySua() {
        return ngaySua;
    }

    public void setNgaySua(Date ngaySua) {
        this.ngaySua = ngaySua;
    }

    public HoKhau(String maHoKhau, String tenChuHo, String diaChiHoKhau, double dienTich, String chatLuongChungCu, Date ngayTao, Date ngaySua) {
        this.maHoKhau = maHoKhau;
        this.tenChuHo = tenChuHo;
        this.diaChiHoKhau = diaChiHoKhau;
        this.dienTich = dienTich;
        this.chatLuongChungCu = chatLuongChungCu;
        this.ngayTao = ngayTao;
        this.ngaySua = ngaySua;
    }
    
    
}

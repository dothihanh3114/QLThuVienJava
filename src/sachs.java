/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class sachs {
    String MaSach;
    private String TenSach;
    private String TacGia;
    private String TheLoai;
    private String SoLuong;
    private String TinhTrang;

    public sachs() {
    }

    public sachs(String MaSach, String TenSach, String TacGia, String TheLoai, String SoLuong, String TinhTrang) {
        this.MaSach = MaSach;
        this.TenSach = TenSach;
        this.TacGia = TacGia;
        this.TheLoai = TheLoai;
        this.SoLuong = SoLuong;
        this.TinhTrang = TinhTrang;
    }

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String TacGia) {
        this.TacGia = TacGia;
    }

    public String getTheLoai() {
        return TheLoai;
    }

    public void setTheLoai(String TheLoai) {
        this.TheLoai = TheLoai;
    }

    public String getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(String SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }
    
}




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class muonSach1 {
    String maSach;
    String maDG;   
    String ngaymuon;
    String ngayhentra;
    String ngaytra;
    String ttmuon ;

    public muonSach1(String maSach, String maDG, String ngaymuon, String ngayhentra, String ngaytra) {
        this.maSach = maSach;
        this.maDG = maDG;
        this.ngaymuon = ngaymuon;
        this.ngayhentra = ngayhentra;
        this.ngaytra = ngaytra;
    }

    public muonSach1(String maSach, String maDG, String ngaymuon, String ngayhentra, String ngaytra, String ttmuon) {
        this.maSach = maSach;
        this.maDG = maDG;
        this.ngaymuon = ngaymuon;
        this.ngayhentra = ngayhentra;
        this.ngaytra = ngaytra;
        this.ttmuon = ttmuon;
    }
     public muonSach1(String maSach, String maDG, String ngaymuon, String ngayhentra ) {
        this.maSach = maSach;
        this.maDG = maDG;
        this.ngaymuon = ngaymuon;
        this.ngayhentra = ngayhentra;
        
    }
      public muonSach1(String maSach, String maDG) {
        this.maSach = maSach;
        this.maDG = maDG;
    }
    public muonSach1() {
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getMaDG() {
        return maDG;
    }

    public void setMaDG(String maDG) {
        this.maDG = maDG;
    }

    public String getNgaymuon() {
        return ngaymuon;
    }

    public void setNgaymuon(String ngaymuon) {
        this.ngaymuon = ngaymuon;
    }

    public String getNgayhentra() {
        return ngayhentra;
    }

    public void setNgayhentra(String ngayhentra) {
        this.ngayhentra = ngayhentra;
    }

    public String getNgaytra() {
        return ngaytra;
    }

    public void setNgaytra(String ngaytra) {
        this.ngaytra = ngaytra;
    }

    public String getTtmuon() {
        return ttmuon;
    }

    public void setTtmuon(String ttmuon) {
        this.ttmuon = ttmuon;
    }
    
}

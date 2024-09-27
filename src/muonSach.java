
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class muonSach {
    String maSach;
    String maDG;   
    Date ngaymuon;
    Date ngayhentra;
    Date ngaytra;
    String ttmuon = "ChuaTra";

    public muonSach() {
    }

    public muonSach(String maSach, String maDG) {
        this.maSach = maSach;
        this.maDG = maDG;
        
    }

   

    
    
    public muonSach(String maSach, String maDG, String ngaymuon, String ngayhentra, String ngaytra, String ttmuon) {
        this.maSach = maSach;
        this.maDG = maDG;
        setNgaymuon(ngaymuon);
        setNgayhentra(ngayhentra);
        setNgaytra(ngaytra);
        this.ttmuon = ttmuon;
    }
    public muonSach(String maSach, String maDG, String ngaymuon, String ngayhentra) {
        this.maSach = maSach;
        this.maDG = maDG;
        setNgaymuon(ngaymuon);
        setNgayhentra(ngayhentra);       
        
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

    public Date getNgaymuon() {
        return ngaymuon;
    }

    public void setNgaymuon(String ngaymuon) {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try{
            this.ngaymuon = df.parse(ngaymuon);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        
    }

    public Date getNgayhentra() {
        return ngayhentra;
    }

    public void setNgayhentra(String ngayhentra) {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try{
            this.ngayhentra = df.parse(ngayhentra);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        
    }

    public Date getNgaytra() {
        return ngaytra;
    }

    public void setNgaytra(String ngaytra) {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        if(!ngaytra.isEmpty()){
            try{
            this.ngaytra = df.parse(ngaytra);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        }
        
       
    }

    public String getTtmuon() {
        return ttmuon;
    }

    public void setTtmuon(String ttmuon) {
        this.ttmuon = ttmuon;
    }
    
}

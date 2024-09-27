
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author DELL
 */
public class capNhatMS implements interfaceMS{

    String userName = "sa";
    String password = "hanh789";
    String url = "jdbc:sqlserver://localhost:1433;databaseName=QLTV_BT";
    Connection conn;

    @Override
    public int capNhatmuonSach(muonSach1 ms) {
        try {
            Connection conn = DriverManager.getConnection(url, userName, password);
            String sql = "INSERT INTO QLyMuonSach (MaDocGia, MaSach, NgayMuon, NgayHenTra, NgayTra, TTMuon) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, ms.getMaDG());
                pstmt.setString(2, ms.getMaSach());
                pstmt.setString(3, ms.getNgaymuon());
                pstmt.setString(4, ms.getNgayhentra());
                pstmt.setString(5, ms.getNgaytra());
                pstmt.setString(6, ms.getTtmuon());
                return pstmt.executeUpdate();
            
        }catch (SQLServerException ex) {
            System.out.println("Lỗi 1:" + ex);
        } catch (Exception e) {
            System.out.println("Lỗi 2:" + e);
        }

        return -1;
    }

    @Override
    public int updateRegisterBookSQL(muonSach1 ms, String maSach, String maDG) {
        try {
            Connection conn = DriverManager.getConnection(url, userName, password);
            String sql = "Update QLyMuonSach SET MaDocGia = ?, MaSach = ? , NgayMuon = ?,"
                    + "NgayHenTra = ?, NgayTra = ? , TTMuon = ? , "
                    + " WHERE MaDocGia = ? AND MaSach = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, ms.getMaDG());
                pstmt.setString(2, ms.getMaSach());
                pstmt.setString(3, ms.getNgaymuon());
                pstmt.setString(4, ms.getNgayhentra());
                pstmt.setString(5, ms.getNgaytra());
                pstmt.setString(6, ms.getTtmuon());
                return pstmt.executeUpdate();
            
        }catch (SQLServerException ex) {
            System.out.println("Lỗi 1:" + ex);
        } catch (Exception e) {
            System.out.println("Lỗi 2:" + e);
        }

        return -1;
    }

    @Override
    public int updatebook(sachs b) {
        try {
            Connection conn = DriverManager.getConnection(url, userName, password);
            var sql = "UPDATE book SET TenSach = ? , TheLoai = ?,"
                    + " TacGia = ?, SoLuong = ? , TinhTrang  = ? WHERE MaSach = ?";
            var ps = conn.prepareStatement(sql);
            ps.setString(1, b.getTenSach());
            ps.setString(2, b.getTheLoai());
            ps.setString(3, b.getTacGia());
            ps.setString(4, b.getSoLuong());
            ps.setString(5, b.getTinhTrang());            
            ps.setString(6, b.getMaSach());
            int result = ps.executeUpdate();

        } catch (SQLServerException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }
 
    
    
    

   
}

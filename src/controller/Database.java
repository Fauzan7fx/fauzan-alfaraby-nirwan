/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Pendaftar;
import model.Mahasiswa;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.Arrays;
/**
 *
 * @author fauzanalfaraby
 */
public class Database implements Serializable {
    
    public static Database instance;
    
    private final String DB_TYPE = "mysql";
    private final String DB_HOST = "localhost";
    private final String DB_PORT = "3306";
    private final String DB_NAME = "projekpbo";
    private final String DB_USER = "root";
    private final String DB_PASS = "";

    private Database(){
    }
    
    public static synchronized Database getInstance(){
        if (instance == null){
            instance = new Database();
        }
        return instance;
    }
    
    private Connection getConnection() throws SQLException{
        return DriverManager.getConnection("jdbc:"+DB_TYPE+"://"+DB_HOST+":"+DB_PORT+"/"+DB_NAME,DB_USER,DB_PASS);
    }
    
    public void insertPendaftar(Pendaftar pendaftar) throws SQLException{
    Connection conn = getConnection();
        try{
            String sql = "INSERT INTO pendaftar VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, pendaftar.getNamaKegiatan());
            pstmt.setString(2, pendaftar.getNim());
            pstmt.setString(3, pendaftar.getNama());
            pstmt.setString(4, pendaftar.getJk());
            pstmt.setString(5, pendaftar.getTingkat());
            pstmt.setString(6, pendaftar.getAlamat());
            pstmt.setString(7, pendaftar.getEmail());
            pstmt.setString(8, pendaftar.getTlpn());
//            pstmt.setString(9, pendaftar.getTtl());
            int rowsInserted = pstmt.executeUpdate();
            
            if (rowsInserted > 0) {
                System.out.println("Insert data berhasil!");
            } else {
                System.out.println("Gagal menginsert data");
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }finally{
            if(conn!=null){
                conn.close();
            }
        }
    }
    
    public void insertAnggotaUKM(Mahasiswa mahasiswa) throws SQLException{
        Connection conn = getConnection();
        
        try{
            String sql ="INSERT INTO anggota VALUES (?,?,?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, mahasiswa.getNim());
            pstmt.setString(2, mahasiswa.getNama());
            pstmt.setString(3, mahasiswa.getKelas());
            pstmt.setString(4, mahasiswa.getAlamat());
            pstmt.setString(5, mahasiswa.getEmail());
            pstmt.setString(6, mahasiswa.getTlpn());
            pstmt.setString(7, mahasiswa.getTempatLahir());
//            pstmt.setString(8, mahasiswa.getTanggalLahir());
            pstmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            if(conn!=null){
                conn.close();
            }
        }
    }
    
    public List<Mahasiswa> getListMahasiswa() throws SQLException{
        List<Mahasiswa> mhsList = new ArrayList<>();
        Connection conn = getConnection();
        try{
            String sql = "SELECT * FROM anggota";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNim(rs.getString("nim"));
                mhs.setNama(rs.getString("nama"));
                mhs.setKelas(rs.getString("kelas"));
                mhs.setAlamat(rs.getString("alamat"));
                mhs.setEmail(rs.getString("email"));
                mhs.setTlpn(rs.getString("tlpn"));
                mhs.setTempatLahir(rs.getString("tempat_lahir"));
//                mhs.setTanggalLahir(rs.getString("tanggal_lahir"));
                
                mhsList.add(mhs);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            if (conn!=null){
            conn.close();
            }
        }
        return mhsList;
    }
    
    public List<Pendaftar> getListPendaftar() throws SQLException{
        List<Pendaftar> pfrList = new ArrayList<>();
        Connection conn = getConnection();
        
        try{
            String sql = "SELECT * FROM pendaftar";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Pendaftar pfr = new Pendaftar();
                pfr.setNamaKegiatan(rs.getString("nama_kegiatan"));
                pfr.setNim(rs.getString("nim"));
                pfr.setNama(rs.getString("nama"));
                pfr.setJk(rs.getString("jeniskelamin"));
                pfr.setTingkat(rs.getString("tingkat"));
                pfr.setAlamat(rs.getString("alamat"));
                pfr.setEmail(rs.getString("email"));
                pfr.setTlpn(rs.getString("tlpn"));
//                pfr.setTtl(rs.getString("ttl"));
                
                pfrList.add(pfr);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            if (conn!=null){
            conn.close();
            }
        }
        return pfrList;
    }
    
    public void updateMahasiswa(Mahasiswa mahasiswa, String nim) throws SQLException{
        Connection conn = getConnection();
        try{
            String sql = "UPDATE anggota SET nim=?,nama=?,kelas=?,alamat=?,email=?,tlpn=?,tempat_lahir=? WHERE nim=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, mahasiswa.getNim());
            pstmt.setString(2, mahasiswa.getNama());
            pstmt.setString(3, mahasiswa.getKelas());
            pstmt.setString(4, mahasiswa.getAlamat());
            pstmt.setString(5, mahasiswa.getEmail());
            pstmt.setString(6, mahasiswa.getTlpn());
            pstmt.setString(7, mahasiswa.getTempatLahir());
            pstmt.setString(8, nim); // Specify the original nim value as the WHERE condition
            
            pstmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            if(conn!=null){
                conn.close();
            }
        }
    }
    
    public void deteleMahasiswa(String nim) throws SQLException{
        Connection conn = getConnection();
        try{
            String sql = "DELETE FROM anggota WHERE nim = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nim);
            pstmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            if(conn!=null){
                conn.close();
            }
        }
    }
    
    public void deletePendaftar(String nim) throws SQLException{
        Connection conn = getConnection();
        try{
            String sql = "DELETE FROM pendaftar WHERE nim = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nim);
            pstmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            if(conn!=null){
                conn.close();
            }
        }
    }
}

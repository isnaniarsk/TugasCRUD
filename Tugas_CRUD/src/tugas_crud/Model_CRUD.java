/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_crud;

/**
 *
 * @author ASUS
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class Model_CRUD {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/data_buku";
    static final String USER = "root";
    static final String PASS = "";
    
    Connection koneksi;
    Statement statement;
    
    public Model_CRUD() {
        try{
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Koneksi Berhasil");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal");
        }
    }
    
    public void insertBuku(String id, String judul, String tipe, String episode, String genre, String status, String rating ){
        try {
            String query = " INSERT INTO `buku`(`ID`,`judul`,`tipe`,`episode`,`genre`,`status`,`rating`) VALUES ('"+id+"','"+judul+"','"+tipe+"','"+episode+"','"+genre+"','"+status+"','"+rating+"')";
            statement = (Statement) koneksi.createStatement(); 
            statement.executeUpdate(query);
            System.out.println("Berhasil Ditambahkan");
            JOptionPane.showMessageDialog(null,"Data Berhasil Ditambah");
            
        }
        catch(Exception sql){
            System.out.println(sql.getMessage());
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
    public String[][] readBuku(){
        try{
            int jmlData = 0;
            String data[][] = new String[getBanyakData()][7];
            String query = "SELECT * FROM `buku`";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                data[jmlData][0] = resultSet.getString("ID");
                data[jmlData][1] = resultSet.getString("Judul");
                data[jmlData][2] = resultSet.getString("Tipe");
                data[jmlData][3] = resultSet.getString("Episode");
                data[jmlData][4] = resultSet.getString("Genre");
                data[jmlData][5] = resultSet.getString("Status");
                data[jmlData][6] = resultSet.getString("Rating");
                jmlData++;
            } return data;
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
    public int getBanyakData(){
        int jmlData = 0;
        try{
            statement = koneksi.createStatement();
            String query = "SELECT * FROM `buku`";
            ResultSet resultSet =  statement.executeQuery(query);
            while(resultSet.next()){
                jmlData++;
            } return jmlData;
            
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
    
    public void deleteBuku(String id){
        try{
            String query = "DELETE FROM `buku` WHERE `ID` = '"+id+"'";
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil dihapus");
        }
        catch(SQLException sql){
            System.out.println(sql.getMessage());
        }
    }
    
    public void updateBuku(String id, String judul, String tipe, String episode, String genre, String status, String rating){
        String query = "UPDATE `buku` SET `ID`='"+id+"',`judul`='"+judul+"', `tipe`='"+tipe+"', `episode`='"+episode+"',`genre`='"+genre+"',`status`='"+status+"',`rating`='"+rating+"'";
        try{
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data berhasil diubah!");  
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}

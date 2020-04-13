/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_crud;

/**
 *
 * @author ASUS
 */import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

public class View_CRUD extends JFrame {
    JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;
    Object namaKolom[] = {"ID","Judul","Tipe","Episode","Genre","Status","Rating"};
    JLabel lID = new JLabel(" ID : ");
    JTextField tfID = new JTextField();
    JLabel lJudul = new JLabel(" Judul : ");
    JTextField tfJudul = new JTextField();
    JLabel lTipe = new JLabel (" Tipe : ");
    JTextField tfTipe = new JTextField();
    JLabel lStatus = new JLabel (" Status ");
        String[] jenisStatus =
        {"Pilih Status", "Belum Selesai", "Selesai"};
    JComboBox cmbStatus = new JComboBox(jenisStatus);
    JLabel lEpisode = new JLabel (" Episode : ");
    JTextField tfEpisode = new JTextField();
    JLabel lRating = new JLabel (" Rating : ");
    JTextField tfRating = new JTextField();
    JLabel lGenre = new JLabel (" Genre : ");
    JTextField tfGenre = new JTextField();
    JTextField tfCari = new JTextField();
    JButton btnSearchPanel = new JButton(" SEARCH ");
    JButton btnRefreshPanel = new JButton(" REFRESH ");
    JButton btnCreatePanel = new JButton (" CREATE ");
    JButton btnUpdatePanel = new JButton (" UPDATE ");
    JButton btnDeletePanel = new JButton (" DELETE ");
    JButton btnExitPanel = new JButton (" EXIT ");
   
    
    public View_CRUD(){
        tableModel = new DefaultTableModel(namaKolom,0);
        tabel = new JTable (tableModel);
        scrollPane = new JScrollPane(tabel);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(900,500);
        add(scrollPane);
        scrollPane.setBounds(20,20,750,180);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        add(lID);
        lID.setBounds(20,210,40,20);
        add(tfID);
        tfID.setBounds(20,230,40,20);
        add(lJudul);
        lJudul.setBounds(20,250,60,20);
        add(tfJudul);
        tfJudul.setBounds(20,270,100,20);
        add(lTipe);
        lTipe.setBounds(20,290,40,20);
        add(tfTipe);
        tfTipe.setBounds(20,310,100,20);
        add(lEpisode);
        lEpisode.setBounds(150,290,100,20);
        add(tfEpisode);
        tfEpisode.setBounds(150,310,100,20);
        add(lStatus);
        lStatus.setBounds(150,330,100,20);
        add(cmbStatus);
        cmbStatus.setBounds(150,350,100,20);
        add(lRating);
        lRating.setBounds(20,330,60,20);
        add(tfRating);
        tfRating.setBounds(20,350,100,20);
        add(lGenre);
        lGenre.setBounds(20,370,100,20);
        add(tfGenre);
        tfGenre.setBounds(20,390,300,20);
        add(tfCari);
        tfCari.setBounds(350,270,380,20);
        add(btnSearchPanel);
        btnSearchPanel.setBounds(750,270,100,20);
        add(btnRefreshPanel);
        btnRefreshPanel.setBounds(350,390,100,20);
        add(btnCreatePanel);
        btnCreatePanel.setBounds(450,390,100,20);
        add(btnUpdatePanel);
        btnUpdatePanel.setBounds(550,390,100,20);
        add(btnDeletePanel);
        btnDeletePanel.setBounds(650,390,100,20);
        add(btnExitPanel);
        btnExitPanel.setBounds(750,390,100,20);
        setVisible(true);
    }
   
    public String getID(){
        return tfID.getText();
    }
    public String getJudul(){
        return tfJudul.getText();
    }
    public String getTipe(){
        return tfTipe.getText();
    }
    public String getEpisode(){
        return tfEpisode.getText();
    }
    public String getGenre(){
        return tfGenre.getText();
    }
    public String getStatus(){
        return cmbStatus.getSelectedItem().toString();
    }
    public String getRating(){
        return tfRating.getText();
    }
        
}

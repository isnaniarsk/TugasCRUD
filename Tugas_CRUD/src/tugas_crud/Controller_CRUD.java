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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
public class Controller_CRUD {
    Model_CRUD modelCRUD;
    View_CRUD viewCRUD;
    
    public Controller_CRUD(Model_CRUD modelCRUD, View_CRUD viewCRUD){
        this.modelCRUD = modelCRUD;
        this.viewCRUD = viewCRUD;
        
        if(modelCRUD.getBanyakData()!=0){
            String dataBuku[][] = modelCRUD.readBuku();
            viewCRUD.tabel.setModel((new JTable(dataBuku, viewCRUD.namaKolom)).getModel());
        }
        else{
            JOptionPane.showMessageDialog(null, "Data Tidak Ada!");
        }
        
        
        viewCRUD.btnCreatePanel.addActionListener((ActionEvent e)-> {
            if(viewCRUD.getID().equals("")||viewCRUD.getJudul().equals("")||viewCRUD.getTipe().equals("")||viewCRUD.getEpisode().equals("")||viewCRUD.getGenre().equals("")||viewCRUD.getStatus().equals("")||viewCRUD.getRating().equals("")){
                JOptionPane.showMessageDialog(null, "Field Tidak Boleh Kosong");
            }
            else{
                String id = viewCRUD.getID();
                String judul = viewCRUD.getJudul();
                String tipe = viewCRUD.getTipe();
                String episode = viewCRUD.getEpisode();
                String genre = viewCRUD.getGenre();
                String status = viewCRUD.getStatus();
                String rating = viewCRUD.getRating();
                modelCRUD.insertBuku(id, judul, tipe, episode, genre, status, rating);
                viewCRUD.tfID.setText("");
                viewCRUD.tfJudul.setText("");
                viewCRUD.tfTipe.setText("");
                viewCRUD.tfEpisode.setText("");
                viewCRUD.tfGenre.setText("");
                viewCRUD.cmbStatus.setSelectedItem("");
                viewCRUD.tfRating.setText("");
                
                String dataBuku[][] = modelCRUD.readBuku();
                viewCRUD.tabel.setModel(new JTable(dataBuku, viewCRUD.namaKolom).getModel());
                
            }
        });
        viewCRUD.btnRefreshPanel.addActionListener((ActionEvent e) -> {
            viewCRUD.tfID.setText("");
            viewCRUD.tfJudul.setText("");
            viewCRUD.tfTipe.setText("");
            viewCRUD.tfEpisode.setText("");
            viewCRUD.tfGenre.setText("");
            viewCRUD.cmbStatus.setSelectedItem("");
            viewCRUD.tfRating.setText("");
        });
        
        viewCRUD.btnUpdatePanel.addActionListener((ActionEvent e)->{
                String id = viewCRUD.getID();
                String judul = viewCRUD.getJudul();
                String tipe = viewCRUD.getTipe();
                String episode = viewCRUD.getEpisode();
                String genre = viewCRUD.getGenre();
                String status = viewCRUD.getStatus();
                String rating = viewCRUD.getRating();
                
                int baris = viewCRUD.tabel.getSelectedRow();
                int kolom = viewCRUD.tabel.getSelectedColumn();
                String dataterpilih = viewCRUD.tabel.getValueAt(baris, 2).toString();
                modelCRUD.updateBuku(id, judul, tipe, episode, genre, status, rating);
                String dataBuku[][] = modelCRUD.readBuku();
                viewCRUD.tabel.setModel(new JTable(dataBuku, viewCRUD.namaKolom).getModel());
        });
        
        viewCRUD.btnDeletePanel.addActionListener((ActionEvent e) -> {
           
                int baris = viewCRUD.tabel.getSelectedRow();
                int kolom = viewCRUD.tabel.getSelectedColumn();
                String dataterpilih = viewCRUD.tabel.getValueAt(baris, 0).toString();
                
                System.out.println(dataterpilih);
                
                int input = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin menghapus Film ID "+dataterpilih+ "?"," Pilih Opsi...", JOptionPane.YES_NO_CANCEL_OPTION);
                
                if(input==0){
                    modelCRUD.deleteBuku(dataterpilih);
                    String dataBuku[][] = modelCRUD.readBuku();
                    viewCRUD.tabel.setModel(new JTable(dataBuku, viewCRUD.namaKolom).getModel());
                }
                else{
                    JOptionPane.showMessageDialog(null, "Tidak Jadi Hapus");
                }
        });
        
        viewCRUD.btnExitPanel.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Login login = new Login();
        }
    });
        
    }
}


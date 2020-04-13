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
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class Tugas_CRUD {

    public static void main(String[] args) {
        Login login = new Login();
    }
    
}

class Login extends JFrame {
   final JTextField fUsername = new JTextField(10);
   final JPasswordField fPassword = new JPasswordField(10);
   
   JLabel lTitle = new JLabel(" LOGIN ADMIN ");
   JLabel lUsername = new JLabel(" Username ");
   JLabel lPassword = new JLabel(" Password ");
   
   JButton btnLogin = new JButton(" LOGIN ");

        Login() {
	setTitle("LOGIN ADMIN");
	setSize(350,250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(null);
        
        add(lTitle);
	add(lUsername);
	add(fUsername);
        add(lPassword);
	add(fPassword);
	add(btnLogin);  
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = fUsername.getText();
                String password = fPassword.getText();
                
                if(username.equals("isnaniar") && password.equals("00000")){
                    MVC_CRUD mvc = new MVC_CRUD();
                }
                else{
                    JOptionPane.showMessageDialog(null, "LOGIN FAILED");
                }
            }
        });
        setVisible(true);
        lTitle.setBounds(150,20,140,20);
	lUsername.setBounds(10,50,120,20);
	fUsername.setBounds(130,50,150,20);
	lPassword.setBounds(10,80,120,20);
	fPassword.setBounds(130,80,150,20);
	btnLogin.setBounds(100,120,120,20);
	
   }
}

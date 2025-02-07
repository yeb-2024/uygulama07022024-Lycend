package org.example.Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class LoginScreen extends JFrame implements ActionListener {

  List<Users> usersList = new ArrayList<>();

  JPanel profilePanel = new JPanel(new BorderLayout());
  JPanel loginPanel = new JPanel(new GridLayout(2, 2));





  JTextArea userArea = new JTextArea();
  JTextArea passArea = new JTextArea();


  JButton btnn = new JButton("Giris Yap");
  JButton close = new JButton("Kapat");

  JLabel userLabel = new JLabel("");
  JLabel imageLabel = new JLabel("");
  JLabel cvLabel = new JLabel("");


  LoginScreen(){
    usersAdd();
    setSize(500,500);
    setLayout(new GridLayout(2, 1,50,50));
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    btnn.addActionListener(this);
    close.addActionListener(e -> this.dispose());

    userArea.setSize(100,50);
    passArea.setSize(100,50);

    profilePanel.setPreferredSize(new Dimension(500,250));
    profilePanel.add(userLabel,BorderLayout.NORTH);
    profilePanel.add(imageLabel,BorderLayout.CENTER);
    profilePanel.add(cvLabel,BorderLayout.SOUTH);

    loginPanel.setPreferredSize(new Dimension(500,250));
    loginPanel.add(userArea);
    loginPanel.add(passArea);
    loginPanel.add(btnn);
    loginPanel.add(close);

    this.add(profilePanel);
    this.add(loginPanel);

    setVisible(true);
  }



  private void usersAdd(){
    usersList.add(new Users("Sevban Blc","blc19","images.png","Devoloper, Fullstack"));
    usersList.add(new Users("Bedirhan","bedo61","images.png","Devoloper, Fullstack"));
    usersList.add(new Users("Sulo","sulo1903","images.png","Devoloper, Fullstack"));
    usersList.add(new Users("Seyfo","seyf43","images.png","Devoloper, Fullstack"));
    usersList.add(new Users("Apo","apo58","images.png","Devoloper, TrashStack"));
  }

  private ImageIcon resizeImage(String image){
    ImageIcon icon = new ImageIcon(image);
    Image img = icon.getImage();
    Image newimg = img.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH);
    ImageIcon newIcon = new ImageIcon(newimg);
    return newIcon;
  }

  @Override
  public void actionPerformed(ActionEvent e) {

    if (e.getSource() == btnn) {
      String username = userArea.getText();
      String password = passArea.getText();
      Boolean isLogin = false;
      for (Users user : usersList) {
        if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
          userLabel.setVisible(true);
          imageLabel.setVisible(true);
          cvLabel.setVisible(true);
          userLabel.setText(user.getUsername());
          imageLabel.setIcon(resizeImage(user.getProfileImage()));
          cvLabel.setText(user.getCv());

          isLogin = true;
        }

      }
      if (!isLogin) {
        this.dispose();
      }
    }
  }
}

package org.example.Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreen extends JFrame implements ActionListener {

  JButton btn = new JButton("Giris Yap");


  MainScreen(){
    setSize(500,500);

    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new BorderLayout());
    JLabel label = new JLabel("Hos Geldiniz");
    label.setFont(new Font("Arial", Font.BOLD, 20));
    add(label, BorderLayout.NORTH);

    btn.setSize(100,100);
    btn.addActionListener(this);
    this.add(btn,BorderLayout.SOUTH);
    setVisible(true);
  }
  @Override
  public void actionPerformed(ActionEvent e) {

    if (e.getSource() == btn) {
      this.dispose();
      LoginScreen loginScreen = new LoginScreen();
    }
  }
}

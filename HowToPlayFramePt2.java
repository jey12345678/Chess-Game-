/**
 * HowFrame
 * @author Jayden Chuong
 * @date 19/1/2020
 * @ICS-4U1
 */ 
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class HowToPlayFramePt2 extends JFrame implements ShootingGameConstants {
  
  //variables and constants
  private int HOW_W = 1200;
  private int HOW_H = 680;
  
  
  //---------------------CUSTOM COLOURS---------------------------------------
  
  //constructor - this runs first
  HowToPlayFramePt2() {
    this.setSize(HOW_W, HOW_H);
    
    // initializing howPanel
    JPanel howPanel= new JPanel();    
    howPanel.setLayout(null);
    
    //create a JButton for the panel
    JButton backButton = new JButton("BACK");
    
    //attach a listener to the button
    backButton.addActionListener(new GoBackListener(this));
    
    JLabel barrierLabel = new JLabel("BARRIERS",SwingConstants.CENTER);
    barrierLabel.setFont(subTitleFont);
    barrierLabel.setBackground(lightGreen);
    barrierLabel.setForeground(darkGreen);
    barrierLabel.setBounds(0,0,500,50);
    barrierLabel.setOpaque(true);
    
    JTextArea barrierInfoTextArea = new JTextArea("1.Leaf Barriers are found in the forest biome and are the weakest.\n 2.Snow Barriers are found in the snow biome and are the second strongest. \n3.Cactus barriers are the third strongest and if you hit it with your fist it damages you.\n 4. Magma barriers are the strongest barrier and they are found in the lava biome.");
    barrierInfoTextArea.setFont(font);
    barrierInfoTextArea.setBackground(lightGreen);
    barrierInfoTextArea.setForeground(darkGreen);
    barrierInfoTextArea.setEditable(false);
    barrierInfoTextArea.setLineWrap(true);
    barrierInfoTextArea.setBounds(0,60,1200,150);
    
    JLabel potionsLabel  = new JLabel("POTIONS");
    potionsLabel.setFont(subTitleFont);
    potionsLabel.setBackground(lightGreen);
    potionsLabel.setForeground(darkGreen);
    potionsLabel.setBounds(0,220,500,50);
    potionsLabel.setOpaque(true);
    
    JTextArea potionsTextArea = new JTextArea("1.Swiftness potions"+"2.Strength Potions"+ "3.Fire Resistance Potion"+ "4.Special 
    
    
    
    
    
    
    //add all to the panel
    howPanel.add(barrierLabel);
    howPanel.add(barrierInfoTextArea);
    howPanel.add(potionsLabel);
    howPanel.add(backButton);
    howPanel.setBackground(yellow);
    
    
    //add the panel to the frame
    this.add(howPanel);
    this.requestFocusInWindow();      //make this window the active window
    this.setVisible(true);
  }
}  
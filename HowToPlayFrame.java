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


public class HowToPlayFrame extends JFrame implements ChessGameConstants {
  
  //variables and constants
  private int HOW_W = 1200;
  private int HOW_H = 800;
  
  
  //---------------------CUSTOM COLOURS---------------------------------------
  
  //constructor - this runs first
  HowToPlayFrame() {
    
    super("CHESS GAME");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(HOW_W, HOW_H);
    this.setResizable(false); 
    this.setLocationRelativeTo(null); //start the frame in the center of the screen
    
    // initializing howPanel
    JPanel howPanel= new JPanel();    
    howPanel.setLayout(null);

    JLabel howToPlayTitle = new JLabel("HOW TO PLAY",SwingConstants.CENTER);
    howToPlayTitle.setFont(titleFont);
    howToPlayTitle.setBackground(grey);
    howToPlayTitle.setForeground(Color.WHITE);
    howToPlayTitle.setBounds(450,0,400,65);
    howToPlayTitle.setBorder(BorderFactory.createLineBorder(Color.BLACK,10));
    howToPlayTitle.setOpaque(true);
    
    JLabel movementLabel = new JLabel("CHESS PIECES MOVEMENT",SwingConstants.CENTER);
    movementLabel.setFont(titleFont);
    movementLabel.setBackground(grey);
    movementLabel.setForeground(Color.WHITE);
    movementLabel.setBounds(0,80,500,50);
    movementLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK,10));
    movementLabel.setOpaque(true);
    
    //text areas
    JTextArea chessPieceTextArea = new JTextArea("1.ROOKS - MOVE UP AND DOWN, AND SIDE TO SIDE \n2.BISHOPS - MOVES DIAGONALLY IN ANY DIRECTION\n3.KING - MOVES IN ANY DIRECTION ONLY ONE TILE\n4.QUEEN - MOVES UP, DOWN, SIDE TO SIDE, AND DIAGONALLY\n5.KNIGHT - MOVES IN AN L SHAPE.\n6.PAWN - MOVES ONLY ONE OR TWO TILES FORWARDS WHEN IT MOVES FOR THE FIRST TIME, BUT OTHER THAN THAT MOVES FORWARDS ONLY ONE TILE.\nIT ATTACKS DIAGONALLY BY ONE SPACE.\n IF A PAWN REACHES THE END OF THE BOARD IT GETS PROMOTED TO ANY PIECE THAT YOU WANT OTHER THAN THE KING.");
    chessPieceTextArea.setFont(font);
    chessPieceTextArea.setBackground(grey);
    chessPieceTextArea.setForeground(Color.WHITE);
    chessPieceTextArea.setEditable(false);
    chessPieceTextArea.setLineWrap(true);
    chessPieceTextArea.setBounds(0,140,1200,160);
    
    JLabel howToWinLabel = new JLabel("HOW TO WIN",SwingConstants.CENTER);
    howToWinLabel.setFont(titleFont);
    howToWinLabel.setBackground(grey);
    howToWinLabel.setForeground(Color.WHITE);
    howToWinLabel.setBounds(0,310,500,50);
    howToWinLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK,10));
    howToWinLabel.setOpaque(true);
    
    JTextArea howToWinTextArea = new JTextArea("*CHECK - WHEN YOUR OPPONENT'S PIECE IS ATTACKING YOUR PIECE. FOR EXAMPLE, IF YOUR OPPONENT'S QUEEN IS IN FRONT OF YOUR KING,\nWITH NO PIECES IN BETWEEN THEM, ITS CONSIDERED TO BE A CHECK.\n IF YOUR OPPONENT PUT YOU INTO A CHECK, YOU MUST PROTECT YOUR KING AT ALL COSTS!\n TO WIN - GET A CHECKMATE ON THE KING OF THE OPPOSING PLAYER! THIS MEANS THAT THE KING CANNOT MOVE ANYWHERE ELSE ON THE BOARD OR \n ELSE IT WILL BE ATTACKED BY YOUR OPPONENT'S PIECES.");
    howToWinTextArea.setFont(font);
    howToWinTextArea.setBackground(grey);
    howToWinTextArea.setForeground(Color.WHITE);
    howToWinTextArea.setEditable(false);
    howToWinTextArea.setLineWrap(true);
    howToWinTextArea.setBounds(0,370,1200,100);
    
    JLabel otherSpecialRules = new JLabel("OTHER SPECIAL RULES",SwingConstants.CENTER);
    otherSpecialRules.setFont(titleFont);
    otherSpecialRules.setBackground(grey);
    otherSpecialRules.setForeground(Color.WHITE);
    otherSpecialRules.setBounds(0,480,500,50);
    otherSpecialRules.setBorder(BorderFactory.createLineBorder(Color.BLACK,10));
    otherSpecialRules.setOpaque(true);
    
    JTextArea otherSpecialRulesTextArea = new JTextArea("1.STALEMATE - WHEN ONE OF THE PLAYERS CAN ONLY MOVE HIS/HER KING AND HE/SHE CANNOT MOVE THE KING ANYWHERE ELSE ON THE BOARD OR ELSE ITS A CHECK.\n2.PROMOTION - IF A PAWN REACHES THE END OF THE OPPONENT'S SIDE OF THE BOARD IT GETS PROMOTED TO ANY PIECE THAT YOU WANT OTHER THAN THE KING.\n3.TWO KINGS CANNOT BE BESIDE EACH OTHER.");
    otherSpecialRulesTextArea.setFont(font);
    otherSpecialRulesTextArea.setBackground(grey);
    otherSpecialRulesTextArea.setForeground(Color.WHITE);
    otherSpecialRulesTextArea.setEditable(false);
    otherSpecialRulesTextArea.setLineWrap(true);
    otherSpecialRulesTextArea.setBounds(0,540,1200,100);
    
    //create a JButton for the panel
    JButton backButton = new JButton("BACK");
    backButton.setFont(font);
    backButton.setBackground(Color.BLACK);
    backButton.setForeground(Color.WHITE);
    backButton.setOpaque(true);
    backButton.addActionListener(new GoBackListener(this));
    backButton.setBounds(1100,0,100,50);
    
    //add all to the panel
    howPanel.add(howToPlayTitle);
    howPanel.add(movementLabel);
    howPanel.add(chessPieceTextArea);
    howPanel.add(howToWinLabel);
    howPanel.add(howToWinTextArea);
    howPanel.add(otherSpecialRules);
    howPanel.add(otherSpecialRulesTextArea);
    howPanel.add(backButton);
    howPanel.setBackground(Color.WHITE);
    
    
    //add the panel to the frame
    this.add(howPanel);
    this.requestFocusInWindow();      //make this window the active window
    this.setVisible(true);
  }
}  

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Graphics;

public class ChessGameFrame extends JFrame implements ChessGameConstants {
  
  //In Game Screen Width and Height
  private int CHESS_GAME_WIDTH = 600;
  private int CHESS_GAME_HEIGHT = 600;
  int x = 0;
  int y = 0;
  Dimension dimension =  new Dimension(50,50);
  boolean colourDecider = false;
  Tile [][] chessBoard = new Tile [8][8];
  
    //constructor - this runs first
  public ChessGameFrame(){
    super("CHESS GAME");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(CHESS_GAME_WIDTH,CHESS_GAME_HEIGHT);
    this.setResizable(false); 
    this.setLocationRelativeTo(null); //start the frame in the center of the screen
    
    // initializing howPanel
    ChessGamePanel inGamePanel = new ChessGamePanel(this);    
    inGamePanel.setLayout(null);
    
    //add the panel to the frame
    this.add(inGamePanel);
    this.requestFocusInWindow();      //make this window the active window
    this.setVisible(true);
  }

}
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ChessGamePanel extends JPanel implements ChessGameConstants,MouseListener{
  int x = 0;
  int y = 0;
  Dimension dimension =  new Dimension(50,50);
  boolean colourDecider = false;
  Tile [][] chessBoard = new Tile [8][8];
  Tile [] fallenWhitePieces = new Tile[16];
  Tile [] fallenBlackPieces = new Tile[16];
  
  public ChessGamePanel(JFrame chessGameFrame){
    
    JLabel turnChooser = new JLabel("WHITE PLAYER'S TURN");
    turnChooser.setFont(turnChooserFont);
    turnChooser.setBackground(grey);
    turnChooser.setForeground(Color.WHITE);
    turnChooser.setBounds(10,450,500,50);
    turnChooser.setOpaque(true);
    
    JButton backButtonGame = new JButton("BACK");
    backButtonGame.setFont(font);
    backButtonGame.setBackground(Color.BLACK);
    backButtonGame.setForeground(Color.WHITE);
    backButtonGame.setBounds(500,30,100,50);
    backButtonGame.setOpaque(true);
    backButtonGame.addActionListener(new GoBackListener(chessGameFrame));
    
    
    this.add(turnChooser);
    this.add(backButtonGame);
    this.setVisible(true);
    this.setBackground(Color.WHITE);
    
    
  }
  protected void paintComponent(Graphics g){
    super.paintComponent(g);
    //Draw the chessBoard and set up the pieces.
    //Negative ids are for white pawns, and positive ids are for black pawns.
    for(int rowNum = 0; rowNum < 8; rowNum++){
      for(int columnNum = 0; columnNum<8; columnNum++){
        chessBoard[rowNum][columnNum] = new Tile(0,x,y,dimension,colourDecider);
        chessBoard[rowNum][columnNum].draw(g);
        
        //Draw all of the black pieces other than pawns.
        if(rowNum ==  0 && (columnNum == 0 || columnNum == 7)){
          chessBoard[rowNum][columnNum] = new Rook(2,x,y,new Dimension(20,20),true);
          chessBoard[rowNum][columnNum].draw(g);
        }
        else if(rowNum == 0 &&(columnNum == 1 || columnNum == 6)){
          chessBoard[rowNum][columnNum] = new Knight(3,x,y,new Dimension(20,20),true);
        }
        else if(rowNum == 0 && (columnNum == 2 || columnNum ==5)){
          chessBoard[rowNum][columnNum] = new Bishop(4,x,y, new Dimension(20,20),true);
        }
        else if(rowNum == 0 && columnNum == 3){
          chessBoard[rowNum][columnNum] = new Queen(5,x,y,new Dimension(20,20),true);
        }
        else if(rowNum == 0 && columnNum == 4){
          chessBoard[rowNum][columnNum] = new King(6,x,y,new Dimension(20,20),true);
        }
        //Draw all of the white pieces other than the pawns.
        else if(rowNum == 7 && columnNum == 3){
          chessBoard[rowNum][columnNum] = new Queen(-5,x,y,new Dimension(20,20),false);
        }
        else if(rowNum == 7 && columnNum ==  4){
          chessBoard[rowNum][columnNum] = new King(-6,x,y,new Dimension(20,20),false);
        }
        else if(rowNum == 7 && (columnNum ==  0 || columnNum == 7)){
          chessBoard[rowNum][columnNum] = new Rook(-2,x,y,new Dimension(20,20),false);
        }
        else if(rowNum == 7 &&(columnNum == 1 || columnNum == 6)){
          chessBoard[rowNum][columnNum] = new Knight(-3,x,y,new Dimension(20,20),false);
        }
        else if(rowNum == 7 &&(columnNum == 2 || columnNum ==5)){
          chessBoard[rowNum][columnNum] = new Bishop(-4,x,y,new Dimension(20,20),false);
        }
        
        //Draw all of the black pawns
        else if(rowNum == 1){
          chessBoard[rowNum][columnNum] = new Pawn(1,x,y,new Dimension(20,20),true);
        }
        //Draw all of the white pawns
        else if(rowNum == 6){
          chessBoard[rowNum][columnNum] = new Pawn(-1,x,y,new Dimension(20,20),false);
        }
        chessBoard[rowNum][columnNum].draw(g);
        
        if(colourDecider == true && columnNum != 7){
          colourDecider = false;
        }
        else if(colourDecider == false && columnNum != 7){
          colourDecider = true;
        }
        x = x+ 50;
      }
      y = y+ 50;
      x = 0;
    }

    //Reset the x and y coordinates
    x = 0;
    y = 0;
  }
  public void updateChessBoard(Graphics g){
  }
  
  //Mouse Listener methods
  public void mouseClicked(MouseEvent e){
    int x = e.getX();
    int y = e.getY();
    System.out.println("Mouse is clicked!");
  }
  public void mousePressed(MouseEvent e){
    System.out.println("Mouse is pressed!");
  }
  public void mouseReleased(MouseEvent e){
    System.out.println("Mouse is released!");
  }
  public void mouseEntered(MouseEvent e){
    System.out.println("Mouse entered!");
  }
  public void mouseExited(MouseEvent e){
    System.out.println("Mouse exited!");
  }
  
}
  
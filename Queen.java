import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Queen extends Rook{
  
  Image blackQueen = new ImageIcon("blackQueen.png").getImage();
  Image whiteQueen = new ImageIcon("whiteQueen.png").getImage();
  
  final int QUEEN_WORTH = 9;
  
  public Queen(int id,int x, int y, Dimension dimension,boolean colourDecider){
    super(id,x,y,dimension,colourDecider);
  }
  @Override
  public void draw(Graphics g){
    if(colourDecider == true){
      g.drawImage(blackQueen,x,y,50,50,null,null);
    }
    else if(colourDecider == false){
      g.drawImage(whiteQueen,x,y,50,50,null,null);
    }
  }
}
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bishop extends Pawn{
  
  Image blackBishop = new ImageIcon("blackBishop.png").getImage();
  Image whiteBishop = new ImageIcon("whiteBishop.png").getImage();
  
  final int BISHOP_WORTH = 3;
  
  public Bishop(int id,int x, int y, Dimension dimension,boolean colourDecider){
    super(id,x,y,dimension,colourDecider);
  }
  @Override
  public void draw(Graphics g){
    if(colourDecider == true){
      g.drawImage(blackBishop,x,y,50,50,null,null);
    }
    else if(colourDecider == false){
      g.drawImage(whiteBishop,x,y,50,50,null,null);
    }
  }
}
  
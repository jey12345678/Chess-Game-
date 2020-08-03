import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Knight extends Pawn{
  
  Image blackKnight = new ImageIcon("blackKnight.png").getImage();
  Image whiteKnight = new ImageIcon("whiteKnight.png").getImage();
  
  final int KNIGHT_WORTH = 3;
  
  public Knight(int id,int x, int y, Dimension dimension,boolean colourDecider){
    super(id,x,y,dimension,colourDecider);
  }
  @Override
  public void draw(Graphics g){
    if(colourDecider == true){
      g.drawImage(blackKnight,x,y,50,50,null,null);
    }
    else if(colourDecider == false){
      g.drawImage(whiteKnight,x,y,50,50,null,null);
    }
  }
}
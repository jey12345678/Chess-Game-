import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Rook extends Pawn{
  
  Image blackRook = new ImageIcon("blackRook.png").getImage();
  Image whiteRook = new ImageIcon("whiteRook.png").getImage();
  
  final int ROOK_WORTH = 5;
  
  public Rook(int id,int x, int y, Dimension dimension,boolean colourDecider){
    super(id,x,y,dimension,colourDecider);
  }
  @Override
  public void draw(Graphics g){
    if(colourDecider == true){
      g.drawImage(blackRook,x,y,50,50,null,null);
    }
    else if(colourDecider == false){
      g.drawImage(whiteRook,x,y,50,50,null,null);
    }
  }
}
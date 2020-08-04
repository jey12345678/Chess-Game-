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
  
  public Rook(int id,int x, int y, Dimension dimension,boolean colourDecider,boolean sideColour){
    super(id,x,y,dimension,colourDecider,sideColour);
  }
  @Override
  public void draw(Graphics g){
    if(sideColour == true){
      g.drawImage(blackRook,x,y,(int)(dimension.getWidth()),(int)(dimension.getHeight()),null,null);
    }
    else if(sideColour == false){
      g.drawImage(whiteRook,x,y,(int)(dimension.getWidth()),(int)(dimension.getHeight()),null,null);
    }
  }
}
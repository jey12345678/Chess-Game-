import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class King extends Pawn{
  
  Image blackKing = new ImageIcon("blackKing.png").getImage();
  Image whiteKing = new ImageIcon("whiteKing.png").getImage();
  
  final int KING_WORTH = 0;
  
  public King(int id,int x, int y, Dimension dimension,boolean colourDecider,boolean option,boolean sideColour){
    super(id,x,y,dimension,colourDecider,option,sideColour);
  }
  @Override
  public void draw(Graphics g){
    if(sideColour == true){
      g.drawImage(blackKing,x,y,(int)(dimension.getWidth()),(int)(dimension.getHeight()),null,null);
    }
    else if(sideColour == false){
      g.drawImage(whiteKing,x,y,(int)(dimension.getWidth()),(int)(dimension.getHeight()),null,null);
    }
  }
}
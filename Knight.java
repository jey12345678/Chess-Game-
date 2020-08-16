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
  
  public Knight(int id,int x, int y, Dimension dimension,boolean colourDecider,boolean option,boolean selected,boolean sideColour,int rowNum,int columnNum){
    super(id,x,y,dimension,colourDecider,option,selected,sideColour,rowNum,columnNum);
  }
  @Override
  public void draw(Graphics g){
    super.draw(g);
    if(sideColour == true){
      g.drawImage(blackKnight,x,y,(int)(dimension.getWidth()),(int)(dimension.getHeight()),null,null);
    }
    else if(sideColour == false){
      g.drawImage(whiteKnight,x,y,(int)(dimension.getWidth()),(int)(dimension.getHeight()),null,null);
    }
  }
}
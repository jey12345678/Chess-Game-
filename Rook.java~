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
  
  public Rook(int id,int x, int y, Dimension dimension,boolean colourDecider,boolean option,boolean selected,boolean sideColour,int rowNum,int columnNum){
    super(id,x,y,dimension,colourDecider,option,selected,sideColour,rowNum,columnNum);
  }
  @Override
  public void draw(Graphics g){
    super.draw(g);
    if(sideColour == true  && (this.id == 2 || this.id == -2)){
      g.drawImage(blackRook,x,y,(int)(dimension.getWidth()),(int)(dimension.getHeight()),null,null);
    }
    else if(sideColour == false  && (this.id == 2 || this.id == -2)){
      g.drawImage(whiteRook,x,y,(int)(dimension.getWidth()),(int)(dimension.getHeight()),null,null);
    }
  }
    
}
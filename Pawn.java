import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Pawn extends Tile implements ChessGameConstants{
  
  Image blackPawn = new ImageIcon("blackPawn2.png").getImage();
  Image whitePawn = new ImageIcon("whitePawn2.png").getImage();
  boolean sideColour;
  
  final int PAWN_WORTH = 1;
  
  public Pawn(int id,int x, int y, Dimension dimension,boolean colourDecider,boolean sideColour){
    super(id,x,y,dimension,colourDecider);
    this.sideColour = sideColour;
  }
  @Override
  public void draw(Graphics g){
    if(sideColour == true){
      g.drawImage(blackPawn,x,y,(int)(dimension.getWidth()),(int)(dimension.getHeight()),null,null);
    }
    else if(sideColour == false){
      g.drawImage(whitePawn,x,y,(int)(dimension.getWidth()),(int)(dimension.getHeight()),null,null);
    }
  }
  public boolean checkBounds(int xMouse,int yMouse){
    System.out.println("X: "+ this.x);
    System.out.println("Y: "+ this.y);
    
    if((xMouse >= this.x && xMouse < (this.x + dimension.getWidth())) && (yMouse>= this.y && yMouse < (this.y+ dimension.getHeight()))){
      return true;
    }
    return false;
  }
  public void lightUp(Graphics g, boolean checker){
    if(checker == true){
      g.setColor(aquaBlue);
      g.fillRect(x,y,(int)(dimension.getWidth()),(int)(dimension.getHeight()));
      draw(g);
    }
    else{
      super.draw(g);
      draw(g);
    }
  }
}
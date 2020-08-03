import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Pawn extends Tile{
  
  Image blackPawn = new ImageIcon("blackPawn2.png").getImage();
  Image whitePawn = new ImageIcon("whitePawn2.png").getImage();
  
  final int PAWN_WORTH = 1;
  
  public Pawn(int id,int x, int y, Dimension dimension,boolean colourDecider){
    super(id,x,y,dimension,colourDecider);
  }
  @Override
  public void draw(Graphics g){
    if(colourDecider == true){
      g.drawImage(blackPawn,x,y,50,50,null,null);
    }
    else if(colourDecider == false){
      g.drawImage(whitePawn,x,y,50,50,null,null);
    }
  }
}
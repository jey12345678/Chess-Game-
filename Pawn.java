import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Pawn extends Tile implements ChessGameConstants{
  
  Image blackPawn = new ImageIcon("blackPawn2.png").getImage();
  Image whitePawn = new ImageIcon("whitePawn2.png").getImage();
  boolean sideColour,selected;
  
  final int PAWN_WORTH = 1;
  
  public Pawn(int id,int x, int y, Dimension dimension,boolean colourDecider,boolean option,boolean selected,boolean sideColour){
    super(id,x,y,dimension,colourDecider,option);
    this.sideColour = sideColour;
    this.selected = selected;
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

  public boolean lightUp(Graphics g, boolean checker){
    if(checker == true){
      g.setColor(aquaBlue);
      g.fillRect(x,y,(int)(dimension.getWidth()),(int)(dimension.getHeight()));
      draw(g);
      return true;
    }
    else{
      super.draw(g);
      draw(g);
      return false;
    }
  }
  public boolean isEnemy(Tile piece){
    if(piece.id > 0 && this.id <0){
      return true;
    }
    else if(piece.id < 0 && this.id > 0){
      return true;
    }
    return false;
  }
  public void movePawn(Tile tile,Tile [][] chessBoard,int rowNumOfPiece,int columnNumOfPiece){
    chessBoard[rowNumOfPiece][columnNumOfPiece] = this;
    this.x = tile.x;
    this.y = tile.y;
  }
}
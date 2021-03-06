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
  
  public Pawn(int id,int x, int y, Dimension dimension,boolean colourDecider,boolean option,boolean selected,boolean sideColour,int rowNum,int columnNum){
    super(id,x,y,dimension,colourDecider,option,rowNum,columnNum);
    this.sideColour = sideColour;
    this.selected = selected;
  }
  @Override
  public void draw(Graphics g){
    super.draw(g);
    if(this.selected == true){
      g.setColor(aquaBlue);
      g.fillRect(x,y,(int)dimension.getWidth(),(int)dimension.getHeight());
    }
    if(sideColour == true && (this.id == 1 || this.id == -1)){
      g.drawImage(blackPawn,x,y,(int)(dimension.getWidth()),(int)(dimension.getHeight()),null,null);
    }
    else if(sideColour == false  && (this.id == 1 || this.id == -1)){
      g.drawImage(whitePawn,x,y,(int)(dimension.getWidth()),(int)(dimension.getHeight()),null,null);
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
  public boolean isFriend(Tile piece){
    if(piece.id > 0 && this.id > 0){
      return true;
    }
    else if(piece.id < 0 && this.id < 0){
      return true;
    }
    else{
      return false;
    }
  }
  public void move(Tile tile,Tile [][] chessBoard,Graphics g){
    //Reset the chessBoard
    chessBoard[tile.rowNum][tile.columnNum] = this;
    chessBoard[this.rowNum][this.columnNum] = new Tile(0,this.x,this.y,this.dimension,this.colourDecider,this.option,this.rowNum,this.columnNum);
    chessBoard[this.rowNum][this.columnNum].draw(g);
    this.x = tile.x;
    this.y = tile.y;
    this.rowNum = tile.rowNum;
    this.columnNum = tile.columnNum;
    this.colourDecider = tile.colourDecider;
    chessBoard[tile.rowNum][tile.columnNum].draw(g);
  }
}
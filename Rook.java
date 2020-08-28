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
  public int  showMaxRowDown(int rowNum,int counter,Tile [][] chessBoard){
    if(rowNum == 8){
      return 0;
    }
    else if(this.isEnemy(chessBoard[rowNum][this.columnNum]) == false && chessBoard[rowNum][this.columnNum].id == 0 && rowNum == 7){
      return 1;
    }
    else if(this.isFriend(chessBoard[rowNum][this.columnNum]) == true){
      return 0;
    }
    else if(this.isEnemy(chessBoard[rowNum][this.columnNum]) == true){
      return 1;
    }
    else{
      return counter+showMaxRowDown(rowNum+1,counter,chessBoard);
    }
  }
  public int showMaxRowUp(int rowNum,int counter,Tile [][] chessBoard){
    if(rowNum == -1){
      return 0;
    }
    else if(this.isEnemy(chessBoard[rowNum][this.columnNum]) == false && chessBoard[rowNum][this.columnNum].id == 0 && rowNum == 0){
      return 1;
    }
    else if(this.isFriend(chessBoard[rowNum][this.columnNum]) == true){
      return 0;
    }
    else if(this.isEnemy(chessBoard[rowNum][this.columnNum]) == true){
      return 1;
    }
    else{
      return counter+showMaxRowUp(rowNum-1,counter,chessBoard);
    } 
  }
  public int showMaxColumnRight(int columnNum,int counter,Tile [][] chessBoard){
    if(columnNum == 8){
      return 0;
    }
    else if(this.isEnemy(chessBoard[this.rowNum][columnNum]) == false && chessBoard[this.rowNum][columnNum].id == 0 && columnNum == 7){
      return 1;
    }
    else if(this.isFriend(chessBoard[this.rowNum][columnNum]) == true){
      return 0;
    }
    else if(this.isEnemy(chessBoard[this.rowNum][columnNum]) == true){
      return 1;
    }
    else{
      return counter+showMaxColumnRight(columnNum+1,counter,chessBoard);
    }
  }
  public int showMaxColumnLeft(int columnNum,int counter,Tile [][] chessBoard){
    if(columnNum == -1){
      return 0;
    }
    else if(this.isEnemy(chessBoard[this.rowNum][columnNum]) == false && chessBoard[this.rowNum][columnNum].id == 0 && columnNum == 0){
      return 1;
    }
    else if(this.isFriend(chessBoard[this.rowNum][columnNum]) == true){
      return 0;
    }
    else if(this.isEnemy(chessBoard[this.rowNum][columnNum]) == true){
      return 1;
    }
    else{
      return counter+showMaxColumnLeft(columnNum-1,counter,chessBoard);
    }
  }
}
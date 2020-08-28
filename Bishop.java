import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bishop extends Pawn{
  
  Image blackBishop = new ImageIcon("blackBishop.png").getImage();
  Image whiteBishop = new ImageIcon("whiteBishop.png").getImage();
  
  final int BISHOP_WORTH = 3;
  
  public Bishop(int id,int x, int y, Dimension dimension,boolean colourDecider,boolean option,boolean selected,boolean sideColour,int rowNum,int columnNum){
    super(id,x,y,dimension,colourDecider,option,selected,sideColour,rowNum,columnNum);
  }
  @Override
  public void draw(Graphics g){
    super.draw(g);
    if(sideColour == true){
      g.drawImage(blackBishop,x,y,(int)(dimension.getWidth()),(int)(dimension.getHeight()),null,null);
    }
    else if(sideColour == false){
      g.drawImage(whiteBishop,x,y,(int)(dimension.getWidth()),(int)(dimension.getHeight()),null,null);
    }
  }
  public int showMaxDiagonalUp(int columnNum,int counter,Tile [][] chessBoard){
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
  
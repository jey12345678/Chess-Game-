/**
 * PlayButtonListener
 * @author Jayden Chuong
 * @date 19/1/2020
 * @ICS-4U1
 */ 


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class PlayTheGameButtonListener implements ActionListener{  
    private MainMenuFrame targetFrame;
    /**
     * PlayButtonListener
     * This constructor creates a new PlayButtonListener with the target StartFrame
     * @param the StartFrame
     */
    PlayTheGameButtonListener(MainMenuFrame target){ 
        this.targetFrame = target;
    }
    /**
     * actionPerformed
     * This method disposes the current frame and opens the stageSelectFrame frame when the button is pressed
     * @param the ActionEvent
     */
    public void actionPerformed(ActionEvent event) {  
        System.out.println("Starting new Game");
        targetFrame.dispose();            //dispose of the start screen
        new ChessGameFrame();
    }
}
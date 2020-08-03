
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NextButtonListener implements ActionListener{ 
  
    private HowToPlayFrame targetFrame;
    /**
     * HowButtonListener
     * This constructor create a HowButtonListener with the target StartFrame
     * @param the StartFrame
     */
    NextButtonListener(HowToPlayFrame target){ 
        this.targetFrame = target;
    }
    /**
     * actionPerformed
     * This method disposes the current frame and opens the how frame when the button is pressed
     * @param the ActionEvent
     */
    public void actionPerformed(ActionEvent event){  
        System.out.println("Moving to how to play screen");
        targetFrame.dispose();            //dispose of the start screen
        new HowToPlayFramePt2();              //create a new frame - the how frame
    }
}
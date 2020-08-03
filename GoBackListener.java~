/**
 * GoBackListener
 * @author Jayden Chuong
 * @date 19/1/2020
 * @ICS-4U1
 */ 
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GoBackListener implements ActionListener{  
    private JFrame targetFrame;
    /**
     * BackButtonListener
     * This constructor creates a BackButtonListener
     * @param The action event
     * @return void
     */
    GoBackListener(JFrame target) { 
        this.targetFrame = target;
    }
    /**
     * actionPerformed
     * This method triggers once the button is pressed, disposing the current frame and goes to the starting frame
     * @param The action event
     * @return void
     */
    public void actionPerformed(ActionEvent event) {  
        System.out.println("Moving back to start screen");
        this.targetFrame.dispose();            //dispose of the current frame
        new MainMenuFrame();              //create a new frame - the start frame
    }
}
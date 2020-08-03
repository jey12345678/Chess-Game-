
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenuFrame extends JFrame implements ChessGameConstants { 
    
    //variables and constants
    private int START_W = 1200;
    private int START_H = 600;
    private BorderLayout borderLayout = new BorderLayout();
    private ImageIcon chessImage = new ImageIcon(new ImageIcon("Chess Pieces.jpg").getImage().getScaledInstance(490,600,Image.SCALE_DEFAULT));
    //---------------------CUSTOM COLOURS--------------------------------------- 
    //constructor - this runs first
    public MainMenuFrame() { 
        
        super("CHESS GAME");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(START_W, START_H);
        this.setResizable(false); 
        this.setLocationRelativeTo(null); //start the frame in the center of the screen
        
        //create the start panel (where intro graphics or GUI elements are drawn)
        JPanel startPanel = new JPanel();
        startPanel.setLayout(new BorderLayout());
        
        //Create a JLabel for the title
        JLabel title = new JLabel("----------------------------------CHESS----------------------------------",SwingConstants.CENTER);
        title.setFont(titleFont);
        title.setBackground(grey);
        title.setForeground(Color.BLACK);
        title.setOpaque(true);
        
        //create a JButton for the panel
        JButton howButton = new JButton("HOW TO PLAY");
        howButton.setFont(font);
        howButton.setBackground(Color.BLACK);
        howButton.setForeground(Color.WHITE);
        howButton.setOpaque(true);
        howButton.addActionListener(new HowToPlayButtonListener(this));
              
        JButton playButton = new JButton("PLAY THE GAME");
        playButton.setFont(font);
        playButton.setForeground(Color.WHITE);
        playButton.setBackground(Color.BLACK);
        playButton.setOpaque(true);
        playButton.addActionListener(new PlayTheGameButtonListener(this));
        
        JLabel creators = new JLabel("Creators: Jeyason Jeyaparan",SwingConstants.CENTER);
        creators.setFont(font);
        creators.setForeground(Color.BLACK);
        creators.setBackground(grey);
        creators.setOpaque(true);
        
        JLabel chessLabel = new JLabel(chessImage);
                
        // start panel
        startPanel.setLayout(borderLayout);
        startPanel.add(howButton,BorderLayout.LINE_END);
        startPanel.add(creators, BorderLayout.PAGE_END);
        startPanel.add(playButton,BorderLayout.LINE_START);
        startPanel.add(title,BorderLayout.PAGE_START);
        startPanel.add(chessLabel, BorderLayout.CENTER);
        startPanel.setBackground(Color.WHITE);
        
        //add the panel to the frame
        this.add(startPanel);
        this.pack();
        this.requestFocusInWindow();      //make this window the active window
        this.setVisible(true);
    }
}
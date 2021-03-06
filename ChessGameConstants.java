/*ShootingGameConstants.java
 *It is an interface for all the constant variables we use throughout our program.
 *Author: Jeyason Jeyaparan and Anthony Keen
 *Date: January 19th 2020
 */

import java.awt.Font;
import java.awt.Color;

public interface ChessGameConstants {
    
    //width and height of the game window
    static final int GAME_W = 950;
    static final int GAME_H = 720;
    static final int RIGHT_END_OF_SCREEN = -10;
    static final int OUT_OF_SCREEN = -100;
    
    //game-specific constants
    static final int GROUND = 600;
    static final int GRAVITY = 2;
    static final int FRAME_TIME = 20;
    static final int SPRITE_UPDATE_MS = 100;
    static final int BLAST_SPEED = 15;
    
    //Sprite Animation constants
    static final int IDLE = 1;
    static final int JUMPING = 2;
    static final int BLAST = 3;
    static final int PUNCHING = 4;
    static final int KICKING = 5;
    static final int DUCKING = 6;
    static final int RESET = 0;
    static final int FACE_RIGHT = 0;
    static final int FACE_LEFT = 1;
    static final int TOTAL_JUMP_SPRITES = 4;
    
    //Player start locations and health bar locations and sizes
    static final int PLAYER_ONE = 1;
    static final int PLAYER_TWO = 2;
    static final int PLAYER_ONE_START_X_LOCATION = 600;
    static final int PLAYER_ONE_START_Y_LOCATION = 600;
    static final int PLAYER_TWO_START_X_LOCATION = 100;
    static final int PLAYER_TWO_START_Y_LOCATION = 600;
    
    static final int HEALTH_BAR_HEIGHT = 10;
    static final int HEALTH_BAR_WIDTH = 300;
    static final int HEALTH_BAR_LIMIT_DECREMENT = 50;
    
    static final int PLAYER_TWO_HEALTH_BAR_X = 0;
    static final int PLAYER_TWO_HEALTH_BAR_Y = 100;
    static final int PLAYER_ONE_HEALTH_BAR_X = 644;
    static final int PLAYER_ONE_HEALTH_BAR_Y = 100;
    
    //Set the adjustment for the blasts.
    static final int HORIZONTAL_BLAST_ADJUSTMENT = 10;
    static final int VERTICAL_BLAST_ADJUSTMENT = 20;
    static final int STOP = 0;
    
    //Fighter Label Width and Height
    static final int FIGHTER_LABEL_WIDTH = 250;
    static final int FIGHTER_LABEL_HEIGHT = 80;
    
    //Fighter One and fighter two label location
    static final int FIGHTER_ONE_LABEL_X_LOCATION = 690;
    static final int FIGHTER_TWO_LABEL_X_LOCATION = 5;
    static final int FIGHTER_LABEL_Y_LOCATION = 0;
    
    //Fight image location
    static final int FIGHT_LABEL_X_LOCATION = 370;
    static final int FIGHT_LABEL_Y_LOCATION = 0;
    
    //Constant variables for what character is chosen.
    static final int NO_CHARACTER_CHOSEN = 0;
    static final int FIRE_CHARACTER = 1;
    static final int EARTH_CHARACTER = 2;
    static final int WATER_CHARACTER = 3;
    static final int WIND_CHARACTER = 4;
    
    //FONTS USED
    static final Font titleFont = new Font("Algerian",Font.BOLD,30);
    static final Font turnChooserFont = new Font("Algerian",Font.BOLD,20);
    static final Font font=new Font("Algerian",Font.BOLD,15);
    static final Font fontShowCardGhotic = new Font("Showcard Gothic",Font.PLAIN,18);
    
    //COLOURS USED
    Color grey = new Color(176, 175, 169);
    Color darkBrown = new Color(84, 52, 18);
    Color lightBrown = new Color(255, 195, 130);
    Color aquaBlue = new Color(127,225,240);
    
    //Constants for KO button
    static final int KO_BUTTON_X_LOCATION = 250;
    static final int KO_BUTTON_Y_LOCATION = 200;
    static final int KO_BUTTON_WIDTH = 400;
    static final int KO_BUTTON_HEIGHT = 200;
}
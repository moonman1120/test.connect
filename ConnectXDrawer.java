import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 * Write a description of class ConnectXDrawer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ConnectXDrawer implements MouseListener
{
    public SimpleCanvas cv;
    public ConnectX Game;
    private final int gameWidth;
    private final int gameHeight;
    private final int CellSize = 100;
    private final int Margin = 150;

    private final Color GridColor = Color.black;

    ArrayList<Color> PlayerColors;

    private boolean gameIsOver;

    /*
     * Constructor:
     * Takes a ConnectX object as a paramter.
     * 
     * Needs to set up the fields: Game, gameWidth, gameHeight, cv
     * 
     * cv is your simple canvas object. You will need to set its name, height, width, and background color. 
     * For the name, make it represent the number of connections to win. 
     * For example, if you need 4 in a row to win, the window should be called connect 4. 
     * See the lecture for examples of how to set up the canvas. 
     *
     * remember to add the mouse listener line. 
     * 
     * I have left in an example of how to change the font and font size.
     */
    public ConnectXDrawer(ConnectX game){
        //TODO 17
        
        gameWidth = -1;
        gameHeight = -1;
        

        
        //This part has been done for you, leave it at the end. Feel free to add more if testing with more players. 
        PlayerColors = new ArrayList<>();
        PlayerColors.add(null);
        PlayerColors.add(Color.red);
        PlayerColors.add(Color.blue);
        PlayerColors.add(Color.green);
        PlayerColors.add(Color.MAGENTA);

        ResetGame();
    }

    /*
     * Resets the game. 
     * Needs to reset the game grid by calling its reset method. 
     * Needs to set gameIsOver to false;
     * Needs to redraw the game. 
     */
    public void ResetGame(){
        //TODO 18

    }

    /*
     * Parameterless constructor for easy testing. 
     * No need to change this. 
     */
    public ConnectXDrawer(){
        this(new ConnectX());
    }

    /*
     * Writes a string on the screen saying which players turn it is. 
     */
    public void DrawPlayerTurn(){
        //TODO 19
    }

    /*
     * Draws a grid for you to put marker into. 
     */
    public void DrawGrid(){
        //TODO 20
    }

    /*
     * Draws any buttons you have. At minimum you need a reset button. 
     */
    public void DrawButtons(){
        //TODO 21
    }

    /*
     * Returns the screen to blank. 
     */
    public void ResetScreen(){
        //TODO 22
    }

    /*
     * Draws everything you need. This will be:
     * reset screen
     * Plyaer turn
     * the grid
     * the buttons
     * the markers in the grid
     */
    public void DrawAll(){
        //TODO 22

    }

    /*
     * Place a marker into the ConnectX object's grid at the specified column. 
     * No need to draw it on the screen in this method. 
     * 
     * if you were able to add a marker (it was a valid move),
     * then check if that player has won the game. 
     * If they have won, call the GameOver method on that winning player. 
     */
    public void PlaceMarker(int column){
        //TODO 23
    }

    /*
     * set the gameIsOver field to true.
     * Write a message on the screen saying who won. 
     */
    public void GameOver(int player){
        //TODO 24
    }

    /*
     * Looks at each element in the ConnectX object's grid and draws them on screen. 
     * Use the PlayerColor arrayList to determine what color each marker is. 
     * You can make the markers look however you want. 
     * 
     * Hint, in our game grid, bottom left is 0,0  but on our screen 0,0 is the top left. 
     * You will have to account for this. 
     */
    public void DrawMarkers(){
        //TODO 25
    }

    /*
     * x and y are the mouse coordinates. 
     * if the mouse was over the grid when clicked, 
     * work out which column was clicked on, 
     * and call PlaceMarker there.
     */
    public void TryGridClicked(int x, int y){
        //TODO 26
    }

    /*
     * Returns whether or not a click was on the reset button. 
     * x and y are the mouse coordinates. 
     */
    public boolean CheckResetButton(int x, int y){
        //TODO 27
        return false;
    }

    /*
     * handles mouse presses. 
     * first, checks if the reset button was pressed. 
     * If it was, reset the game and return. 
     * 
     * otherwise, check if the game is over. If it is, return. 
     * 
     * otherwise, call TryGridClicked 
     */
    public void mousePressed(MouseEvent e) 
    {
        //TODO 28
    }

    public void mouseClicked(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

}

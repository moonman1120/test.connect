
public class ConnectX
{
    private int[][] grid;
    public final int Width;
    public final int Height;
    private int CurrentPlayer;
    public final int NumberOfPlayers;
    public final int ConnectionsToWin;

    /*
     * Sets up the grid to be of the given width and height.
     * Sets the field values;
     * Needs to set each cell to player 0.
     */
    public ConnectX(int width, int height, int numPlayers, int connectionsToWin){
        //TODO 1

        Width = -1;
        Height = -1;
        NumberOfPlayers = -1;
        ConnectionsToWin = -1;
    }

    //create a 6 width, 7 height game, with 2 players, and 4 connections needed to win. 
    public ConnectX(){
        this(6, 7, 2, 4);
    }

    //returns the current player who's turn it is
    public int GetCurrentPlayer(){
        //TODO 2
        return -2;
    }

    //return the grid object
    public int[][] GetGrid(){
        //TODO 3
        return null;
    }

    /*
     * resets all spaces in the grid
     * sets makes it player 1's turn
     */
    public void ResetGrid(){
        //TODO 4
    }

    //returns true if the the column has no more space for markers.
    //Returns false otherwise. 
    public boolean IsColumnFull(int x){
        //TODO 5
        return false;
    }

    /*
     * Attempts to put a marker from the given player into 
     * the column at x.
     * If not valid, return false, otherwise add the marker to the top of the column
     *  and return true.
     * A valid column is one that isn't full, and not out of bounds. 
     */
    public boolean TryAddToken(int player, int x){
        //TODO 6
        return false;
    }

    /* Sets the current player to be the next player. 
    *  If its the last player's turn, the next player will be player 1. 
    * if you have three players and its player 2's turn, the next player is player 3. 
    * if its player 3's turn, the next player is player 1
    */
    public void NextPlayer(){
        //TODO 7
    }

    /*
     * tries to add the token for the player who's turn it is. 
     * If you were able to add the token, moves the current turn to the next player.
     * returns true if you were able to add a token, otherwise returns false.
     */
    public boolean TryAddNextPlayer(int x){
        //TODO 8
        return false;
    }

    /*
     * returns a string that represents the state of the grid
     * player 0 should be a space, otherwise print the player name
     * seperated by spaces
     * Don't forget your new line characters. 
     * See the tests for examples
     * also prints out the returned string
     */
    public String PrintGridState(){
        //TODO 9
        return "";
    }

    /*
     * Method for testing.
     * No need to change. 
     */
    public void Populate(){
        TryAddNextPlayer(1);
        TryAddNextPlayer(0);

        TryAddNextPlayer(1);
        TryAddNextPlayer(2);

        TryAddToken(3, 0);
        TryAddNextPlayer(3);
        TryAddNextPlayer(0);

        TryAddNextPlayer(2);
        TryAddNextPlayer(3);

        TryAddNextPlayer(1);
        TryAddNextPlayer(0);  
    }

    /*
     * Should count left to right the number of tokens belonging to the given player 
     * in a row starting from position x, y.
     * 
     * if the token at x,y does not belong to the given player, return 0
     * 
     * you do not need to worry about the player = 0 case.
     * 
     * 
     * otherwise, count going across left to right. When you run into a different 
     * players token, an empty space, or reach the end of the grid, stop counting
     * 
     * exmple row:
     * 
     * 0 0 1 1 0 2 0 0
     * 
     * if you select player 1 and start at 0,0   return 0
     * if you select player 1 and start at 2,0   return 2
     * if you select player 1 and start at 3,0   return 1
     * if you select player 2 and start at 2,0   return 0
     * if you select player 2 and start at 5,0   return 1
     */
    public int CountAcross(int player, int x, int y){
        //TODO 10
        return -1;
    }

    /*
     * Checks to see if the given player has won on row y
     * returns true if they have enough in a row to win, 
     * otherwise, returns false.
     */
    public boolean CheckRowWin(int player, int y){
        //TODO 11
        return false;
    }

    /*
     * if a player has won by rows, return that row number
     * otherwise, return -1 if they have not won by rows. 
     */
    public int CheckPlayerWinAllRows(int player){
        //TODO 12
        return -2;
    }

    /*
     * see count across. 
     * 
     * This does the same thing, but counts upwards, not across.
     */
    public int CountUp(int player, int x, int y){
        //TODO 13
        return -2;
    }

    /* Checks to see if the given player has won on column x
     * returns true if they have enough consecutive to win, 
     * otherwise, returns false.
     */
    public boolean CheckColumnWin(int player, int x){
        //TODO 14
        return false;
    }

    /*
     * if a player has won by columns, return that column number
     * otherwise, return -1 if they have not won by columns. 
     */
    public int CheckPlayerWinAllColumns(int player){
        //TODO 15
        return -2;
    }

    /*
     * Returns true if a player has one by any condition (rows or columns). 
     * Otherwise, returns false. 
     */
    public boolean CheckPlayerWinAny(int player){
        //TODO 16
        return false;
    }

    /*
     * 
     * Test methods for your convienience. 
     */
    public static void Test(){
        ConnectX cx = new ConnectX(4, 5, 2, 4);
        cx.TryAddNextPlayer(0);
        cx.TryAddNextPlayer(2);

        cx.TryAddNextPlayer(0);
        cx.TryAddNextPlayer(3);
        cx.PrintGridState();
    }

    public static void Test2(){
        ConnectX cx = new ConnectX(4, 5, 2, 4);
        cx.TryAddNextPlayer(0);
        cx.TryAddNextPlayer(2);

        cx.TryAddNextPlayer(0);
        cx.TryAddNextPlayer(3);
        cx.PrintGridState();
        System.out.println("\n\n");
        System.out.println(cx.CountAcross(1, 0, 0)); //1
        System.out.println(cx.CountAcross(1, 1, 0)); //0
        System.out.println(cx.CountAcross(2, 2, 0)); //2
        System.out.println(cx.CountAcross(2, 3, 0)); //1

    }

    public static void Test3(){
        ConnectX cx = new ConnectX(4, 5, 2, 3);
        cx.TryAddNextPlayer(0);
        cx.TryAddNextPlayer(2);

        cx.TryAddNextPlayer(0);
        cx.TryAddNextPlayer(3);

        cx.TryAddNextPlayer(3);
        cx.TryAddNextPlayer(1);

        cx.PrintGridState();
        System.out.println(cx.CheckRowWin(1, 0)); //false
        System.out.println(cx.CheckRowWin(2, 0)); //true
    }

    public static void Test4(){
        ConnectX cx = new ConnectX(4, 5, 2, 3);
        cx.TryAddNextPlayer(1);
        cx.TryAddNextPlayer(0);

        cx.TryAddNextPlayer(1);
        cx.TryAddNextPlayer(2);

        cx.TryAddNextPlayer(0);
        cx.TryAddNextPlayer(0);

        cx.TryAddNextPlayer(2);
        cx.TryAddNextPlayer(3);

        cx.PrintGridState();
        System.out.println(cx.CheckPlayerWinAllRows(1)); //true
        System.out.println(cx.CheckPlayerWinAllRows(2)); //false
    }

    public static void Test5(){
        ConnectX cx = new ConnectX(4, 5, 2, 3);
        cx.TryAddNextPlayer(1);
        cx.TryAddNextPlayer(0);

        cx.TryAddNextPlayer(1);
        cx.TryAddNextPlayer(2);

        cx.TryAddToken(3, 0);
        cx.TryAddNextPlayer(3);
        cx.TryAddNextPlayer(0);

        cx.TryAddNextPlayer(2);
        cx.TryAddNextPlayer(3);

        cx.TryAddNextPlayer(1);
        cx.TryAddNextPlayer(0);

        cx.PrintGridState();
        System.out.println(cx.CheckPlayerWinAllColumns(1)); //1
        System.out.println(cx.CheckPlayerWinAllColumns(2)); //-1

        cx.TryAddToken(2, 3);
        cx.TryAddToken(2, 3);

        cx.PrintGridState();
        System.out.println(cx.CheckPlayerWinAllColumns(2)); //3
    }
}

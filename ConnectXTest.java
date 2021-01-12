import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ConnectXTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ConnectXTest
{
    ConnectX cx;
    /**
     * Default constructor for test class ConnectXTest
     */
    public ConnectXTest()
    {
        
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        cx = new ConnectX();
    }

    @Test
    public void ConstructorTest(){        
        assertEquals(6, cx.Width);
        assertEquals(7, cx.Height);
        assertEquals(4, cx.ConnectionsToWin);
    }
    
    @Test
    public void GetCurrentPlayerTest(){
        assertEquals(1, cx.GetCurrentPlayer());
    }
    
    @Test
    public void GetGridTest(){
        assertEquals(6, cx.GetGrid().length);
        assertEquals(7, cx.GetGrid()[0].length);
    }
    
    @Test
    public void ResetGridTest(){
        for(int i = 0; i < cx.Width; i++){
            for(int j = 0; j < cx.Height; j++){
                cx.GetGrid()[0][0] = 1;
            }
        }
        cx.ResetGrid();
        cx.GetGrid()[0][0] = 0;
        for(int i = 0; i < cx.Width; i++){
            for(int j = 0; j < cx.Height; j++){
                assertEquals(0, cx.GetGrid()[i][j]);
            }
        }
    }
    
    @Test
    public void IsColumnFullTest(){
        for(int i = 0; i < cx.Height; i++){
            cx.GetGrid()[0][i] = 1;
        }
        for(int i = 0; i < cx.Height - 1; i++){
            cx.GetGrid()[0][i] = 1;
        }
        assertTrue(cx.IsColumnFull(0));
        assertTrue(!cx.IsColumnFull(1));
        assertTrue(!cx.IsColumnFull(2));
    }
    
    @Test
    public void TryAddTokenTest(){
        assertTrue(!cx.TryAddToken(1,-1));
        assertTrue(!cx.TryAddToken(1,7));
        for(int i = 0; i < cx.Height; i++){
            assertTrue(cx.TryAddToken(1,0));
        }
        assertTrue(!cx.TryAddToken(1,0));
        for(int i = 0; i < cx.Height; i++){
            assertEquals(1, cx.GetGrid()[0][i]);
        }
        assertTrue(cx.TryAddToken(2,1));
        assertEquals(2, cx.GetGrid()[1][0]);
    }
    
    @Test
    public void NextPlayerTest(){
        assertEquals(1, cx.GetCurrentPlayer());
        cx.NextPlayer();
        assertEquals(2, cx.GetCurrentPlayer());
        cx.NextPlayer();
        assertEquals(1, cx.GetCurrentPlayer());
        
    }
    
    @Test
    public void TryAddNextPlayerTest(){
        assertTrue(!cx.TryAddNextPlayer(-1));
        assertEquals(1, cx.GetCurrentPlayer());
        assertTrue(!cx.TryAddNextPlayer(7));
        assertEquals(1, cx.GetCurrentPlayer());
        
        for(int i = 0; i < cx.Height; i++){
            assertTrue(cx.TryAddNextPlayer(0));
        }
        assertEquals(2, cx.GetCurrentPlayer());
        
        assertTrue(!cx.TryAddNextPlayer(0));
        
        for(int i = 0; i < cx.Height; i+=2){
            assertEquals(1, cx.GetGrid()[0][i]);
        }
        for(int i = 1; i < cx.Height; i+=2){
            assertEquals(2, cx.GetGrid()[0][i]);
        }
        
        assertTrue(cx.TryAddToken(2,1));
        assertEquals(2, cx.GetGrid()[1][0]);
    }
    
    @Test
    public void PrintGridTestState(){
      String ss = "            \n            \n            \n2           \n2 1         \n3 1 1 2     \n2 1 2 1     \n";
      //each line has 12 characters because the width is 6
      cx.Populate();
      assertEquals(ss, cx.PrintGridState());
    }
    
    @Test 
    public void CountAcrossTest(){
        cx.Populate();
        assertEquals(0, cx.CountAcross(1, 0, 0));
        assertEquals(1, cx.CountAcross(2, 0, 0));
        assertEquals(1, cx.CountAcross(3, 0, 1));
        assertEquals(2, cx.CountAcross(1, 1, 1));
        assertEquals(1, cx.CountAcross(1, 2, 1));
    }
    
    @Test
    public void CheckRowWinTest(){
        cx.Populate();
        cx.TryAddToken(1,2);
        cx.TryAddToken(1,3);
        cx.TryAddToken(1,4);
        cx.TryAddToken(1,4);
        cx.TryAddToken(1,4);
        
        cx.PrintGridState();
        
        assertTrue(!cx.CheckRowWin(2,0));
        assertTrue(!cx.CheckRowWin(2,1));
        assertTrue(!cx.CheckRowWin(1,0));
        assertTrue(!cx.CheckRowWin(1,1));
        assertTrue(cx.CheckRowWin(1,2)); //should be the only win
        assertTrue(!cx.CheckRowWin(2,3));
        assertTrue(!cx.CheckRowWin(1,3));
        
    }
    
    @Test
    public void CheckPlayerWinAllRowsTest(){
        cx.Populate();
        cx.TryAddToken(1,2);
        cx.TryAddToken(1,3);
        cx.TryAddToken(1,4);
        cx.TryAddToken(1,4);
        cx.TryAddToken(1,4);
        
        assertEquals(-1, cx.CheckPlayerWinAllRows(2));
        assertEquals(2, cx.CheckPlayerWinAllRows(1));

    }
    
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
        
    }
}

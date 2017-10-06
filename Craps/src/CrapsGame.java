// Implements the game of Craps logic

public class CrapsGame
{
  private int point = 0;

  /**
   *  Calculates the result of the next dice roll in the Craps game.
   *  The parameter total is the sum of dots on two dice.
   *  point is set to the saved total, if the game continues,
   *  or 0, if the game has ended.
   *  Returns 1 if player won, -1 if player lost,
   *  0 if player continues rolling.
   */
  public int processRoll(int total)
  {
    int result = 0; 
    if (point == 0)
  {  
    if (total == 7 || total == 11)
    {
    	result =  1;
    }
    else if (total == 2 || total == 3 || total == 12)
    {
    	result = -1;
    }
    else
    {
    	result = 0;
    	point = total;
    }
  }	
  else
  {
    if (total == 7)
    {
    	result = -1;
    	point = 0;
    }
    else if (total == point)
    {
    	 result = 1;
    	 point = 0;
    }
    else
    {
    	result = 0;	
    }
  }
  return result;
 }
  /**
   *  Returns the saved point
   */
  public int getPoint()
  {
    return point;
  }
}


/* || = or
 * set point
 * if first roll point 7 or 11 , win, 1, reset to 0
 * elseif first roll point 2, 3, 12, lose, -1, reset to 0
 * elseif first roll point 7, go to w/e
 *
 * if point 7, lose, -1, reset to 0
 * if pointnumber = pointnumber, 1, win, reset to 0
 *
 *
 *
 *
 */
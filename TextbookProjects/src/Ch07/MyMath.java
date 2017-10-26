package Ch07;

import java.util.Scanner;

public class MyMath
{

	public static boolean isPerfect(int n)
	{
        String result = "The first " + n + " perfect numbers are:";
        int count = 0;
        n = 1;
        
		result = false;
		
		int sum = 0;              //Tracks the sum of factors
				
		for (int k = 1; k < n; k++)
		{
			if (n % k == 0)
			{
				sum += k;
			}	 
		}
		if (sum == n)
		{
			result = true;			
		}		
	    return result;
	}
	
	public static String betterPerfect(int m) // first 6, *= mult
	{
		String result = "The first " + m + " perfect numbers are=";
		
		int n = 4;
		int pow2 = 2;
		int count = 0;
		long perfect = 0;
		
		while (count < m) 
		{
           if (isPrime(n-1))
           {
        	  perfect = (n/2) * (n-1);
        	  result = result = perfect + " ";
        	  
        	  
           }
           pow2++;
           n *= 2;
		}

		
		return result;
	}
	
   public static String perfectNumbers(int n)
   {
	   String result = "The first " + n + " pefect numbers are: ";	   
	   int count = 0;
	   int m = 4;
	   
	   while (count <= m)
	   {  
		   
		   if (isPerfect(n)) //(n % m == 0)
		 {		   
		   result = result + n + " ";
		   count++;
		   //m++;  
	     }	   	   
		  // else if (n % m != 0)
	      //{		   		   
          n++; //m++; 
	      //}
	   }  	   
	   return result;
   }
   

   /**
   * Returns the sum of all integers from 1 to n, if n >= 1,
   * and 0 otherwise.
   */
  public static int sumUpTo(int n)
  {
    int sum = 0;

    for (int k = 1; k <= n; k++)
      sum += k;

    return sum;
  }

  /**
   * Returns 1 * 2 * ... * n, if n >= 1; otherwise returns 1
   */
  public static long factorial(int n)
  {
    long f = 1;

    for (int k = 2; k <= n; k++)
      f *= k;

    return f;
  }

  /**
   * Returns true if n is a prime; otherwise returns false
   */
  public static boolean isPrime(int n)
  {
    if (n <= 1)
      return false;

    int m = 2;

    while (m * m <= n)
    {
      if (n % m == 0)
        return false;
      m++;
    }

    return true;
  }

  /**
   * Tests Goldbach conjecture for even numbers
   * up to bigNum
   */
  public static boolean testGoldbach(int bigNum)
  {
    for (int n = 6; n <= bigNum; n += 2)  // obviously true for n = 4
    {
      boolean found2primes = false;

      for (int p = 3; p <= n/2; p += 2)
      {
        if (isPrime(p) && isPrime(n - p))
          found2primes = true;
      }

      if (!found2primes)
      {
        System.out.println(n + " is not a sum of two primes!");
        return false;
      }
    }

    return true;
  }

  /*********************************************************************/

  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);
    int n;

    do
    {
      System.out.print("Enter an integer from 4 to 20: ");
      n = kb.nextInt();
    } while (n < 4 || n > 20);

    kb.close();

    System.out.println();
    System.out.println("1 + ... + " + n + " = " + sumUpTo(n));
    System.out.println(n + "! = " + factorial(n));
    System.out.println("Primes: ");
    for (int k = 1; k <= n; k++)
      if (isPrime(k))
        System.out.print(k + " ");
    System.out.println();
    System.out.println("Goldbach conjecture up to " + n + ": " + testGoldbach(n));
    System.out.println(isPerfect(28));
  }
}


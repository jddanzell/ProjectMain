/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
package activity3;
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("lazy");
		System.out.println ("sample.indexOf(\"lazy\") = " + position);

		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:
		int notFoundPSN = sample.indexOf("slow");
		System.out.println("sample.indexOf(\"slow\") = " + notFoundPSN);
	
	    int psn = sample.indexOf("the", 10);
		System.out.println(psn);		
        int otherpsn = sample.toLowerCase().indexOf("the");
        System.out.println(otherpsn);
        
      
	}

}

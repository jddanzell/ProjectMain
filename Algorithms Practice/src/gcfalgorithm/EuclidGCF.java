package gcfalgorithm;

public class EuclidGCF
{
      public int gcfParish(int a, int b)
      {
		 int gcf = a;
		 
		 while (a != b)
		 {
			 if (b > a)
			 {
				 b = b - a;
				 
			 }
			 else	 
			 {
				a = a - b; 
			 }
		 }		 
		 
		 return gcf;  
      }

}

//https://codility.com/demo/results/training33W6RH-Y85/
//100%

package Lesson10_PrimeAndCompositeNumbers;

public class MinPerimeterRectangle {
	 public int solution(int N) {
	        // write your code in Java SE 8
	        int f = (int)Math.sqrt(N);
	     
	        if (f*f == N)
	        {
	        	return 4*f;
	        }
	        
	        int minPerimeter = (1+N)*2;
	        for (int i = 1; i <= f; i++)
	        {
	            if (N % i == 0)
	            {
	            	int a = i;
	            	int b = N/i;	            	
	            	int perimeter = 2*(a+b);
	            	minPerimeter = Math.min(minPerimeter, perimeter);
	            }
	        }
	        
	        return minPerimeter;
	    }	
}

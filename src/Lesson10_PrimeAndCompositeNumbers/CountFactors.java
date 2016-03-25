//https://codility.com/demo/results/trainingQDTPZW-KED/
//100%

package Lesson10_PrimeAndCompositeNumbers;

public class CountFactors {
	 public int solution(int N) {
	        // write your code in Java SE 8
	        int f = (int)Math.sqrt(N);
	        
	        int cnt = 0;
	        for (int i = 1; i <= f; i++)
	        {
	            if (N % i == 0)
	            {
	                cnt+=2;
	            }
	        }
	        if (f*f == N)
	        {
	            cnt--;
	        }
	        
	        return cnt;
	    }
}

//https://codility.com/demo/results/training4YNEPE-JTK/
//100%

package Lesson6_Sorting;
import java.util.Arrays;

public class Distinct {
	  public int solution(int[] A) {
	        Arrays.sort(A);
	        int n = A.length;
	        
	        int cnt = 0;
	        for (int i = 0; i < n; ++i)
	        {
	            if (i == 0)
	            {
	                cnt++;                
	            }
	            else
	            {
	                if (A[i] != A[i-1])
	                {
	                    cnt++;
	                }
	            }
	        }
	        return cnt;
	    }
}

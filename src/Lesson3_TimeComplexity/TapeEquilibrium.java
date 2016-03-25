//https://codility.com/demo/results/training6VT9PT-N8S/
//83%

package Lesson3_TimeComplexity;

public class TapeEquilibrium {
public int solution(int[] A) {
		
	    // write your code in Java SE 8
	    int n = A.length;
	    int a = A[0];
	    int b = 0;
	    for (int i = 1;i<n;++i) b+=A[i];
	    int min = Math.abs(a-b);
	    
	    for (int i = 1; i < n; ++i)
	    {
	        a = a + A[i];
	        b = b - A[i];
	        min = Math.min(min, Math.abs(a-b));
	    }
	    return min;
	}
}

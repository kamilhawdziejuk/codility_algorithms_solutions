//https://codility.com/demo/results/trainingUPW8GR-JRR/
//100%

package Lesson4_CountingElements;

public class MissingInteger {
	public int solution(int[] A) {
	      int n = A.length;
	      int max = 1;
	      int M = 100000;
	      for (int i = 0; i < n; ++i)
	      {
	      	max = Math.max(max, A[i]);
	      }	        
	      
	      int minB = Math.min(M, max);
	      
	      int[] B = new int[minB+1];
	      
	      for (int i = 0; i < n; ++i)
	      {
	          if (A[i] <= M && A[i] > 0)
	          {
	              ++B[A[i]];
	          }
	      }
	      
	      for (int i = 1; i <= max ; ++i)
	      {
	          if (B[i] == 0)
	          {
	              return i;
	          }
	      }
	      return max+1;
	  }	
}


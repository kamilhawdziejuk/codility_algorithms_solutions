//https://codility.com/demo/results/training2E7F3C-R4Q/
//100%

package Lesson17_DynamicProgramming;

public class NumberSolitaire {
	public int solution(int[] A) {
        int n = A.length;
        int[] B = new int [n+1];
                
        for (int i = 0; i < n; ++i) B[i] = -2100000000;
        B[0] = A[0];
        
        for (int i = 0; i < n; ++i)
        {
            for (int k = 1; k <= 6; ++k)
            {
                if (i-k >= 0)
                {
                    B[i] = Math.max(B[i], B[i-k] + A[i]);
                }
            }
        }
        return B[n-1];
    }
}

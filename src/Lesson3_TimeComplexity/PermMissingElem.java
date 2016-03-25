//https://codility.com/demo/results/trainingT35CS5-HFJ/
//100%

package Lesson3_TimeComplexity;

public class PermMissingElem {
	public int solution(int[] A) {
		int n = A.length;
		int M = 1000000;
		Math.abs(-1);
		int highestIndex = -1;
		for (int i = 0; i < n; ++i)
		{
			if (A[i] == n+1)
			{
				highestIndex = i;
				break;
			}
		}
		
		if (highestIndex == -1)
		{
			return n+1;
		}

		for (int i = 0; i < n; i++)
		{
			int x = A[i]%M-1;
			if (x >= n)
			{
				continue;
			}
			A[x]+=M;
		}
		for (int i = 0; i < n; i++)
        {
            if (A[i] < M)
                return i+1;
        }
		return 0;
	} 
}

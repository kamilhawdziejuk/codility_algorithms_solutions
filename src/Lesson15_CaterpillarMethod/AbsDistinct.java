//https://codility.com/demo/results/trainingQQENFY-7RC/
//100%
package Lesson15_CaterpillarMethod;

public class AbsDistinct {
	public int solution(int[] A) {
        // write your code in Java SE 8
        int n = A.length;
        
        int i = 0;
        int j = n-1;
        int cnt = 0;
        
        int repeated = 0;
        
        for (int k = 0; k < n; ++k)
        {        
        	if (k > 0 && A[k] == A[k-1])
            {
                repeated++;
            }
        }
        
        while (i < j && A[i] < 0 && A[j] > 0)
        {
            if (i > 0 && A[i] == A[i-1])
            {
                i++;
                continue;
            }
            if (j < n-1 && A[j] == A[j+1])
            {
                j--;
                continue;
            }
            int sum = A[i] + A[j];
            if (sum == 0)
            {
                cnt++;
                i++;
            }
            else if (sum > 0)
            {
                --j;                
            }
            else //sum < 0
            {
                ++i;
            }
        }
        
        int res = n - cnt - repeated;        
        return res;        
    }
}

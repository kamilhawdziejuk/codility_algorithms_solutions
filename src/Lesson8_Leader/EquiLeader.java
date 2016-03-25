//https://codility.com/demo/results/trainingJXHT2R-Q98/
//55%

package Lesson8_Leader;

public class EquiLeader {
	public int solution(int[] A) {

        int n = A.length;
        int[] candidates = new int[n];
        int[] candidates2 = new int[n];
        
        int size = 0;
        int value = -1;
        for (int k =0; k < n; ++k)
        {
            if (size == 0)
            {
                size += 1;
                value = A[k];
            }
            else if (value != A[k])
            {
                size -= 1;
            }
            else
            {
                size += 1;
            }

            if (size > 0)
            candidates[k] = value;
        }
        
        
        size = 0;
        value = -1;
        for (int k = n-1; k>=0; --k)
        {
            if (size == 0)
            {
                size += 1;
                value = A[k];
            }
            else if (value != A[k])
            {
                size -= 1;
            }
            else
            {
                size += 1;
            }

            if (size > 0)
            candidates2[k] = value;
        }
        
        int cnt=0;
        for (int i = 0; i < n-1; i++)
        {
        	if (candidates[i] == candidates2[i+1])
        	{
        		cnt++;
        	}
        				
        }
        
        return cnt;
    }
}

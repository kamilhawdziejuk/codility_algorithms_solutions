//https://codility.com/demo/results/trainingQ4UPHN-WGS/
//100%
package Lesson8_Leader;

public class Dominator {
	public int solution(int[] A) {
        // write your code in Java SE 8
        int n = A.length;
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
        }
        
        int candidate = -1;
        if (size > 0)
        {
            candidate = value;
        }
        int leader = -1;
        int count = 0;

        for (int k = 0; k < n; ++k)
        {
            if (A[k] == candidate)
            {
                count += 1;
            }
        }
        
        if (count > n / 2)
        {
            leader = candidate;
        }
        if (leader != -1)
        {
            for (int k = 0; k< n;++k)
            {
                if (A[k] == candidate)
                {
                    return k;
                }
            }            
        }
        return leader;
    }
}

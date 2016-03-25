//https://codility.com/demo/results/trainingTX8DZG-HBX/
//90%

package Lesson15_CaterpillarMethod;

import java.util.Arrays;

public class CountDistinctSlices {
	 public int calc(int i, int j) {
	    	int d = j-i+1;
	    	return d*(d+1)/2;
		}
		
		int[] addElement(int[] org, int added) {
		    int[] result = Arrays.copyOf(org, org.length +1);
		    result[org.length] = added;
		    return result;
		}	
		
	    public int solution(int M, int[] A) {
	        int Max = 1000000000;
	        int n = A.length;
	    	A = addElement(A, A[n-1]);
	    	n++;
	        int[] B = new int[M+1];
	        for (int k = 0; k <= M; ++k) B[k] = -1;
	        
	        int cnt = 0;
	        int i = 0;
	        int j = 0;
	        while (j < n)
	        {
	            int b = A[j];
	            if (B[b] != -1)
	            {            	
	            	cnt += calc(i,j-1);
	            	if (cnt > Max)
	            	{
	            	    return Max;
	            	}
	                int i2 = B[b];                
	                while (i <= i2)
	                {
	                	int a = A[i];
	                    B[a]=-1;
	                    i++;
	                }
	                cnt -= calc(i,j-1);
	            }
	            else
	            {
	                B[b]=j;
	                j++;
	            }
	        }
	        return cnt;
	    }
}

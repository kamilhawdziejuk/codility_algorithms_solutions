package Lesson2_Arrays;
//https://codility.com/demo/results/trainingC86F95-BK9/
//100% solution

public class OddOccurrencesInArray {
	
	int GetNumber(int a, int pos)
	{
		int k = -1;
		for (int i = 0; i <= pos; ++i)
		{
			int d = a / 10;
			k = a - d * 10;
			a = d;
		}		
		return k;
	}	
	
	public int solution(int[] A) {    
    	
    	int n = A.length;
    	int length = 0;
    	int[] L = new int [12];

		int maxL = -1;
		for (int i = 0; i < n; ++i)
		{
			int l = String.valueOf(A[i]).length();
			L[l]++;
			maxL = Math.max(maxL, l);
		}

		//calculates length to consider
		for (int i = 1; i <= maxL; ++i)
		{
			if (L[i] % 2 == 1)
			{
				length = i;
				break;
			}
		}
    	
		String res = new String();
		
		int min = (int)Math.pow(10, length-1);
		int max = min*10-1;
		
    	for (int l = 0; l < length; ++l)
    	{
    		int[] B = new int[10];
    		
    		for (int i = 0; i < n; ++i)
    		{
    			//if (calcDigitLenght(A[i]) == length)
    			if (A[i] >= min && A[i] <= max)
    			{
    				int num = GetNumber(A[i],l);
    				B[num]++;
    			}    			
    		}
    		
    		int oddDigitsNumber = -1;
    		for (int p = 9; p >= 0; --p)
    		{
    			if (B[p] % 2 == 1)
    			{
    				oddDigitsNumber = p;
    				break;
    			}
    		}
    		
    		res = String.valueOf(oddDigitsNumber) + res;
    	}
    	return Integer.valueOf(res);
    }    
}

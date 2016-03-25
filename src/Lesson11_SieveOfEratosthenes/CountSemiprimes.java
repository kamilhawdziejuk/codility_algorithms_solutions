//https://codility.com/demo/results/trainingQKDZ9K-ZZT/
//100%

package Lesson11_SieveOfEratosthenes;

import java.util.*;
public class CountSemiprimes {
	boolean[] sieve;
    public List<Integer> getPrimes(int n)
    {
         sieve = new boolean[n+2];
         sieve[0] = true;
         sieve[1] = true;
         int i = 2;
         while (i*i <= n)
         {
             if (!sieve[i])
             {
                 int k = i*i;
                 while (k <= n)
                 {
                     sieve[k] = true;
                     k+=i;
                 }
             }
             i+=1;
         }
         List<Integer> res = new LinkedList<>();
         for (int j = 1; j <= n; ++j)
         {
             if (!sieve[j])
             {
                 res.add(j);
             }
         }
         return res;
    }    
    
    public int[] solution(int N, int[] P, int[] Q)
	{
		int[] t = calc(N);
		int l = P.length;
		
		int[] res = new int[l];
		for (int i = 0; i < l; ++i)
		{
			int a = P[i];
			int b = Q[i];
			if (a > 0) a--;
			int c = t[b]-t[a];
			res[i]=c;
		}
		return res;
	}
	
	public int[] calc(int n)
	{
		List<Integer> primes = getPrimes(n);
		int m = primes.size();
		int[] t = new int[n+1];
		for (int i =0; i < m; ++i)
		{
			int a = primes.get(i);

			for (int j =0; j < m; ++j)
			{
				int b = primes.get(j);
				int ab = a*b;
				if (ab <= n)
				{
					t[ab] = 1;
				}
				else
				{
					break;
				}
			}			
		}
		
		int cnt = 0;
		for (int i = 0; i <= n; ++i)
		{
			if (i > 0)
			{
				if (t[i] > 0)
				{
					t[i] = t[i-1]+1;
				}
				else
				{
					t[i] = t[i-1];
				}
			}
		}
		return t;
	}
	
}

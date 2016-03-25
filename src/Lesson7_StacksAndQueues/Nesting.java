//https://codility.com/demo/results/trainingFHSFQA-MFX/
//100%

package Lesson7_StacksAndQueues;

public class Nesting {
	public int solution(String S) {
        // write your code in Java SE 8
	 	//String a = new String();
        int n = S.length();
        int l = 0;
        for (int i =0; i< n;i++)
        {
        	char c = S.charAt(i);
        	if (c == '(')
        	{
        		l++;
        	}
        	else if (c == ')')
        	{
        		if (l > 0)
        		{
        			l--;
        		}
        		else
        		{
        			return 0;
        		}
        	}
        	else
        	{
        		return 0;
        	}
        }
        if (l == 0)
        {
        	return 1;
        }
        return 0;
    }
}

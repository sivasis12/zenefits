/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char ch[]=new char[n];
		for(int i=0;i<n;i++)
		{
		    ch[i]=sc.next().charAt(0);
		}
		String word=sc.next();
		ArrayList<Character> rank=new ArrayList<Character>(n);
		Arrays.sort(ch);
		for(int i=0;i<n;i++)
		{
		    rank.add(ch[i]);
		}
		int fact[]=new int[n+1];
		fact[0]=1;
		fact[1]=1;
		for(int i=2;i<=n;i++)
		{
		    fact[i]=fact[i-1]*i;
		}
		int ans=0;
		int l=word.length();
		for(int i=0;i<word.length();i++)
		{
		   
		    char c=word.charAt(i);
		    int idx=rank.indexOf(c);
		    ans+=fact[l-1-i]*(idx);
		    rank.remove(idx);
		    
		    
		}
		System.out.println(ans+1);
		
		
	}
}

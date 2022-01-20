package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*

	 */
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int ar[]=new int[T];
        for(int i=0;i<T;i++)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int s;int c;
            for(int j=1;j<=1000;j++)
            {
                s=x+y+j;c=0;
                for(int k=2;k<s;k++)
                {
                    if(s%k==0)
                        ++c;
                }
                if(c==0)
                {
                    ar[i]=j;
                    break;
                }
            }
        }
        for(int y=0;y<T;y++)
        {
            System.out.println(ar[y]);
        }
    }
}


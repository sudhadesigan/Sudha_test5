package test;

import java.util.*;
import java.io.*;


class Javaloops{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
           int d =0;	
		    
		    		
		    	for (int j=0;j<n;j++)
		    	{
		    		
		    	d= d+(int) Math.pow(2,j)*b;
		    	
		    	
		   System.out.print(d+a+ " ");
        }
        }
        in.close();
    }
    
}
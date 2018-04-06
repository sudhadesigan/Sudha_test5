package test;

import java.util.Scanner;

public class Outputformatting {

    public static void main(String[] args) {
    	
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            
            for(int i=0;i<4;i++)
            {
                String s1=sc.next();
                
                int x=sc.nextInt(i);
               
          // System.out.println("%-15s%2d",s1,x);
             
                System.out.printf( "%-15s%03d\n", s1, x);
            }
        
            System.out.println("================================");

    }
}


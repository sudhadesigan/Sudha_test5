package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class poker {
	public static void main(String args[])
	{
	
	String[] input={"SU","SUDHA","HABEEB"};
	int[] score=new int[input.length];
	Map<Integer,String> unsorted=new HashMap<Integer,String>();
	

	for(int i=0;i<input.length;i++)
	{
		
		score[i]=0;
		for(int j=0;j<input[i].length();j++)
		{
		
		char c=input[i].charAt(j);
		
		int value;
		if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		{
			value=(Character.getNumericValue(c)-9)*2;
		}
		else
			value=(Character.getNumericValue(c)-9);
		
		score[i]=score[i]+value;
		}
		
		System.out.println(score[i]);
		unsorted.put(score[i], input[i]);
	//loop- calculate the score of each word
		
	}
	Map<Integer,String> treeMap = new TreeMap<Integer, String>(unsorted);
	for (Entry<Integer, String> entry : treeMap.entrySet()) {
        System.out.println(entry.getValue());
	

	}
	}
	
}

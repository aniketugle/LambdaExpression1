package com.cjc.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SortingUsingLambdaExpression {
	
	
	public static void main(String[] args) {
		
		List<Integer>list=new ArrayList<Integer>();
		
		list.add(11);
		list.add(15);
		list.add(6);
		list.add(3);
		list.add(99);
		list.add(33);
		list.add(25);
		list.add(10);
		System.out.println("No sorting");
		System.out.println(list);
		
		System.out.println("ascending order");
		Comparator<Integer> c1=(i1,i2)->{return (i1<i2)?-1:(i1>i2)?1:0;};
		
		Collections.sort(list,c1);
		
		System.out.println(list);
		
		
		System.out.println("descending order");
		Comparator<Integer> c2=(i1,i2)->{return (i1>i2)?-1:(i1<i2)?1:0;};
		
	
		
		Collections.sort(list,c2);
		
		System.out.println(list);
	}

}

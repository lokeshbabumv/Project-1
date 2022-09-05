package org.array;
public class ArrayTest
{
	public static void main(String[] args) {
		
 int sum=0;
 int a[]= {1, 2, 3, 4, 5, 6, 7};
 for (int i = 0; i < a.length; i++) {
sum=sum+a[i];	
System.out.println("sum of all array is :"+sum);
}
 int b=a.length;
 System.out.println("no of numbers in array is :"+b);
 
 double average=0;
 average = sum/b;
 System.out.println("average of number in array is :"+average);
 
	int sub=0;
	sub=b-a[3];
	System.out.println("subtration of average and 3rd integer :"+sub);
		
		
	
	
	}
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	


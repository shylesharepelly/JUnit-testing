package com.javatpoint.logic;

public class Calculation {
	
	public static int findMax(int arr[]){  
        int max=arr[0];  
        for(int i=1;i<arr.length;i++){  
            if(max<arr[i])  
                max=arr[i];  
        }  
        return max;  
    } 
	public static int findAdd(int arr[]){  
        int sum=0;  
        for(int i=0;i<arr.length;i++){  
            sum=sum+arr[i];
        }  
        return sum;  
    } 

}

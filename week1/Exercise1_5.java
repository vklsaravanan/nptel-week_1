package week1;

import java.util.Scanner;

public class Exercise1_5 {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        double mark_avg;
        int result;
        int i;
        int s;
     //define size of array
      s = input.nextInt();
    //The array is defined "arr" and inserted marks into it.
     int[] arr = new int[s];   
     for(i=0;i<arr.length;i++)
	  {
	arr[i]=input.nextInt();
       }
  //.......................................................//
	i=0;
 //Initializing maximum element as first element of the array
	result=arr[0];
	while(i<arr.length) {
 //Traverse array elements to get the current max.	
		if(arr[i]>=result) {
 //Storing the highest mark in the variable result.
			result=arr[i]; } 	
     i++;	}
	
	 i=0;mark_avg=0;	
	while(i<arr.length) {
	  mark_avg+=arr[i];
	i++;}
 //Storing average mark in avgMarks.
	mark_avg/=arr.length; 
	
     System.out.println(result);
     
     System.out.print(mark_avg);
     
     
     
	}

}

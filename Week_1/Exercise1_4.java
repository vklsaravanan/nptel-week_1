Week 1 : Programming Assignment 4 

QN : Complete the code segment to check whether the number is an Armstrong number or not.
...............................................................................

import java.util.Scanner;
public class Exercise1_4 {
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
           int result=0;
	       int noOfDigits=0;  
		   int total=0;
       
      //Answer given below for NPTEL 
...............................................................................       
     // Finding digits in given number using while loop
 
           int temp =n
	   while(temp>0) {    
		   temp/=10;
	       noOfDigits++;  }
             
		 temp=n;          
	   //Using while loop check the number is Armstrong or not
	   while(temp>0){           
		    result=temp%10; 
	        total+=Math.pow(result, noOfDigits);		    	   
            temp/=10; } 
		       
		      if(total==n) {result=1; }  
 
		      else { result=0; }         

		 
			  System.out.print(result);  
		
   
  ...............................................................................
		
    }
  }
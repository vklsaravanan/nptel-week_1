Week 1: Programming Assignment 1 

QN : Complete the code segment to find the perimeter and area of a circle given a value of radius.
You should use Math.PI constant in your program. If radius is zero or less than zero then print " please enter non zero positive number ".

...............................................................................

import java.util.Scanner;  
public class Exercise1_1 {
       public static void main(String[] args) {
Scanner s = new Scanner(System.in); 
       double radius= s.nextDouble();
       double perimeter;
       double area;
       
        
// Answer is given below for NPTEL
...............................................................................

if(radius<=0){
	System.out.println(" please enter non zero positive number ");
}
else{
	System.out.println(perimeter =2*Math.PI*radius);
	System.out.print(area =Math.PI*radius*radius);
}

...............................................................................


 }
}

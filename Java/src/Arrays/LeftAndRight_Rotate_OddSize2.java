package Arrays;

import java.util.Arrays;
//Odd Size Array Elements: Include middle element in Second half.
//[1,2,3,4,5,6,7,8,9]  -----> [2,3,4,1,9,5,6,7,8]

public class LeftAndRight_Rotate_OddSize2 {

	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5,6,7,8,9};
		
		// Rotate the left half to the left
		int first = a[0];
		for (int i = 0; i < a.length/2-1; i++) {
			a[i] = a[i+1];
		}
		a[a.length/2-1] = first;
		
		// Rotate the Right half to the right
		int last = a[a.length-1];
		for (int i = a.length-1; i >= a.length/2; i--) {
			a[i] = a[i-1];
		}
		a[a.length/2] = last;
		
		System.out.println("In odd size array Include middle element in Second half is: "+Arrays.toString(a));
	}
}

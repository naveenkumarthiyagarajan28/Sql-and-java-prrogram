/*How to Sort Array in Java?
 * lets take array[]={10,223,256,567,520,12};
 */

import java.util.*;
public class ArraySort {

	
	public static void main(String[] args) {
	int[] array=new int[]{10,223,256,567,520,12};	
	Arrays.sort(array);
	System.out.println("Array Sorted in:");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}
}

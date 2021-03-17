package pegasus;

import java.util.Scanner;

public class AdjacentElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("The input contains the number of elements in the array:");
	    int input = scanner.nextInt();
	    System.out.println("The second line contains the elements of the array separated by spaces2:");
	    int[] array = new int[input];
	    int store = 0;
	    int max = 0;
	    for(int i = 0; i<array.length; i++) {
	        array[i] = scanner.nextInt();
	    }
	    for(int j = 0; j<array.length-1; j++) {
	        store = array[j]*array[j+1];
	        if(store > max) {
	            max = store;
	        }
	    }
	    System.out.println(max);
	}

}

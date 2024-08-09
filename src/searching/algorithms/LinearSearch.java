package searching.algorithms;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n=scan.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the array Elements");
		for(int i=0;i<ar.length;i++) {
			ar[i]=scan.nextInt();
		}
		System.out.println("Enter the Element to search");
		int key=scan.nextInt();
	    if(	linearSearch(ar,key)==-1) {
	    	System.out.println("Element not found");
	    }
	    else {
	    	System.out.println("Element found at index: "+linearSearch(ar,key));
	    }

	}
	static int linearSearch(int[] ar,int k) {
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==k) {
				return i;
			}
			else {
				i++;
			}
		}
		return -1;
	}

}

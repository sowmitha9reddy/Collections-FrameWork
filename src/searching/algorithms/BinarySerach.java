package searching.algorithms;

import java.util.Arrays;
import java.util.Scanner;

import sorting.algorithms.BubbleSort;

public class BinarySerach {
   
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
	    if(	binarySearch(ar,key)==-1) {
	    	System.out.println("Element not found");
	    }
	    else {
	    	System.out.println("Element found at index: "+binarySearch(ar,key));
	    }


	}
	static int binarySearch(int[] ar,int key) {
		Arrays.sort(ar);
		
		int low=0;
		int high=ar.length-1;
		int mid=0;
		while(low<=high) {
			mid=(low+high)/2;
			if(key==ar[mid]) {
				return mid;
			}
			else if(key<ar[mid]) {
				high=mid-1;
			
			}
			else {
				low=mid+1;
				
			}
		}
		return -1;
	}
	

}

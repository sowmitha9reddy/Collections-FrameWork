package sorting.algorithms;

import java.util.Scanner;

public class SelectionSort {
	static void selectionSort(int[] ar) {
		int min_i=0;
		int temp=0;
		for(int i=0;i<ar.length-1;i++) {
			min_i=i; // assuming minumium element in true index;
			for(int j=i+1;j<ar.length;j++) // for true index finding 
				{  if(ar[j]<ar[min_i]) {
					min_i=j;
				}
				
				
				
			}
			temp=ar[i];
			ar[i]=ar[min_i];
			ar[min_i]=temp;
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt(); 
		int[] ar=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=scan.nextInt();
		}
		selectionSort(ar);
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+ " ");
		}

	}

}

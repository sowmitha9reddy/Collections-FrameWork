package sorting.algorithms;

import java.util.Scanner;

public class InsertionSort {
	static public void insertion(int[] ar) {
		int key=0;
		int j=0;
		for(int i=1;i<ar.length;i++) {
			j=i-1;
			key=ar[i];
			while(j>=0 && ar[j]>key) { // in case of decsending order  ar[j<key;u
				ar[j+1]=ar[j];
				j--;
				
			}
			ar[j+1]=key;
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt(); 
		int[] ar=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=scan.nextInt();
		}
		insertion(ar);
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+ " ");
		}

	}

}

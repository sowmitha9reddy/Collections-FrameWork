package sorting.algorithms;

import java.util.Scanner;

public class BubbleSort {
	static int[] bubbleSort(int[] ar){
		int temp=0;
		for(int i=0;i<ar.length-1;i++) {
			for(int j=0;j<ar.length-i-1;j++) {
				if(ar[j]>ar[j+1]) {
					temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
					
				}
			}
		}
		return ar;
	}
	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt(); 
			int[] ar=new int[n];
			for(int i=0;i<ar.length;i++) {
				ar[i]=scan.nextInt();
			}
			bubbleSort(ar);
			for(int i=0;i<ar.length;i++) {
				System.out.print(ar[i]+ " ");
			}
			

	}

}


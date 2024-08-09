package sorting.algorithms;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = scan.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }
        System.out.println("Before sorting");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();

        mergeSorting(ar, 0, ar.length - 1);

        System.out.println("After sorting");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }

    public static void mergeSorting(int[] ar, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSorting(ar, l, mid);
            mergeSorting(ar, mid + 1, r);
            merge(ar, l, mid, r);
        }
    }

    private static void merge(int[] ar, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] lAr = new int[n1];
        int[] rAr = new int[n2];

        for (int i = 0; i < n1; i++) {
            lAr[i] = ar[l + i];
        }
        for (int i = 0; i < n2; i++) {
            rAr[i] = ar[mid + 1 + i];
        }

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (lAr[i] <= rAr[j]) {
                ar[k++] = lAr[i++];
            } else {
                ar[k++] = rAr[j++];
            }
        }

        while (i < n1) {
            ar[k++] = lAr[i++];
        }

        while (j < n2) {
            ar[k++] = rAr[j++];
        }
    }
}

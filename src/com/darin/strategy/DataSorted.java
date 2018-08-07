package com.darin.strategy;
public class DataSorted {
	
	public static void  sort(Object[] a) {
		for(int i=a.length;i>0;i--) {
			for(int j=0;j<i-1;j++) {
				Comparable o1 = (Comparable)a[j];
				Comparable o2 = (Comparable)a[j+1];
				if(o1.compareTo(o2)==1) {
					swap(a,j,j+1);
				}
			}
			
		}
	}

	private static void swap(Object[] a, int x, int y) {
		Object temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
	public static void p(Object[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}

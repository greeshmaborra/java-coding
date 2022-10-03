package com.hexaware.removeduplicates;

public class RemoveDuplicates {
	
public static int removeduplicates(int a[], int n)
			{
				if (n == 0 || n == 1) {
					return n;
				}

			
				int[] temp = new int[n];
				int j = 0;

				for (int i = 0; i < n - 1; i++) {
					if (a[i] != a[i + 1]) {
						temp[j++] = a[i];
					}
				}

				temp[j++] = a[n - 1];

				
				for (int i = 0; i < j; i++) {
					a[i] = temp[i];
				}

				return j;
			}
			public static void main(String[] args)
			{
				int a[] = { 23,12,45,67,90,23,54,67,8,1,14};
				int n = a.length;

				n = removeduplicates(a, n);

				
				for (int i = 0; i < n; i++)
					System.out.print(a[i] + " ");
			}
		}



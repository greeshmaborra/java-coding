package com.hexaware.commonoffour;
import java.util.*;
public class CommonElementofFour {
	
	public static void main(String[] args) {
		ArrayList<Integer> common = new ArrayList<Integer>();
	   int array1[] = {2, 4, 8};
	   int array2[] = {2, 3, 4, 8, 10, 16};
	   int array3[] = {2, 4, 8, 14, 40};
	   int array4[] = {6,9,7,2};
		int x = 0, y = 0, z = 0 ,a =0;
		while (x < array1.length && y < array2.length && z < array3.length && a<array4.length){
			if (array1[x] == array2[y] && array2[y] == array3[z] && array3[z] == array4[a]){
				common.add(array1[x]);
				x++;
				y++;
				z++;
				a++;
			}
			else if (array1[x] < array2[y])
				x++;
			else if (array2[y] < array3[z])
				y++;
			else if (array3[z] == array4[a])
				z++;
			else
				a++;
		}
		System.out.println("Common elements from four sorted (in non-decreasing order ) arrays: ");
	System.out.println(common);
	}
	}


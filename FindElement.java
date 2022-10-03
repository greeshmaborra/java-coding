package com.hexaware.findingelement;

public class FindElement {

	public static void main(String[] args) {
		int[] num = {23,12,45,67,90,23,54,67,8,1,14};
	    int toFind = 65;
	    boolean found = false;

	    for (int n : num) {
	      if (n == toFind) {
	        found = true;
	        break;
	      }
	    }
	    
	    if(found)
	      System.out.println(toFind + " is found.");
	    else
	      System.out.println(toFind + " is not found.");
	  }
	}
package Array;

import java.util.Scanner;

public class dIAGONAL_elements 
{
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	System.out.println("enter no. of elements of  1st array: ");
	int m = s.nextInt();
	System.out.println("enter no. of elements of 2 nd array");
	int n = s.nextInt();
	int a[][]= new int[m][n];
	
	if (m!=n)
		System.out.println("not possible");
	
	else {
		System.out.println("enter elements");
		for (int i=0;i<m;i++) {
		for(int j=0;j<n;j++) {
			a[i][j]=s.nextInt();
		}
		System.out.println();
		}
	System.out.println(m +" * "+n +" matrix is: ");
	for (int i=0;i<m;i++) {
		for(int j=0;j<n;j++) {
			System.out.print(a[i][j]);
		}
		System.out.println();
	}
	
	System.out.println("Diagonal elements are");
	for (int i=0;i<m;i++) {
		for(int j=0;j<n;j++) {
			if(i==j)
			System.out.print(a[i][j]);
		}
	}
}
}
}
		



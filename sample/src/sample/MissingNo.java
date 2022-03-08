package sample;

import java.util.Arrays;

public class MissingNo {
	public static void miss(int arr[], int no) {
		int count =0;
		for(int i=arr[0];i<arr[no-1];i++) {
			if (arr[count]==i)
			{
				count++;
			}
			else {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,4,9,5,7,9};
		Arrays.sort(arr);
		for(int i :arr)
		System.out.println(i);
		int no=arr.length;
		System.out.println("Missing Elements of array are :");
		miss(arr,no); 
	}

}

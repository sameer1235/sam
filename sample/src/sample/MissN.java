package sample;

import java.util.Arrays;

public class MissN {

	public static void main(String[] args) {
		int a[]= {1,3,9,5,6,7,8};
		int count=0;
		int length= a.length;
		Arrays.sort(a);
		for(int i: a)
			System.out.println(i);
		System.out.println("missed Element");
		for(int i=1;i<length-1;i++) {
			if(a[count]==i) {
				count++;	
			}else {
				System.out.println(i);
			}
		
		}

	}

}

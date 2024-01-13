package luanch1;

import java.util.Arrays;

public class Arr {

	public static void main(String[] args) {
	
	int[] ar=new int[5];
	for(int ele:ar) {
		System.out.print(ele+" ");
		
	}
	System.out.println();

	Arrays.fill(ar, 5);
	
	for(int ele:ar) {
		System.out.print(ele+" ");
		
	}
	System.out.println();

	int[]arr= {1,3,4,0,0,0,0,7};
	
	Arrays.fill(arr,4,8, 10);
	
	
	for(int ele:arr) {
		System.out.print(ele+" ");
		
	
	}
	System.out.println();
	
	
	int[] a= {34,2,6,88,44,100};;
	Arrays.sort(a);

	for(int ele:a) {
		System.out.print(ele+" ");
		
	
	}
	System.out.println();
	
	
	int res=Arrays.binarySearch(a, 44);
	System.out.println(res);
	
	
	
	

}
}

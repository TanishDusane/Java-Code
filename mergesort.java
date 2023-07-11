import java.util.*;

class Solution {
	static void mergeSort(int[] arr,int l,int r){
	     if(l >= r){
			 return;
		 }
		
		int mid = l + (r-l)/2;
		mergeSort(arr,l,mid);
		mergeSort(arr,mid+1,r);
		conquer(arr,l,mid,r);
	}

	static void conquer(int arr[], int left, int mid, int right){
		int merge[] = new int[right-left + 1];
		int idx1 = left;
		int idx2 = mid + 1, x = 0;

		while(idx1 <= mid && idx2 <= right){
			if(arr[idx1] <= arr[idx2]){
				merge[x++] = arr[idx1++];
			} else{
				merge[x++] = arr[idx2++];
			}
		}

		while(idx1 <= mid){
			merge[x++] = arr[idx1++];
		}

		while(idx2 <= right){
			merge[x++] = arr[idx2++];
		}

		for(int i = 0, j = left; i < merge.length; i++, j++){
			arr[j] = merge[i];
		}
	}
}

public class mergesort {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = input.nextInt();

        input.close();
        Solution Obj = new Solution();
        Obj.mergeSort(a,0,n-1);
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
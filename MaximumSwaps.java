import java.util.*;

class Solution{
    static int MaxSwap(int num){
        int ct = 0, n = num, x = 0;

		while(n > 0){
			int temp = n % 10;
			ct++;
			n /= 10;
		}

		int arr[] = new int[ct];

		while(num > 0){
			int temp = num % 10;
			arr[x++] = temp;
			num /= 10;
		}

		int max1 = 0, ind = -1;
		
        for (int i = 0; i < ct; i++) {
            if (arr[i] >= max1) {  // Updated condition to include equal digits
                max1 = arr[i];
                ind = i;
            }
        }

		if(arr[0] < arr[ind]){
			int temp = arr[0];
			arr[0] = arr[ind];
			arr[ind] = temp;
		}

		return number(arr);
    }

	static int number(int arr[]){
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++){
			sum = (sum * 10 ) + arr[i];
		}

		return sum;
	}
}

class MaximumSwaps {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
 
		while(t-- > 0){
            int n = sc.nextInt();             
            System.out.println(new Solution().MaxSwap(n));
        }
    }
}
import java.util.Scanner;

public class Main {

	public static int Solution(int n, int[] arr, int k) {
		int[] arr_sum = new int[n];
		arr_sum[0] = arr[0];
		for(int i=1; i<n; i++) {
			arr_sum[i] = arr_sum[i-1]+arr[i];
		}

		int max = 0;
		for (int i=0; i<n; i++) {
			if(i+k <n) {
				max = Math.max(max,arr_sum[i+k]-arr_sum[i]);
			}
			else {
				max = Math.max(max, arr_sum[n-1] - arr_sum[i]+arr_sum[(i+k)%n]);
			}
		}
		
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] arr = new int[N];
		for(int i =0; i<N; i++) arr[i] = sc.nextInt();
		
		System.out.print(Solution(N,arr,K));
	}

}

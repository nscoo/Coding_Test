
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double a = -1;
		double arr[] = new double [n];
		
		for(int i=0; i<n; i++) {
			arr[i] =sc.nextDouble();
			a = arr[i] > a ? arr[i] : a; 
		}
		double tmp =0;
		for(int i=0; i<n; i++) {
			arr[i] = arr[i]/a*100;
			tmp+=arr[i];
		}
		System.out.print(tmp/n);
		
		
	}
}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 0;
		while (sum != 1) {
			sum = 0;
			while (num != 0) {
				int val = num % 10;
				sum +=Math.pow(val,2);
				num = num / 10;
				
			}
			num=sum;
			if(num<10 && num ==1 || num == 7) {
				System.out.println("HAPPY");
				break;
			}else if(num <10 && (num!=1 && num!=7)) {
				System.out.println("UNHAPPY");
				break;
			}
			
		}
	}

}

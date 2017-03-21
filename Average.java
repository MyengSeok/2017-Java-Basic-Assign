import java.util.Scanner;

public class Average { 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print("입력할 최대 실수의 갯수를 입력하세요. >> ");    
        Scanner input = new Scanner(System.in);  
        int size = input.nextInt();    
        System.out.println("\n중간에 0을 입력하면 이전 입력자료로 계산하고 종료합니다.");  
        System.out.print("실수 " + size + "개를 입력하세요. >> ");    
        
        //프로그래밍 하세요.
        
        System.out.println("합: " + sum + ", 평균: " + sum/size);
    }
}
import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;

		System.out.print("입력할 최대 실수의 갯수를 입력하세요. >> ");

		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);

		int size = input.nextInt();

		double[] x = new double[size];
		
		System.out.println("\n중간에 0을 입력하면 이전 입력자료로 계산하고 종료합니다.");
		System.out.print("실수 " + size + "개를 입력하세요. >> ");

		// 프로그래밍 하세요.

		for (int i = 0; i < size; i++) {
			x[i] = input2.nextDouble();
			if (x[i] == 0) {
				size = i;
				break;
			}
		}
		
		for (int r = 0; r <= size; r++) {
			sum += x[r];
		}
		
		System.out.println("합: " + sum + ", 평균: " + sum / size);
	}
}

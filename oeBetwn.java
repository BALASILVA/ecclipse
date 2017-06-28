package fibonasis;
import java.util.Scanner;
public class oeBetwn {
		public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	sc.close();
	for(int i=num1;i<=num2;i++){
	if(i%2==1){
		System.out.println(i);
      }
	}
	}
}

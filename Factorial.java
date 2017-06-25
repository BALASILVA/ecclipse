package fibonasis;
import java.util.Scanner;
public class Factorial {
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number to find factorial");
	int num=sc.nextInt();
	sc.close();
	int fac=1;
	for(int i=num;i>0;i--){
		fac=fac*i;
	}
	System.out.println("The Factorial is:"+fac);
}
}

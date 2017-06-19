package fibonasis;
import java.util.Scanner;
public class HCF {
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the two numbers by usser");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	int min=Math.min(num1, num2);
	sc.close();
	int hcf=0;
	for(int i=min;i>0;i--){
		if((num1%i)==0&&(num2%i)==0){
		 hcf=i;
			break;
		}
	}
	System.out.println("The hcf is:"+hcf);
}
}

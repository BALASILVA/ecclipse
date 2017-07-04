package fibonasis;
import java.util.Scanner;
public class MultipleOfEltOfArrayExcptIValue {
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of array");
	int len=sc.nextInt();
	int a[]=new int[len];
	System.out.println("Enter the element of array");
	for(int i=0;i<len;i++){
		a[i]=sc.nextInt();
	}
	for(int i=0;i<len;i++){
		int result=1;
		for(int j=0;j<len;j++){
			if(i!=j){
				result=result*a[j];
			}
		}
		System.out.println("The output of A["+i+"] is:"+result);
	}
}
}

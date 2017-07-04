package fibonasis;
import java.util.Scanner;
public class hunterrrrrrr29 {
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of array");
	int len=sc.nextInt();
	int a[]=new int[len];
	for(int i=0;i<len;i++){
		a[i]=sc.nextInt();
		}
	int sum1=0;
	int sum2=0;
	for(int i=0;i<len;i++){
    	sum1=sum1+a[i];
				if(sum2<sum1){
					sum2=sum1;
				}
		if(sum1<0){
			sum1=0;
		}
	}
	System.out.println("The max contiguous sum is:"+sum2);
	}
}

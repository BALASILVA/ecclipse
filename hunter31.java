package fibonasis;
import java.util.Scanner;
public class hunter31 {
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of a array");
	int len=sc.nextInt();
	int a[]=new int[len];
	System.out.println("Enter the element of array");
	for(int i=0;i<len;i++){
		a[i]=sc.nextInt();
	}
	int p1=1;
	int p2=0;
	for(int i=0;i<len;i++){
		p1=p1*a[i];
		if(p1>p2){
			p2=p1;
		}
		if(p1<0){
			p1=1;
		}
	}
	System.out.println("The maximum product value subarray is:"+p2);
}
}

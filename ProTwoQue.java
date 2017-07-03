package fibonasis;
import java.util.Scanner;
public class ProTwoQue {
public static void main(String[]args){
	System.out.println("Enter thr number");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	String n=String.valueOf(num);
	int a[]=new int[n.length()];
	System.out.println("Enter the number of temp to remove");
	int rem=sc.nextInt();
	int r=n.length()-rem;
	for(int i=0;i<n.length();i++){
		a[i]=num%10;
		num=num/10;
		}
	int temp;
	for(int i=0;i<n.length()-1;i++){
		for(int j=i+1;j<n.length();j++){
			if(a[i]>a[j]){
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		}
	}
	for(int i=0;i<r;i++){
	System.out.print(a[i]);	
	}
}
}

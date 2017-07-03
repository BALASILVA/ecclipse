package fibonasis;
import java.util.Scanner;
public class closeToZero {
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int len=sc.nextInt();
	System.out.println("Enter the element of array");
	int a[]=new int[len];
	for(int i=0;i<len;i++){
		a[i]=sc.nextInt();
	}
	int temp=0;
	int result=0;
	for(int i=0;i<len;i++){
		for(int j=0;j<len;j++){
				if((a[i]>a[j])){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
			}
		}
	}
	for(int i=0;i<len;i++){
		System.out.println(a[i]);
	}
	int temp0=Math.abs(a[0]+a[1]);
	int temp1=a[0];
	int temp2=a[1];
	for(int i=0;i<len;i++){
		for(int j=i+1;j<len;j++){
			if(i!=j){
			if((Math.abs(a[i]+a[j])<temp0)){
				temp0=Math.abs(a[i]+a[j]);
				temp1=a[i];
				temp2=a[j];
			}
			}
		}
	}
	System.out.println(temp1+" and "+temp2);
	}
}

package fibonasis;
import java.util.Scanner;
public class iAddJEqlToK {
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int len=sc.nextInt();
	int a[]=new int[len];
	System.out.println("Enter the element of array");
	for(int i=0;i<len;i++){
		a[i]=sc.nextInt();
	}
	for(int i=0;i<len;i++){
		for(int j=i+1;j<len;j++){
		if(i!=j){
			int sum=a[i]+a[j];
		for(int k=0;k<len;k++){
			if(k!=i&&k!=j){
				if(sum==a[k]){
					System.out.println(a[i]+"+"+a[j]+"="+a[k]);
				}
			}
		}
		}
		}
	}
	}
}

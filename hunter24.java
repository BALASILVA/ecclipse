package fibonasis;
import java.util.Scanner;
public class hunter24 {
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of array");
	int len=sc.nextInt();
	int a[]=new int[len];
	for(int i=0;i<len;i++){
		a[i]=sc.nextInt();
	}
	System.out.println("Enter your Target");
	int target=sc.nextInt();
	sc.close();
	int count=1;
	for(int i=0;i<len-1;i++){
		for(int j=i+1;j<len;j++){
			int sum=0;
			if(j!=i){
				sum=a[i]+a[j];
			}
			if(sum==target){
				System.out.println("No:"+count);
				System.out.println("First number is:"+a[i]+" at place of:"+(i+1));
				System.out.println("Second number is:"+a[j]+" at place of:"+(j+1));
			count++;
			}
		}
	}
}
}

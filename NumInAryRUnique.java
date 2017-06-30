package fibonasis;
import java.util.Scanner;
public class NumInAryRUnique {
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int len=sc.nextInt();
	int a[]=new int[len];
	System.out.println("Enter the element of array");
	for(int i=0;i<len;i++){
		a[i]=sc.nextInt();
	}
	sc.close();
	int num=0;
	num=a[1]-a[0];
	int c=0;
	int count=0;
	int count1=0;
	for(int i=0;i<len-1;i++){
		c=a[i+1]-a[i];
		if(c!=num){
			count++;
			break;
		}
	}
	if(count!=0){
		System.out.println("Not unique number");
	}
	else{
		for(int i=0;i<len;i++){
			if(a[i]==i){
				System.out.println("The number "+a[i]+" are equals its index "+i);
				count1++;
			}
		}
	}
	if(count1==0){
		System.out.println("No number are unique at its index");
	}
}
}

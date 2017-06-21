import java.util.Scanner;
public class SumNumber {
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of int");
	int num=sc.nextInt();
	int a[]=new int[num];
	System.out.println("Enter the integers");
	for(int i=0;i<num;i++){
		a[i]=sc.nextInt();
	}
	int sum=0;
	for(int i=0;i<num;i++){
		sum=sum+a[i];
	}
	System.out.println("The sum of number is:"+sum);
}
}

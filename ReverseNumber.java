import java.util.Scanner;
public class ReverseNumber {
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	sc.close();
	int result=0;
	while(num>0){
		int temp=num%10;
		result=(result*10)+temp;
		num=num/10;
	}
	System.out.println("The reverse of number is:"+result);
}
}

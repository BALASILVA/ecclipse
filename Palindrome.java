import java.util.Scanner;
public class Palindrome {
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	sc.close();
	int temp1=num;
	int result=0;
	while(num>0){
		int temp=num%10;
	 result=(result*10)+temp;
	 num=num/10;
	}
	if(temp1==result){
		System.out.println("The number is palindrom");
	}
	else{
		System.out.println("The number is not palindrom");
	}
}
}

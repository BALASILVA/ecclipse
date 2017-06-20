import java.util.Scanner;
public class PrimeNumber {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		sc.close();
		if(num==1){
			System.out.println("The given number is neither prime nor composite");
		}
		else{
		int count=0;
		int temp1;
		int temp2;
		temp1=num/2;
		for(int i=2;i<=temp1;i++){
			temp2=num%i;
			if(temp2==0){
			count=count+1;
			}
		}
		if(count>=1){
			System.out.println("The given number is not prime number");
		}
		else
		{
			System.out.println("The given number is prime number");
		}
	}

}
}
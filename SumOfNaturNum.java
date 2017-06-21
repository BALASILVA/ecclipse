import java.util.Scanner;
public class SumOfNaturNum {
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the uypper limit");
	int limit=sc.nextInt();
sc.close();
int sum=0;
for(int i=1;i<=limit;i++){
	sum=sum+i;
}
System.out.println("The sum of number N natural number is:"+sum);
}
}

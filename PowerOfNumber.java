package fibonasis;
import java.util.Scanner;
public class PowerOfNumber {
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number and power resp;ectivly");
int num=sc.nextInt();
int pow=sc.nextInt();
sc.close();
int result=1;
for(int i=0;i<pow;i++){
	result=result*num;
}
System.out.println("THe power of number is"+result);
}
}

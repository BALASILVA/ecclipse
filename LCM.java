package fibonasis;
import java.util.Scanner;
public class LCM {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
System.out.println("Enter the two numbegrs");
int num1=sc.nextInt();
int num2=sc.nextInt();
sc.close();
int max=0;
int min=0;
if(num1>num2){
	max=num1;
	min=num2;
}
else{
	max=num2;
	max=num1;
}
for(int i=1;i<=min;i++){
	int x=max*i;
	if(x%min==0){
		System.out.println("LCM is "+x);
	break;
	}
}
}
}
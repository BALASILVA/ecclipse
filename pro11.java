package fibonasis;
import java.util.Scanner;
public class pro11 {
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of num of student");
	int n=sc.nextInt();
	int day=(2*n)-1;
	System.out.println("Enter the studen name");
	String[] name=new String[n];
	for(int i=0;i<n;i++){
		name[i]=sc.next();
	}
	int count=0;
	for(int i=0;i<n-1;i++){
		for(int j=i+1;j<n;j++){
			if(count<day){
			System.out.println("Pair"+(count+1)+": "+name[i]+" and "+name[j]);
			count++;
			}
		}
	}
}
}

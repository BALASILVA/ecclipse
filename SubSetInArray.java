package fibonasis;
import java.util.Scanner;
public class SubSetInArray {
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter thr length of a1");
	int l1=sc.nextInt();
	System.out.println("Enter the element of a1");
	int a1[]=new int[l1];
	for(int i=0;i<l1;i++){
		a1[i]=sc.nextInt();
	}
	System.out.println("Enter the length of a2");
	int l2=sc.nextInt();
	int a2[]=new int[l2];
	for(int i=0;i<l2;i++){
		a2[i]=sc.nextInt();
	}
	sc.close();
	int count=0;
	for(int i=0;i<l1;i++){
		for(int j=0;j<l2;j++){
			if(a1[i]==a2[j]){
				count++;
				break;
			}
		}
	}
	if((count==l1)||(count>l1)){
		System.out.println("a1 is subset of a2");
	}
	else{
		System.out.println("a1 is not subset of a2");
	}
}
}

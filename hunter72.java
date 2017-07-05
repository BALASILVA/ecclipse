package fibonasis;
import java.util.Scanner;
public class hunter72 {
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the sentence");
	String str=sc.nextLine();
	String[] arr = str.split(" ");    
	
	for(int i=0;i<arr.length;i++){
		String temp;
		if(i%2==0){
			temp=arr[i];
			StringBuffer sb=new StringBuffer(temp);
			sb.reverse();
			System.out.print(sb);
		}
		else{
			System.out.print(arr[i]);
		}
		System.out.print(" ");
	}
	
	
}
}

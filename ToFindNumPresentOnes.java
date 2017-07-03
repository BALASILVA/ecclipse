package fibonasis;
import java.util.Scanner;
public class ToFindNumPresentOnes {
	public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array");
int len=sc.nextInt();
int arr[]=new int[len];
int count[]=new int[len];
System.out.println("Enter the elements of array");
for(int i=0;i<len;i++){
	arr[i]=sc.nextInt();
}
		for(int i=0;i<len;i++){
		for(int j=0;j<len;j++){
			if(i!=j){
			if(arr[i]==arr[j]){
				count[i]++;
			}
		}
		}
		}
		for(int i=0;i<len;i++){
			if(count[i]==0){
			System.out.println(arr[i]);
			}
		}
	}
}

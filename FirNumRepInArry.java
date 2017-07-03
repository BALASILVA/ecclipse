package fibonasis;
import java.util.Scanner;
public class FirNumRepInArry {
public static void main(String[]args){
	System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	int len=sc.nextInt();
	int arr[]=new int[len];
	int rep[]=new int[len];
	for(int i=0;i<len;i++){
		arr[i]=sc.nextInt();
	}
	int h=0;
	for(int i=1;i<len;i++){
		for(int g=i-1;g>=0;g--){
				if(arr[i]== arr[g]){
				rep[h]=arr[g];
				h++;
			}
		}
	}
	System.out.println(rep[0]);
	}
}


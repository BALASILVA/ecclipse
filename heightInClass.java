package fibonasis;
import java.util.Scanner;
public class heightInClass {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 50 studens heigth");
		int arr[]=new int[50];
		for(int i=0;i<50;i++){
			arr[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=0;i<49;i++){
			for(int j=i+1;j<50;j++){
			if(arr[i]>arr[j]){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			}
		}
			for(int i=0;i<50;i++){
			System.out.println(arr[i]);
		}
			System.out.println("The fourth talest height is:"+arr[46]);
			System.out.println("Enter the talest sudent position to be want");
			int num=sc.nextInt();
			sc.close();
			System.out.println("The "+num+"th talest persons height is "+arr[num]);
	}
	}
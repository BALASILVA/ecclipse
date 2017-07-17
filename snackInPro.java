package guvipro;
import java.util.Scanner;
public class snackInPro {
public static void main(String[]args){
	System.out.println("Enter the number for creat");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	char a[][]=new char[num][num];
	for(int i=0;i<num;i++){
	a[i][0]='*';
	a[i][num-1]='*';
	}
		for(int j=0;j<num;j++){
		a[0][j]='*';
		a[num-1][j]='*';
		}
		for(int i=0;i<num;i++){
			for(int j=0;j<num;j++){
				if(a[i][j]=='*'){
				System.out.print(a[i][j]+" ");
				}
				else {
					System.out.print("  ");
				}
			}
				System.out.println();
		}
}
}


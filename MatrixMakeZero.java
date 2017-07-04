package fibonasis;
import java.util.Scanner;
public class MatrixMakeZero {
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of row");
	int r=sc.nextInt();
	System.out.println("Enter the number of column");
	int c=sc.nextInt();
	int a[][]=new int[r][c];
	System.out.println("Enter the elements of matrix");
	for(int i=0;i<r;i++){
		for(int j=0;j<c;j++){
			a[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<r;i++){
			if(a[i][0]==0&&a[i][r-1]==0){
				for(int k=0;k<c;k++){
					a[i][k]=0;
				}
			}
	}
	for(int i=0;i<r;i++){
		if(a[0][i]==0&&a[r-1][i]==0){
			for(int k=0;k<c;k++){
				a[k][i]=0;
			}
		}
}
	
	for(int i=0;i<r;i++){
		for(int j=0;j<c;j++){
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
}
}

package fibonasis;
import java.util.Scanner;
public class LarNumPasibleInConcadation {
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of numbers");
	int len=sc.nextInt();
	int arr[]=new int[len];
	for(int i=0;i<len;i++){
		arr[i]=sc.nextInt();
	}
	int tm;
	for(int i=0;i<len-1;i++){
		for(int j=i+1;j<len;j++){
			if(arr[i]<arr[j]){
			tm=arr[i];
			arr[i]=arr[j];
			arr[j]=tm;
			}
		}
	}
	String arrs[]=new String[len];
	sc.close();
	String num=null;
	for(int i=0;i<len;i++){
		num=String.valueOf(arr[i]);
		arrs[i]=num;
	}
	String temp=null;
	for(int i=0;i<len-1;i++){
		for(int j=i+1;j<len;j++){
		int temp1=arrs[i].charAt(0);
		int temp2=arrs[j].charAt(0);
		if(temp1<temp2){
			temp=arrs[i];
			arrs[i]=arrs[j];
			arrs[j]=temp;
			}
		}
	}
	String con="";
	for(int i=0;i<len;i++){
		con=con+arrs[i];
	}
	System.out.println(con);
	int l=con.length();
	int r=l%3;
	int rr=l/3;
	String result=con.substring(0,r);
	System.out.println(result);
	if(r!=0){
	for(int i=0;i<rr;i++){
		result=result+","+con.substring(r,r+3);
		r=r+3;
	}
	}
	else{
		for(int i=0;i<rr;i++){
			result=result+con.substring(r,r+3);
			if(i<rr-1){
				result=result+",";
			}
			else{
				result=result+".";
				break;
			}
			r=r+3;
		}
	}
	System.out.println(result);
}
}

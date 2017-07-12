package guviHunter;
import java.util.*;
public class Hunter127 {
public static void main(String[]args){
	int a[]={1,2,3,4,5,6,7,12,23,34,54,56,2,1,43,56,87,43,23,86,23,4,23,6543};
	int sum=0;
	System.out.println("BY ADDING TWO ELEMENT");
	System.out.println("OUTPUT1");
	for(int i=0;i<a.length-1;i++){
		sum=a[i]+a[i+1];
		if(sum%10==3){
		System.out.println("SUM OF a["+i+"] and a["+(i+1)+"] :"+sum);
	}
	}
	int sum1=a[0];
	System.out.println("BY ADDING ONE BY ONE UP TO N");
	System.out.println("OUTPUT2");
	for(int i=1;i<a.length;i++){
		sum1=sum1+a[i];
		if(sum1%10==3){
			System.out.println("sum of number between a[0] to a["+i+"] :"+sum1);
		}
	}
}
}

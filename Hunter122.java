package guviHunter;
import java.util.*;
public class Hunter122 {
public static void main(String[]args){
	int a[]={1,3,4,5,0,8,0};
	int len=a.length;
	for(int i=1;i<len-1;i++){
		int sum1=0;
	for(int j=0;j<i;j++){
		sum1=sum1+a[j];
	}
	int sum2=0;
	for(int k=i+1;k<len;k++){
		sum2=sum2+a[k];
	}
	if(sum1==sum2){
		System.out.println("The prefix sum is:"+sum1+"; The prefix sum is"+sum2);
		System.out.println("The Posion is"+(i+1));
	}
	}
}
}

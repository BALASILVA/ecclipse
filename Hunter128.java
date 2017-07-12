package guviHunter;
import java.util.*;
public class Hunter128 {
public static void main(String[]args){
	int a[]={1,2,3,4,5,6,7,8,9};
	int len=a.length;
	int l=0;
	int lmin=0;
	int lmax=0;
	if(len%2==0){
		l=len/2;
		lmin=l;
		lmax=l;
	}
	else{
		l=(len/2)+1;
		lmax=l;
		lmin=l-1;
	}
	int temp;
	for(int i=0;i<len-1;i++){
		for(int j=i+1;j<len;j++){
			if(a[i]<a[j]){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	
	System.out.println(len);
	System.out.println(lmin+" "+lmax);
	int min[]=new int[lmin];
	int max[]=new int[lmax];
	for(int i=0;i<lmax;i++){
		max[i]=a[i];
	}
	int g=0;
	System.out.println(a[lmax]);
	for(int i=len-1;i>=l;i--){
		min[g]=a[i];
		g++;
	}
	for(int i=0;i<lmax;i++){
		System.out.print(max[i]);
		if(i<lmin){
		System.out.print(min[i]);
		}
	}
}
}

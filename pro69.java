package guviPro;
import java.util.*;
public class pro69 {
public static void main(String[]args){
	String ip="34$#2a3";
	int sum1;
	int sum2;
	int sum3;
	int sum4;//output
	int len=ip.length();
	int a[]=new int[len];
	int g=0;
	for(int i=0;i<len;i++){
		if((int)ip.charAt(i)>=48&&(int)ip.charAt(i)<=57){
			a[g]=Character.getNumericValue( ip.charAt(i));
			g++;
		}
	}
	
	
	//find sum1
	int max=0;
	for(int i=0;i<g;i++){
		if(a[i]>max){
			max=a[i];
		}
	}
	sum1=0;
	for(int i=0;i<g;i++){
		sum1=sum1+(max*a[i]);
	}
	while(sum1>9){
		int s=sum1;
		int rem;
		int k=0;
		while(s>0){
		rem=s%10;
		k=k+rem;
		s=s/10;
	}
		sum1=k;
	}
	//find sum2
	int min=max;
	for(int i=0;i<g;i++){
		if(a[i]<min){
			min=a[i];
		}
	}
	sum2=0;
	for(int i=0;i<g;i++){
		sum2=sum2+(min*a[i]);
	}
	sum3=Math.min(sum1,sum2);
	sum4=1;
	for(int i=0;i<2;i++){
		sum4=sum4*sum3;
	}
	System.out.println(sum4);
}
}

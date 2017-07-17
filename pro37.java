package guvipro;
import java.util.*;
public class pro37 {
public static void main(String[]args){
	int []pr=new int[100];
	Set ls=new TreeSet();
	int g=0;
	for(int i=2;i<=100;i++){
		int l=i/2;
		int count=0;
		for(int j=2;j<=l;j++){
			if(i%j==0){
				count++;
			}
		}
		if(count==0){
			pr[g]=i;
			g++;
			System.out.println(i);
		}
	}
	int h=0;
	for(int i=0;i<g;i++){		
		for(int j=0;j<g;j++){
			if(i!=j){
			int sum=0;
			sum=pr[i]+pr[j];
			int y=sum/2;
			int count1=0;
			for(int k=2;k<y;k++){
				if(sum%k==0){
					count1++;
				}
			}
			if(count1==0){
				ls.add(sum);
			}
			}
		}
	}
	Iterator itr=ls.iterator();
	while(itr.hasNext()){
	System.out.println(itr.next());
	}
}
}

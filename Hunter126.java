package guviHunter;
import java.util.*;
public class Hunter126 {
public static void main(String[]args){
	String num="1235432123";
	int a[]=new int[123];
	for(int i=0;i<num.length();i++){
		int n=num.charAt(i);
		a[n]++;
	}
	for(int i=48;i<58;i++){
		if(a[i]!=0){
			System.out.println((char)i+" Repeated for "+a[i]);
		}
	}
}
}


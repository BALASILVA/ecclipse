package pro;
import java.util.*;
public class pro153 {
public static void main(String[] args) {
	String input="The five boxing wizards jump quickly.";
	String ip=input.toUpperCase();
	int a[]=new int[130];
	for(int i=0;i<input.length();i++){
		int let=(int)ip.charAt(i);
		a[let]++;
	}
	int count=0;
	for(int i=65;i<=90;i++){
		if(a[i]==0){
			count++;
		}
	}
	if(count==0){
		System.out.println("The given string is panagram.");
	}
	else{
		System.out.println("The given string is not panagram.");
	}
}
}

package pro;
import java.util.*;
public class Pro69 {
public static void main(String[]args){
	String str1="Rajiv";
	String str2="Roy";
	String pin="560037";
	int n=6;
	int len1=str1.length();
	int len2=str2.length();
	String longString=null;
	String shortString=null;
	if(len1==len2){
		for(int i=0;i<len1;i++){
			if(str1.charAt(i)==str2.charAt(i)){
				
			}
			else if((int)str1.charAt(i)>(int)str2.charAt(i)){
				longString=str1;
				shortString=str2;
				break;
			}
			else{
				longString=str2;
				shortString=str1;
			}
		}
	}
	else if(len1>len2){
		longString=str1;
		shortString=str2;
	}
	else{
		longString=str2;
		shortString=str1;
	}
	char op1=longString.charAt(0);
	String op2=shortString;
	char op3;
	char op4;
	op3=pin.charAt(n-1);
	int l=pin.length()-n;
	op4=pin.charAt(l);
	System.out.println(op1+op2+op3+op4);	
}
}

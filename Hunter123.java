package guviHunter;
import java.util.*;
public class Hunter123 {
public static void main(String[]args){
	String str="Engineering";
	int len=str.length();
	char [] ch=new char[len];
	for(int i=0;i<len;i++){
		ch[i]=str.charAt(i);
	}
	int count=len;
	for(int i=0;i<len-1;i++){
		for(int j=i+1;j<len;j++){
			if(ch[i]==ch[j]){
				char c=ch[i];
				ch[j]=0;
				ch[i]=0;
				for(int k=0;k<len;k++){
				if(c==ch[k]){
					ch[k]=0;
				}
				}
				}
		}
	}
	for(int i=0;i<len;i++){
			if(ch[i]!=0){
		System.out.print(ch[i]);
			}
		}
	}
}
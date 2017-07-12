package guviHunter;
import java.util.*;
public class uHunter125 {
public static void main(String[]args){
	String str="asdfmadam";
	for(int i=3;i<=str.length();i++){
		int k=i;
		for(int j=0;j<str.length()-i;j++){
			String pal=str.substring(j,k);
			int g=pal.length();
			int count=0;
			int l=g;
			for(int h=0;h<l/2;h++){
				if(pal.charAt(h)==str.charAt(g)){
					count++;
				}
				g--;
			}
			System.out.println(count+" "+i);
		}
		k++;
	}
}
}

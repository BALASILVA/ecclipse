import java.util.*;
public class Hunter129 {
public static void main(String[]args){
	String str="bal";
	int a[]=new int[str.length()];
	for(int i=0;i<str.length();i++){
		a[i]=(int)str.charAt(i);
		System.out.println((char)a[i]+" ASCII value:"+a[i]);
	}
	int sum=0;
	int temp=0;
	for(int i=0;i<a.length-1;i++){
		temp=a[i+1]-a[i];
		sum=sum+temp;
	}
	System.out.println("Result:"+sum);
}
}

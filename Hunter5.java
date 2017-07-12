package guviHunter;
import java.util.*;
import java.util.Scanner;
public class Hunter5 {
	static ArrayList ls=new ArrayList();
	static void  numberinput(int num){
		String  ip1=String.valueOf(num);
		int div;
		int res;
		int ip=num;
		int t=0;
		for(int i=0;i<ip1.length();i++){
		    res=ip%10;
			ls.add(res);
			ip=ip/10;
		}
		ip=num;
		for(int i=0;i<ip1.length();i++){
			res=ip%100;
			if(res<27){
				ls.add(res);
			}
			ip=ip/10;
		}
	}
public static void main(String[]args){
	numberinput(12345);
	Iterator it=ls.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
}
}

package pro;
import java.awt.List;
import java.util.*;
public class por18 {
public static void main(String[] args) {
	int coin1=5;
	int coin2=3;
	int coin3=1;
	int totalrupee=11;
	int a[]=new int[3];
	a[0]=totalrupee/coin1;	
    int rem=totalrupee%coin1;
	if(rem!=0){
	a[1]=rem/coin2;
	}
	rem=rem%coin2;
	if(rem!=0){
	a[2]=rem/coin3;
	}
	ArrayList ls=new ArrayList();
	ls.add(coin1);
	ls.add(coin2);
	ls.add(coin3);
	System.out.print(totalrupee+",");
	String output="";
	String op=null;
	for(int i=0;i<a.length;i++){
		if(a[i]!=0){
			op=a[i]+ " coins of " +ls.get(i)+ " and " ;
			output=op+output;
		}
	}
   output=output.substring(0,output.length()-4);
	System.out.println(output);
}
}

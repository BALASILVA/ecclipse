package Hunter;
import java.util.*;
public class hunter37 {
public static void main(String[]args){
String ip="racercar";
int len=ip.length();
int count=0;
for(int i=0;i<len;i++){	
	StringBuffer copy=new StringBuffer(ip);	
	copy.deleteCharAt(i);
	String temp=copy.toString();
	//StringBuffer temprev=copy.reverse();	
	String temprev="";
	for(int j=len-2;j>=0;j--){
		temprev=temprev+copy.charAt(j);
	}
	if(temp.equals(temprev)){
			count++;
			System.out.println("Posibility "+count+": By deleting charAt "+i);
		    System.out.println("OUTPUT"+count+":"+temp+" "+temprev);
	  }
	}
}
}

package Hunter;
import java.util.*;
public class hUNTER72 {
public static void main(String[] args) {
	String input="This is the example of the program.";
	System.out.println(input);
	input=input.substring(0,input.length()-1);
	
	String ip[]=input.split(" ");
	String op="";
	for(int i=0;i<ip.length;i++) {
		if(i%2==0){
			String str=new StringBuffer(ip[i]).reverse().toString();
	      op=op+str+" ";
		}
		else {
			op=op+ip[i]+" ";
		}
	}
	op=op.substring(0,op.length()-1);
	op=op+".";
	System.out.print(op);
}
}


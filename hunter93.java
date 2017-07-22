package Hunter;
import java.util.*;
public class hunter93 {
public static void main(String[]args) {
	String input="WelCome to GuVi";
	String[] ip=input.split(" ");
	String op="";
	for(int i=0;i<ip.length;i++){
		 String s= new StringBuilder(ip[i]).reverse().toString();
		 op=op+s+" ";
	}
	op=op.substring(0,op.length()-1);
	op=op+".";
	System.out.println(op);
}
}


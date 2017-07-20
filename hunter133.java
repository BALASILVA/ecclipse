package Hunter;
import java.util.*;
public class hunter133 {
public static void main(String[] args) {
	String input="Hello Word Is Input";
	String str []=input.split(" ");
	String output="";
	for(int i=str.length-1;i>=0;i--){
	   output=output+str[i]+" ";
	}
	output=output.substring(0,output.length()-1);
	output=output+".";
	System.out.println(output);
	
}
}

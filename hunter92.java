package exp;
import java.util.*;
public class hunter92 {
public static void main(String[] args) {
	String input ="Bala   murugan  is    good boy";
	int count = 0;
	if((int)input.charAt(0)==32){
		System.out.println("This sentence is wrong");
	}
	else{
		for(int i=0,j=0;i<input.length()-1&&j<input.length();i++,j++) {
			if((int)input.charAt(i)==32&&(int)input.charAt(j)==32) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("This is currecty sentence");
		}
		else{
			System.out.println("This is a wrong  sentence "+(count-1));
		}
	}
}	
}

package fibonasis;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class hunter28 {
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String str=sc.nextLine();
	int len=str.length();
	LinkedHashSet<Character> lhs=new LinkedHashSet<>();
	for(int i=0;i<len;i++){
		lhs.add(str.charAt(i));
	}
	for(Character ch : lhs){
		System.out.print(ch);
	}
	}
}

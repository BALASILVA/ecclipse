package fibonasis;
import java.util.Scanner;
public class reverseWords {
public static void main(String[]args){
	System.out.println("IMPORTANT TO USE PULL STOP AT END OF SENTENCE TO GET PROPER OUTPUT");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the sentence");
	String s=sc.nextLine();
	sc.close();
	String[] str=new String[100];
	int h=0;
	int l=0;
	for(int i=0;i<s.length();i++){
		if((int)s.charAt(i)==32||(int)s.charAt(i)==46){
			str[l]=s.substring(h,i);
			l++;
			h=i+1;
		}
	}
	for(int i=l-1;i>0;i--){
	System.out.print(str[i]+" ");
	}
	System.out.println(str[0]+".");
}
}

import java.util.Scanner;
public class SwapEvOdCHARinString {
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String str=sc.nextLine();
	sc.close();
	char a[]=new char[str.length()];
	int g=0;
	int h=str.length()/2;
	for(int i=0;i<str.length();i++){
		if(i%2==0){
			a[g]=str.charAt(i);
			g++;
		}
		else{
			a[h]=str.charAt(i);
			h++;
		}
	}
		for(int i=0;i<str.length();i++){
			System.out.print(a[i]);
	}
}
}

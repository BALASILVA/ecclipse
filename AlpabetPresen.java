import java.util.Scanner;
public class AlpabetPresen {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the alpabet or you may");
		String str=sc.nextLine();
		str=str.toLowerCase();
		sc.close();
		int count=0;
		for(int i=0;i<str.length();i++){
		int a=str.charAt(i);
		if(a>=97&&a<=122){
			count++;
		}
		}
			System.out.println("Num of charector present:"+count);
	}
	}



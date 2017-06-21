import java.util.Scanner;
public class countWord {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str=sc.nextLine();
		str=str.toLowerCase();
		sc.close();
		int count=1;
		int num=str.length();
		for(int i=0;i<str.length();i++){
		int a=str.charAt(i);
		if(a==32){
			count++;
		}
		}
		if(num!=0){
			System.out.println("Num of words present:"+count);
	}
		else{
			System.out.println("Please enter word");
		}
	}
}

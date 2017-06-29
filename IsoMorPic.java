import java.util.Scanner;
public class IsoMorPic {
public static void main(String[]args){
	System.out.println("Enter thre two Strings");
	Scanner sc=new Scanner(System.in);
	String str1=sc.nextLine();
	String str2=sc.nextLine();
	sc.close();
	int a[]=new int[129];
	int b[]=new int[129];
	int x[]=new int[129];
	int y[]=new int[129];
	int count1=0;
	int count2=0;
	if(str1.length()==str2.length()){
		for(int i=0;i<str1.length();i++){
			a[i]=str1.charAt(i);
		}
		for(int i=0;i<str1.length();i++){
			b[i]=str2.charAt(i);
		}
		int h=0;
		for(int i=0;i<str1.length()-1;i++){
			for(int g=i+1;g<str1.length();g++){
			if(a[i]==a[g]){
				if(h==0){
				x[h]=i;
				x[h+1]=g;
				h=h+1;
				}
				else{
					x[h+1]=g;
					h++;
				}
			}
		}
		}
	/*	for(int i=0;i<str1.length();i++)
		{
			System.out.println(x[i]);
		}*/
		System.out.println(h);
		int j=0;
		for(int i=0;i<h;i++){
			if(b[x[j]]==b[x[j+1]]){
				count1++;
			}
			j++;
		}
		count1=count1+1;
		System.out.println(count1);
		if(count1==h){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
	}
	else{
		System.out.println("False");
	}
}
}


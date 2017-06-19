import java.util.Scanner;
public class countNoDigIntSpe {
public static void main(String[]args){
String input;
Scanner sc=new Scanner(System.in);System.out.println("Enter the input");
input=sc.nextLine();
int a[]=new int[126];
int b[]=new int[126];
sc.close();
int g=0;
int num = 0;
for(int i=0;i<input.length();i++){
	int let=input.charAt(i);
	a[let]++;
	int count=0;
	for(int k=0;k<g;k++){
        if(let==b[k])
        	count++;
        }
	if(count==0){
    b[g]=let;
    g++;
	}
	}
/*for(int j=33;j<=126;j++){
	System.out.println((char)j+"===="+a[j]);
}*/
for(int i=0;i<g;i++){
 num=b[i];
System.out.println((char)num+"===="+a[num]);
}
} 
}
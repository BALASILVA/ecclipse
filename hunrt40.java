package Hunter;
import java.util.*;
public class hunrt40 {
public static void main(String[] args) {
	int a[]={111,111};
	int i=0;
	int sum=0;
while(i<a.length){
	sum+=a[i];
	i++;
}
StringBuffer buf=new StringBuffer();
buf.append("");
buf.append(sum);
String temp=buf.toString();
buf.reverse();
if(temp.equals(buf.toString())){
	System.out.println("The sum is "+sum+" and it is palindrome");
}
else{
	System.out.println("The sum is "+sum+" and it is not palindrome");
}
}
}

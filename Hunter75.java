package Hunter;
import java.util.*;
public class Hunter75 {
public static void main(String[] args) {
	int ip[]={5,3,1,6,4};
	for(int i=0;i<ip.length-1;i++) {
		if(ip[i]>ip[i+1]) {
			System.out.print(ip[i+1]+" ");
		}
		else {
			System.out.print("-1"+" ");
		}
		
	}
	System.out.print("-1");
}
}

package Hunter;
import java.util.*;
public class HUNTER80 {
public static void main(String[] args) {
	int ip[]={1234345678,012345567,13579,1234,111222333,123,456,357};
	System.out.println("The jumping elements are");
	System.out.println();
	for(int i=0;i<ip.length;i++) {
		int count=0;
		String str=String.valueOf(ip[i]);
		for(int j=0;j<str.length()-1;j++) {
			int key=Integer.parseInt(str.substring(j,j+1))-Integer.parseInt(str.substring(j+1,j+2));
			if(key!=-1&&key!=1) {
				count++;
			}
		}
		if(count==0) {
			System.out.println(ip[i]);
			System.out.println();
		}
		
	}
}
}

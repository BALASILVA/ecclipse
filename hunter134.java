package Hunter;
import java.util.*;
public class hunter134 {
public static void main(String[] args) {
	int num1=2;
	int num2=3;
	int result=num1+num2;
	int count=0;
	for(int i=2;i<result/2;i++){
		if(result/i==0){
			count++;
		}
	}
	if(count==0){
		System.out.println("The number is co-prime");
	}
	else {
		System.out.println("The number not co prime");
	}
}
}

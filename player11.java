package player;
import java.util.*;
public class player11 {
public static void main(String[]args){
	String a[]=new String[8];
a[1]="sun";
a[2]="mon";
a[3]="tue";
a[4]="wed";
a[5]="thr";
a[6]="fri";
a[7]="sat";
for(int i=1;i<8;i++){
	String day=a[i].toUpperCase();
	if(day.charAt(0)=='S'&&day.charAt(1)=='U'){
		System.out.println(a[i]+":false");
	}
	else{
		System.out.println(a[i]+":true");
	}
}
}
}

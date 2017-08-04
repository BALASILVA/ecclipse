package pro;
import java.util.*;
public class pro60 {
public static void main(String[] args) {
	int time = 1 ;
	int inputtime=21;
	int startTimeGiven =3;
	int temp=startTimeGiven;
	if(inputtime==1) {
		System.out.println("The out time for 1: 3");
	}
	else {
	for(int i=time;i<inputtime;i++) {		
		if(temp==1) {
			temp=startTimeGiven*2;
			startTimeGiven=temp;
		}
		else {
			temp--;
		}
		//System.out.println("The out time for "+(i+1)+": "+temp);

	}	
	System.out.println("The out time for "+inputtime+": "+temp);
	}
}
}

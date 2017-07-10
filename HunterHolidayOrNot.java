import java.util.*;
public class HunterHolidayOrNot {
public static void main(String[]args){
	String day[]={"mun","sun","Fri"};
	String day1[]=new String[day.length];
	char[]ch=new char[day.length];
	for(int i=0;i<day.length;i++){
	day1[i]=day[i].toUpperCase();
	ch[i]=day1[i].charAt(0);
	}
	for(int i=0;i<day.length;i++){
	if(ch[i]=='S'){
		System.out.println(day[i]+": False");
	}
	else{
		System.out.println(day[i]+": True");
	}
	}
}
}

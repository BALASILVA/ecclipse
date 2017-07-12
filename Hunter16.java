package guviHunter;
import java.util.*;
public class Hunter16 {
	static ArrayList<Hunter16> ls=new ArrayList();
	int i;
	String string;
public Hunter16(int i, String string) {
		this.i=i;
		this.string=string;
	}
public Hunter16() {
}
private void add(Hunter16 h) {
	ls.add(h);
}
private static void printFrinde(int no){
	int count=0;
	for(Hunter16 h:ls){
		
		int k=h.i-no;
		if(count<3&&k<4&&k>-4&&k!=0){
		System.out.println("Person number:"+h.i+" name of friend:"+h.string);
		count++;
		}
	}
}
public static void main(String[]args){
	Hunter16 h=new Hunter16();
	Hunter16 h1=new Hunter16(1,"Bala1");
	Hunter16 h2=new Hunter16(2,"Bala2");
	Hunter16 h3=new Hunter16(3,"Bala3");
	Hunter16 h4=new Hunter16(4,"Bala4");
	Hunter16 h5=new Hunter16(5,"Bala5");
	Hunter16 h6=new Hunter16(6,"Bala6");
	Hunter16 h7=new Hunter16(7,"Bala7");
	h.add(h1);
	h.add(h2);
	h.add(h3);
	h.add(h4);
	h.add(h5);
	h.add(h6);
	h.add(h7);
	printFrinde(3);
}
}
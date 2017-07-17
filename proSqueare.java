package guvipro;

public class proSqueare {
public static void main(String[]args){
	int x1=10;
	int y1=10;
	int x2=20;
	int y2=10;
	int x3=20;
	int y3=20;
	int x4=10;
	int y4=20;
	if(((x2-x1)==(x3-x4))&&((y4-y1)==(y3-y2))){
		System.out.println("its a square");
	}
	else {
		System.out.println("Not square");
	}
}
}

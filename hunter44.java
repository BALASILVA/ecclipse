package Hunter;

public class hunter44 {
public static void main(String[]args){
	int num=6;
	int count=0;
	int i=0;
	String is="";
	while(count!=num){
		is=""+i;		
		if(is.matches("^[3-4]+$")){
			count++;
		}
		i++;
	}
	System.out.println(is);
}
}

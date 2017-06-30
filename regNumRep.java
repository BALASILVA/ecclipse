package fibonasis;
import java.util.Scanner;
public class regNumRep {
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of register number");
	int num=sc.nextInt();
	int reg[]=new int[num];
	for(int i=0;i<num;i++){
		reg[i]=sc.nextInt();
	}
	sc.close();
	int g=0;
	int r[]=new int[num];
	for(int i=0;i<num-1;i++){
		for(int j=i+1;j<num;j++){
			int count=0;
		if(reg[i]==reg[j]){
			for(int k=0;k<g;k++){
				if(r[k]==reg[i]){
					count++;
				}
			}
			if(count==0){
			r[g]=reg[i];
			g++;
			}
			}
		}
	}
	int rtime[]=new int[g];
	for(int i=0;i<g;i++){
		for(int j=0;j<num;j++){
			if(r[i]==reg[j]){
				rtime[i]++;
			}
		}
	}
	for(int i=0;i<g;i++){
		System.out.println("Registor number "+r[i]+" repeated for "+rtime[i]+" times.");
	}
}
}

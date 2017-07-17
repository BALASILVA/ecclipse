package Hunter;
import java.util.*;
public class hunter42 {
public static void main(String[] args) {
	String input="balamurugans";
	String serch="balamur";
	int len=input.length();
	int ll=1;
	int i=1;
	int j=1;
	while(ll<input.length()){
		ll=j*i;
		i++;
		j++;
	}
	int l=i;
	int g=0;
	char ch[][]=new char[l][l];
	for(i=0;i<l;i++){
		for(j=0;j<l;j++){
			if(g<input.length()){
		ch[i][j]=input.charAt(g);
		g++;
			}
		}
	}
	//searching
	int slen=serch.length();
	int brk=1;
	int c=0;
	for(i=0;i<l;i++){
		for(j=0;j<l;j++){	
			
			int ii=i;
			int jj=j;	
			int yy=0;int y=0;
		for( y=ii;y<len;y++){
			int count=0;
			int gg=0;
			for( yy=0;yy<len;yy++){	
				if(brk==1){
				//System.out.println(ch[y][yy]+" "+serch.charAt(gg));
				if(gg<slen){	
					if(y<l&&yy<l){
			if(ch[y][yy]==serch.charAt(gg)){
	
			}
			else{
				count++;
			}
					}
			gg++;
			if(count==0&&gg==slen){
				y=(yy/l)+c;
				yy=(yy%l)+c;
				System.out.println("Starting index: "+ii+" and "+jj);
				System.out.println("Ending index: "+y+" and "+yy);
			     brk=10;
			}
				}
				else{
					
					break;
				}
			
			}
			}
		}
		
	}
		}
	}
	
}


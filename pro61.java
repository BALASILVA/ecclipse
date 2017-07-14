package pro;
public class pro61 {
public static void main(String []args){
	String input="code";
	String input2="Kata";
	int len2=input2.length();
	String ip=input.toUpperCase();
	String ip2=input2.toUpperCase();
	char a[]=new char[28];
	int g=65;
	for(int i=1;i<27;i++){
		a[i]=(char)g;
		g++;
	}
	int key=0;
	int key1=0;
	int key2=0;
	for(int i=1;i<27;i++){
	if(a[i]==ip2.charAt(0)){
	key1=i;
	break;
	}
	}
	for(int j=1;j<27;j++){
		if(a[j]==ip2.charAt(len2-1)){
			key2=j;
			break;
			}
		}
	key=key1-key2;
	if(key<27){
		key=key;
	}
	else{
		key=key-26;
	}
	int k=0;
	System.out.print("Otuput1:");
	for(int i=0;i<input.length();i++){
		for(int j=1;j<27;j++){
		if(ip.charAt(i)==a[j]){
			k=j+key;
			break;
		}
		}
		if(k<27){
			k=k;
		}
		else{
			k=k-26;
		}
		if(input.charAt(i)<91){
			System.out.println(a[k]);
		}
		else{
			int y=(int)a[k];
			y=y+32;
			System.out.print((char)y);
		}
	}
	System.out.println();
	System.out.print("Output2:"+input2.charAt(0));
	for(int i=1;i<input.length()-1;i++){
		for(int j=1;j<27;j++){
		if(ip2.charAt(i)==a[j]){
			k=j+key;
			break;
		}
		}
		if(k<27){
			k=k;
		}
		else{
			k=k-26;
		}
		if(input2.charAt(i)<91){
			System.out.println(a[k]);
		}
		else{
			int y=(int)a[k];
			y=y+32;
			System.out.print((char)y);
		}
	}
	System.out.print(input2.charAt(len2-1));
	
}
}


public class PrimeBetween {
public static void main(String args[]){
	int up=15;
	int low=123;
	for(int k=up;k<=low;k++){
	int count=0;
	for(int i=2;i<=k/2;i++){
		int temp2=k%i;
		if(temp2==0){
			count=count+1;
		}
	}
	if(count==0){
		System.out.println(k);
	}
}
}
}
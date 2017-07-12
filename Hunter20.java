package guviHunter;
public class Hunter20 {
public static void main(String []args){
	int num[]={1,232};
	int[]a=new int[num[1]];
for(int i=num[0];i<num[1];i++){	
	String k=Integer.toBinaryString(i);
	a[i]=Integer.parseInt(k);
}
for(int i=0;i<a.length;i++){
	int count=0;
	int rem=0;
	int temp=a[i];
	for(int j=0;j<String.valueOf(a[i]).length();j++){
		rem=temp%10;
		if(rem==1){
		count++;
		}
		temp=temp/10;
	}
	int prime=0;
	int temp2=count/2;
	for(int t=2;t<=temp2;t++){
		if(count%t==0){
			prime++;
		}
	}
	if(prime==0){
		System.out.println(i+" binary  value:"+(a[i])+" number of 1 bits(prime):"+count);
	}
}
}
}
package pro;
import java.util.*;
public class pro25 {
	public static void main(String[]args){ 
		List ls=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of k");
		int k=sc.nextInt();
		int i=0;
		String bNu=null;
		int bNum=0;
		int count=0;
		while(count<k){
			count=0;
			bNu=Integer.toBinaryString(i);
			bNum=Integer.parseInt(bNu);
			int len=bNu.length();
			System.out.println(bNum);
			int temp=bNum;
			for(int j=0;j<len;j++){
				if(temp%10==1){
					count++;
					temp=temp/10;
				}
			}
			if(count<k){
				ls.add(bNum);
				}
			i++;
		}
		System.out.println(ls);
	}
	}

	
	


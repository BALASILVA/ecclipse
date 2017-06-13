import java.util.Scanner;


public class MaxMinOfArray {
	public static void main(String[]args){
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num of digits");
		int num=sc.nextInt();
		int set[]=new int[100];
		System.out.println("Enter the numbers");
		for(int i=0;i<num;i++){
			set[i]=sc.nextInt();
		}
		sc.close();
		int max=0;
		for(int i=0;i<num;i++){
			if(set[i]>max){
				max=set[i];
			}
			}
		System.out.println("The max number is "+max);
		int min=0;
		for(int i=0;i<num;i++){
			if(set[i]<max){
				 min=set[i];
			}
		}
			System.out.println("The min number is:"+min);
		}
	}
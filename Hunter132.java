package guviHunter;
import java.util.*;
public class Hunter132 {
public static void main(String[]args){
	int number=4;
	int row=number;
	for(int k=0;k<row;k++){
	for(int i=0;i<2;i++){
		for(int j=0;j<number;j++){
			System.out.print("*");
		}
		System.out.print(" ");
	}
	System.out.println();
	number--;
	}
}
}

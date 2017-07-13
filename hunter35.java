package Hunter;

public class hunter35 {
	public static void main(String[]args){
		String ip="Bala";
		int len=ip.length();
		if(len==1){
			System.out.println("No idea in question (Niter double or not)");
				}
		else{
		int half=len/2;
		String op1="";
		String op2="";
		for(int i=0;i<half;i++){
			op1=op1+ip.charAt(i);
		}
		for(int i=half;i<len;i++){
			op2=op2+ip.charAt(i);
			}
		if(op1.equals(op2)){
			System.out.println("Double string");
		}
		else{
			System.out.println("Not double string");
		}
		}
	}
}

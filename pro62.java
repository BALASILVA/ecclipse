package pro;
public class pro62{
	public static void main(String args[]){
		userMethod("abcdmalayalamds");
		}
public  static void userMethod(String str) {
        char[]input=str.toCharArray();
        int f=0;
        int l=0;
        for (int mid=0;mid<input.length;mid++){           
            int left=mid-1;
            int right=mid+1;            
            while (left>=0&&right<input.length){               
                if (input[left]==input[right]){                   
                    if(right-left>l-f){
                        f=left;
                        l=right;
                    }
                }
                else
                    break;
                left--;
                right++;
            }           
            left=mid;
            right=mid+1;
            while(left>=0&&right<input.length)
            {
                if(input[left]==input[right]){
                    if (right-left >l-f){
                        f=left;
                        l=right;
                    }
                }
                else
                    break;
                left--;
                right++;
            }
        }        
        System.out.println(str.substring(f,l+1));
           }


}
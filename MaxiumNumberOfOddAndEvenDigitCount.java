import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    int oc=0,ec=0;
	    for(int i=0;i<str.length();i++){
	        if(Character.getNumericValue(str.charAt(i))%2==0){
	            ec++;
	        }
	        else{
	            oc++;
	        }
	    }
	    if(ec>oc){
	        		System.out.println(ec);

	    }
	    else{
		System.out.println(oc);
	    }
	}
}

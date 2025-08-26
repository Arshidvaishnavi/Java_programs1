import java.util.*;
public class Wordformation
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		String sorted = new String(ch);
		if(sorted.equals("act")){
		    System.out.println("Yes");
		}else{
		    System.out.println("No");
		}
	}
}
